import java.util.*;

public class DotComBust{
	private GameHelper helper = new GameHelper();//�����û�����λ����Ϣ
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();//�洢3��DotCom���������
	private int numOfGuesses = 0;//�û��²����
	
	private void setUpGame(){
		
		//first make some dot coms and give them locations
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		
		//����3��DotCom����ָ�����ƣ�����ArrayList��
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		//�г���̵���ʾ��Ϣ
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		//�����������3��DotComλ�÷ֱ���DotCom��
		for(DotCom dotComToSet : dotComsList){
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying(){//��ʼ��Ϸ
		while(!dotComsList.isEmpty()){//dotComsList��û��DotCom����˵��DotComȫ������
			String userGuess = helper.getUserInput("Enter a guess");//��ȡ�û��²������
			checkUserGuess(userGuess);//����������ݲ��Ƚ��Ƿ����DotComλ��
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess){
		numOfGuesses++;//�²������1
		String result = "miss";
		
		for(DotCom dotComToTest : dotComsList) {//��һ�Ա�3��DotCom�����е�λ��
			result = dotComToTest.checkYourself(userGuess);//�������һ��DotCom���󣬱Ƚ�λ�ò����ؽ��
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