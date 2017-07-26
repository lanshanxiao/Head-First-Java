import java.util.*;

public class DotComBust{
	private GameHelper helper = new GameHelper();//接收用户输入位置信息
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();//存储3个DotCom对象的数组
	private int numOfGuesses = 0;//用户猜测次数
	
	private void setUpGame(){
		
		//first make some dot coms and give them locations
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		
		//创建3个DotCom对象并指派名称，加入ArrayList中
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		//列出简短的提示信息
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		//将随机产生的3个DotCom位置分别传入DotCom中
		for(DotCom dotComToSet : dotComsList){
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying(){//开始游戏
		while(!dotComsList.isEmpty()){//dotComsList中没有DotCom对象，说明DotCom全部击沉
			String userGuess = helper.getUserInput("Enter a guess");//获取用户猜测的数据
			checkUserGuess(userGuess);//检测输入数据并比较是否击中DotCom位置
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess){
		numOfGuesses++;//猜测次数加1
		String result = "miss";
		
		for(DotCom dotComToTest : dotComsList) {//逐一对比3个DotCom对象中的位置
			result = dotComToTest.checkYourself(userGuess);//检测其中一个DotCom对象，比较位置并返回结果
			if(result.equals("hit")) {
				break;
			}
			if(result.equals("kill")){
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		
		System.out.println(result);
	}
	
	private void finishGame(){
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if(numOfGuesses <= 18){
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		}else{
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}
	
	public static void main(String[] args){
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}