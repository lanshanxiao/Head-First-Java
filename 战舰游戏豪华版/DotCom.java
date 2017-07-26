import java.util.ArrayList;

public class DotCom{
	private ArrayList<String> locationCells;//DotCom位置信息
	private String name;//DotCom名字
	
	public void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String checkYourself(String userInput){
		String result = "miss";
		
		int index = locationCells.indexOf(userInput);//判别玩家猜测值是否有出现在ArrayList中，没有的话会返回 -1。
		
		if(index >= 0){//如果索引值大于或等于0，命中
			locationCells.remove(index);//删除已经命中的格子
			
			if(locationCells.isEmpty()){//如果全部命中清空，那就表示击沉了。
				result = "kill";
				System.out.println("Ouch! You sunk " + name + " : (");
			}else{
				result = "hit";
			}
		}
		
		return result;
	}
}