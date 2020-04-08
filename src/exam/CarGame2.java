package exam;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel2 extends JPanel implements MouseListener{
	BufferedImage img = null;
	int img_x=100, img_y=100;
	
	
	
	public MyPanel2() {
		URL url = getClass().getResource("car.gif");
		try {
			img = ImageIO.read(new File(url.getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					img_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					img_y += 10;
					break;
				case KeyEvent.VK_LEFT:
					img_x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					img_x += 10;
					break;
				}
				repaint();
				
			}
				
			

			@Override
			public void keyReleased(KeyEvent e) {}
			
		});
		//포커스 요청하기
		this.requestFocus();
		setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x,img_y,null);//이미지 삽입
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		img_x = e.getX();
		img_y = e.getY();
		repaint();
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	}
	
	
	
	//사용자가 4방향의 화살표를 클릭한 경우
	
	


public class CarGame2 extends JFrame{
	public CarGame2() {
		setTitle("자동차 움직이기");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
	}

	public static void main(String[] args) {
		CarGame2 car = new CarGame2();
		car.setVisible(true);

	}

}
