import java.util.ArrayList;

public class DotCom{
	private ArrayList<String> locationCells;//DotComλ����Ϣ
	private String name;//DotCom����
	
	public void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String checkYourself(String userInput){
		String result = "miss";
		
		int index = locationCells.indexOf(userInput);//�б���Ҳ²�ֵ�Ƿ��г�����ArrayList�У�û�еĻ��᷵�� -1��
		
		if(index >= 0){//�������ֵ���ڻ����0������
			locationCells.remove(index);//ɾ���Ѿ����еĸ���
			
			if(locationCells.isEmpty()){//���ȫ��������գ��Ǿͱ�ʾ�����ˡ�
				result = "kill";
				System.out.println("Ouch! You sunk " + name + " : (");
			}else{
				result = "hit";
			}
		}
		
		return result;
	}
}