package Tetris;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	public GameFrame() {
		super("俄羅斯方塊");//設定標題setTitle也行
		setSize(488, 476);//設定尺寸
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//點選關閉按鈕是關閉程式
        setLocationRelativeTo(null);   //設定居中
    	setResizable(false); //不允許修改介面大小
	}
}
