package exam;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener{
	private JTextField textField;
	private JPanel contentPane;
	private JLabel label;
	
	private static final int ROCK=0;
	private static final int SCISSOR=1;
	private static final int PAPER=2;

	public RockScissorPaper() {
	setTitle("가위바위보");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	contentPane = new JPanel();
	contentPane.setLayout(new BorderLayout());
	add(contentPane);
	
	label = new JLabel("아래의 버튼중에서 하나를 클릭하시오!");
	label.setFont(new Font("굴림", Font.PLAIN, 16));
	contentPane.add(label,BorderLayout.NORTH);
	
	JPanel panel = new JPanel();
	getContentPane().add(panel, BorderLayout.CENTER);
	panel.setLayout(new GridLayout(0,3,0,0));
	
	
	JButton btnNewButton = new JButton("ROCK");
	btnNewButton.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/exam/rock.png")));
	btnNewButton.setFont(new Font("굴림", Font.BOLD,20));
	panel.add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("PAPER");
	btnNewButton_1.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/exam/paper.png")));
	btnNewButton_1.setFont(new Font("굴림", Font.BOLD,20));
	panel.add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("SCISSOR");
	btnNewButton_2.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/exam/scissor.png")));
	btnNewButton_2.setFont(new Font("굴림", Font.BOLD,20));
	panel.add(btnNewButton_2);
	pack();
	
	
//	for(int i=0;i<3;i++) {
//		buttons[i] = new JButton((i)+"");
//		btnPanel.add(buttons[i]);
//	}
	
	setVisible(true);
	}
	
	public static void main(String[] args) {
		RockScissorPaper rsp = new RockScissorPaper();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		System.out.println(str);
		
		//컴퓨터의 가위,바위,보 생성하기
		Random random = new Random();
		
		//random.nextInt(3) : 괄호안의 숫자는 미포함해서 0,1,2 중에서
		//나오게 함
		int computer = random.nextInt(3);
		
		//사용자가 누른 버튼의 값을 가져온 후
		//가위,바위,보를 해서 누가 이겼는지
		//textField에 보여주기
		String user = e.getActionCommand();
		if(user.equals("ROCK")) {//사용자가 주먹을 선택한 경우
			if(computer==ROCK) {
				textField.setText("비겼네");
			}else if(computer==SCISSOR) {
				textField.setText("이겼네");
			}else {
				textField.setText("졌네");
			}
		}else if(user.equals("PAPER")) {//사용자가 보를 선택한 경우
			if(computer==ROCK) {
				textField.setText("이겼네");
			}else if(computer==SCISSOR) {
				textField.setText("졌네");
			}else {
				textField.setText("비겼네");
			}
		}else {//사용자가 가위를 선택한 경우
			if(computer==ROCK) {
				textField.setText("졌네");
			}else if(computer==SCISSOR) {
				textField.setText("비겼네");
			}else {
				textField.setText("이겼네");
			}
	}

}
}
