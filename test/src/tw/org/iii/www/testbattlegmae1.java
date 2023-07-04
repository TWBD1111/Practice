package tw.org.iii.www;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class testbattlegmae1 extends JPanel implements KeyListener {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private static final int PLAYER_WIDTH = 50;
	private static final int PLAYER_HEIGHT = 100;
	private static final int PLAYER1_X = 100;
	private static final int PLAYER2_X = WIDTH - PLAYER_WIDTH - 100;
	private static final int GROUND_Y = HEIGHT - PLAYER_HEIGHT - 50;

	private boolean player1MovingUp;
	private boolean player1MovingDown;
	private boolean player2MovingUp;
	private boolean player2MovingDown;

	private int player1Y;
	private int player2Y;

	public testbattlegmae1() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.WHITE);
		setFocusable(true);
		addKeyListener(this);

		player1Y = GROUND_Y;
		player2Y = GROUND_Y;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Draw players
		g.setColor(Color.RED);
		g.fillRect(PLAYER1_X, player1Y, PLAYER_WIDTH, PLAYER_HEIGHT);

		g.setColor(Color.BLUE);
		g.fillRect(PLAYER2_X, player2Y, PLAYER_WIDTH, PLAYER_HEIGHT);

		// Draw ground
		g.setColor(Color.BLACK);
		g.drawLine(0, GROUND_Y, WIDTH, GROUND_Y);
	}

	public void update() {
		// Update player positions based on movement
		if (player1MovingUp && player1Y > 0) {
			player1Y -= 5;
		}
		if (player1MovingDown && player1Y < GROUND_Y) {
			player1Y += 5;
		}
		if (player2MovingUp && player2Y > 0) {
			player2Y -= 5;
		}
		if (player2MovingDown && player2Y < GROUND_Y) {
			player2Y += 5;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Handle key presses
		int keyCode = e.getKeyCode();

		if (keyCode == KeyEvent.VK_W) {
			player1MovingUp = true;
		} else if (keyCode == KeyEvent.VK_S) {
			player1MovingDown = true;
		} else if (keyCode == KeyEvent.VK_UP) {
			player2MovingUp = true;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			player2MovingDown = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Handle key releases
		int keyCode = e.getKeyCode();

		if (keyCode == KeyEvent.VK_W) {
			player1MovingUp = false;
		} else if (keyCode == KeyEvent.VK_S) {
			player1MovingDown = false;
		} else if (keyCode == KeyEvent.VK_UP) {
			player2MovingUp = false;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			player2MovingDown = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Not used
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Fighting Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		testbattlegmae1 game = new testbattlegmae1();
		frame.getContentPane().add(game);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		// Game loop
		while (true) {
			game.update();
			game.repaint();

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
