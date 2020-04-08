package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SimpleCalc2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtOp1;
	private JTextField txtOp2;
	private JTextField txtResult;
	private JButton btnOk,btnCancel;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JLabel lblOper;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc2 frame = new SimpleCalc2();
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
	public SimpleCalc2() {
		setTitle("사칙연산 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtOp1 = new JTextField();
		panel.add(txtOp1);
		txtOp1.setColumns(10);
		
		lblOper = new JLabel("?");
		panel.add(lblOper);
		
		txtOp2 = new JTextField();
		panel.add(txtOp2);
		txtOp2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		panel.add(lblNewLabel_1);
		
		txtResult = new JTextField();
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnOk = new JButton("+");
		btnOk.addActionListener(this);
		panel_1.add(btnOk);
		
		btnCancel = new JButton("reset");
		btnCancel.addActionListener(this);
		
		btn1 = new JButton("-");
		btn1.addActionListener(this);
		panel_1.add(btn1);
		
		btn2 = new JButton("*");
		btn2.addActionListener(this);
		panel_1.add(btn2);
		
		btn3 = new JButton("/");
		btn3.addActionListener(this);
		panel_1.add(btn3);
		panel_1.add(btnCancel);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		
		int op1=Integer.parseInt(txtOp1.getText());
		int op2=Integer.parseInt(txtOp2.getText());
		int result=0;
		
		if(btn==btnOk) {
			lblOper.setText("+");
			result = op1+op2;
		}else if(btn==btn1) {
			lblOper.setText("-");
			result = op1-op2;
		}else if(btn==btn2) {
			lblOper.setText("*");
			result = op1*op2;
		}else if(btn==btn3) {
			lblOper.setText("/");
			result = op1/op2;
		}else {
			//txtOp1, txtOp2, txtResult 내용 지우기
			txtOp1.setText("");
			txtOp2.setText("");
			txtResult.setText("");
		}
		txtResult.setText(result+"");
		
//		if(e.getSource()==btnOk) {
//			//txtOp1, txtOp2 숫자를 가져와서 더하기를 한 후
//			//txtResult에 결과값 보여주기
//			txtResult.setText(String.valueOf(op1+op2));			
//		}else {
//			//txtOp1, txtOp2, txtResult 내용 지우기
//			txtOp1.setText("");
//			txtOp2.setText("");
//			txtResult.setText("");
//		}
//		 if(e.getSource()==btn1) {
//			int op1=Integer.parseInt(txtOp1.getText());
//			int op2=Integer.parseInt(txtOp2.getText());
//			txtResult.setText(String.valueOf(op1-op2));
//		}
//		if(e.getSource()==btn2) {
//			int op1=Integer.parseInt(txtOp1.getText());
//			int op2=Integer.parseInt(txtOp2.getText());
//			txtResult.setText(String.valueOf(op1*op2));
//		}
//		if(e.getSource()==btn3) {
//			int op1=Integer.parseInt(txtOp1.getText());
//			int op2=Integer.parseInt(txtOp2.getText());
//			txtResult.setText(String.valueOf(op1/op2));
//	}
	//}
}
}


