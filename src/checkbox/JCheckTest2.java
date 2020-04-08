package checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class JCheckTest2 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JTextArea textArea;
	private JCheckBox chckbxNewCheckBox_1,chckbxNewCheckBox_2,chckbxNewCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckTest2 frame = new JCheckTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JCheckTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		chckbxNewCheckBox_1 = new JCheckBox("사과");
		panel_1.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("복숭아");
		panel_1.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox = new JCheckBox("포도");
		panel_1.add(chckbxNewCheckBox);
		
		textArea = new JTextArea();
		panel.add(textArea);
		
		chckbxNewCheckBox_1.addItemListener(this);
		chckbxNewCheckBox_2.addItemListener(this);
		chckbxNewCheckBox.addItemListener(this);
			
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 각 체트박스가 체크가 되면 체트된 과일의 이름을 textArea에 보여주기
		// 체크가 해제 되면 textArea에 있던 과일의 이름은 삭제해주기
		// textArea => setText(), append();
		JCheckBox jcb = (JCheckBox) e.getItem();
		if(e.getStateChange()==ItemEvent.SELECTED) {
			textArea.append(" "+jcb.getText());
		 }else {
			 //textArea에 있는 전체 문자열
			 String contents=textArea.getText();
			 //체크가 해제된 체크박스 문자열
			 String delTxt=jcb.getText();
			 //
			 StringBuffer buf = new StringBuffer(contents);
			 int start = buf.indexOf(delTxt);
			 int end = buf.length();
			 buf.delete(start, end);
			 textArea.setText(buf.toString());
		 }
	}
	

}
