class SimpleDotComGame {
	public static void main(String[] args){
		int numOfGuesses = 0;//��¼��Ҳ²����
		
		GameHelper helper = new GameHelper();//����ȡ����ҵ�����
		
		SimpleDotCom theDotCom = new SimpleDotCom();//����dot com����
		int randomNum = (int) (Math.random() * 5);//�������������һ���λ�ã�Ȼ���Դ�����������
		
		int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		
		theDotCom.setLocationCells(locations);//��ֵλ��
		boolean isAlive = true;//��������¼��Ϸ�Ƿ�������е�boolean�������������whileѭ���С�
		
		while(isAlive == true){
			String guess = helper.getUserInput("enter a number: ");//ȡ�����������ַ���
			String result = theDotCom.checkYourself(guess);//�����ҵĲ²Ⲣ������洢��String��
			numOfGuesses++;
			if(result.equals("kill")){//�Ƿ�����������������趨isAliveΪfalse����ӡ���²����
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}