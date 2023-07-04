package Tetris;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class BackPanel extends JPanel implements ActionListener {
	BackPanel panel = this;
	private JFrame mainFrame = null;
	JMenuBar jmb = null;

	// 構造裡面初始化相關引數
	public BackPanel(JFrame frame) {
		this.setLayout(null);
		this.setOpaque(false);
		this.mainFrame = frame;
		mainFrame.setVisible(true);
		initMenu();
	}

	private void initMenu() {
		// 建立選單及選單選項
		jmb = new JMenuBar();
		JMenu jm1 = new JMenu("遊戲");
		jm1.setFont(new Font("標楷體", Font.BOLD, 15));// 設定選單顯示的字型
		JMenu jm2 = new JMenu("幫助");
		jm2.setFont(new Font("標楷體", Font.BOLD, 15));// 設定選單顯示的字型

		JMenuItem jmi1 = new JMenuItem("開始新遊戲");
		JMenuItem jmi2 = new JMenuItem("退出");
		jmi1.setFont(new Font("標楷體", Font.BOLD, 15));
		jmi2.setFont(new Font("標楷體", Font.BOLD, 15));

		JMenuItem jmi3 = new JMenuItem("操作說明");
		jmi3.setFont(new Font("標楷體", Font.BOLD, 15));
		JMenuItem jmi4 = new JMenuItem("失敗判定");
		jmi4.setFont(new Font("標楷體", Font.BOLD, 15));

		jm1.add(jmi1);
		jm1.add(jmi2);

		jm2.add(jmi3);
		jm2.add(jmi4);

		jmb.add(jm1);
		jmb.add(jm2);
		mainFrame.setJMenuBar(jmb);// 選單Bar放到JFrame上
		jmi1.addActionListener(this);
		jmi1.setActionCommand("Restart");
		jmi2.addActionListener(this);
		jmi2.setActionCommand("Exit");

		jmi3.addActionListener(this);
		jmi3.setActionCommand("help");
		jmi4.addActionListener(this);
		jmi4.setActionCommand("lost");
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println(command);
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("標楷體", Font.ITALIC, 18)));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("標楷體", Font.ITALIC, 18)));
		if ("Exit".equals(command)) {
			Object[] options = { "確定", "取消" };
			int response = JOptionPane.showOptionDialog(this, "您確定要退出嗎", "", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(response==0) {
				System.exit(0);
			}
		
		}else if("Restart".equals(command)) {			
		}
	}
}