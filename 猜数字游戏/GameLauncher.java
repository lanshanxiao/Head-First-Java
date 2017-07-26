class GuessGame {
	Player p1;
	Player p2;
	Player p3; // ��3��ʵ�������ֱ��ʾ3��Players����
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();// ������ Player����
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;// ����3�������������Ƿ����
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;// ����3������������²������
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9 ...");// �����յ�����
		
		while(true){
			System.out.println("Number to guess is " + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();// ����Player��guess����
			
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);// ȡ��ÿ��Player���²�����ֲ������г�
			
			if(guessp1 == targetNumber){
				p1isRight = true;
			}
			if(guessp2 == targetNumber){
				p2isRight = true;
			}
			if(guessp3 == targetNumber){
				p3isRight = true;
			}// ����Ƿ���У����ǲ�����ȥ�趨�Ƿ���еı���
			
			if(p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break;//��Ϸ��������ֹѭ��
			}else{
				//��û�вµ�������Ҫ������ȥ
				System.out.println("Player will have to try again.");
			}// if/else����
		}//ѭ������
	}//��������
}//�����

class Player{
	int number = 0;//Ҫ���µ�����
	
	public void guess(){
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}

public class GameLauncher{
	public static void main(String[] args){
		GuessGame game = new GuessGame();
		game.startGame();
	}
}