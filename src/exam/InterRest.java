package exam;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterRest extends JFrame implements ActionListener {
	private JTextField textField;
	private JButton btn2;
	private JTextField txtOp1;
	private JTextField txtOp2;
	private JTextField txtResult;
	public InterRest() {
		setTitle("이자계산기");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel totalPane = new JPanel();
		JLabel label = new JLabel("원금을 입력하시오");
		totalPane.add(label);
		textField = new JTextField(10);
		totalPane.add(textField);
		
		JLabel label1 = new JLabel("이율을 입력하시오");
		totalPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		totalPane.add(label1);
		JTextField field = new JTextField(10);
		totalPane.add(field);
		
		getContentPane().add(totalPane);
		JButton btn2 = new JButton("변환");
		totalPane.add(btn2);
		
		txtResult = new JTextField();
		totalPane.add(txtResult);
		txtResult.setColumns(10);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		InterRest ir = new InterRest();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		
		int op1=Integer.parseInt(txtOp1.getText());
		int op2=Integer.parseInt(txtOp2.getText());
		int result=0;
		
		if(btn==btn2) {
			result = op1+op2;
		}
		txtResult.setText(result+"");
		
	}

}
