import javax.swing.*;

public class SimpleGuil{
	public static void main(String[] args){
		JFrame frame = new JFrame();//��������
		JButton button = new JButton("Click me");//������ť
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//��һ�л���Windows�ǰѳ��������
		
		frame.getContentPane().add(button);//��button�ӵ�frame��pane��
		
		frame.setSize(300, 300);//�趨frame�Ĵ�С
		
		frame.setVisible(true);//����frame��ʾ����
	}
}