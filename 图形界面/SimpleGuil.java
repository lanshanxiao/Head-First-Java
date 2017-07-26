import javax.swing.*;

public class SimpleGuil{
	public static void main(String[] args){
		JFrame frame = new JFrame();//创建窗口
		JButton button = new JButton("Click me");//创建按钮
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//这一行会在Windows是把程序结束掉
		
		frame.getContentPane().add(button);//把button加到frame的pane上
		
		frame.setSize(300, 300);//设定frame的大小
		
		frame.setVisible(true);//最后把frame显示出来
	}
}