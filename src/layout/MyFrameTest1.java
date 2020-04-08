package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrameTest1 extends JFrame {
	public MyFrameTest1() {
		setTitle("MyFrame");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel totalPane = new JPanel();
		totalPane.setLayout(new FlowLayout());
		
		JPanel topPane = new JPanel();
		JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다.피자의 종류를 선택하시오");
		topPane.add(label);
		totalPane.add(topPane);
		
		JPanel centerPane = new JPanel();
		JButton btn1 = new JButton("콤보피자");
		JButton btn2 = new JButton("포테이토피자");
		JButton btn3 = new JButton("불고기피자");
		JLabel label1 = new JLabel("개수");
		JTextField field = new JTextField(10);
		centerPane.add(btn1);
		centerPane.add(btn2);
		centerPane.add(btn3);
		centerPane.add(label1);
		centerPane.add(field);
		totalPane.add(centerPane);
		
		
		add(totalPane);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrameTest1 mft1 = new MyFrameTest1();

	}

}
