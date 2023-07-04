package Tetris;

public class main {
	
	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		BackPanel panel = new BackPanel(frame);
		
		frame.add(panel);
		frame.setVisible(true);//設定顯示
	}
}
