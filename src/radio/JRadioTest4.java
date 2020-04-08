package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JSplitPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;

public class JRadioTest4 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JRadioButton radioCombo,radioPotato,radioBul,radioPepper,radioCheese,radioPepp,radioBacon,radioSmall,radioMedium,radioLarge;
	private JButton btnInput,btnOpt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest4 frame = new JRadioTest4();
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
	public JRadioTest4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("자바 피자에 오신 것을 환영합니다");
		lblNewLabel.setForeground(Color.BLUE);
		panel.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.SOUTH);
		
		btnInput = new JButton("토핑");
		panel_4.add(btnInput);
		btnInput.addActionListener(this);
		
		btnOpt = new JButton("크기");
		panel_4.add(btnOpt);
		btnOpt.addActionListener(this);
		
		JButton btnNewButton = new JButton("주문");
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(this);
		panel_4.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setText("금액 : ");
		panel_4.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		radioCombo = new JRadioButton("콤보");
		radioCombo.addActionListener(this);
		panel_5.add(radioCombo);
		
		radioPotato = new JRadioButton("포테이토");
		radioPotato.addActionListener(this);
		panel_5.add(radioPotato);
		
		radioBul = new JRadioButton("불고기");
		radioBul.addActionListener(this);
		panel_5.add(radioBul);
		
		panel_1.add(panel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		radioPepper = new JRadioButton("피망");
		radioPepper.addActionListener(this);
		panel_3.add(radioPepper);
		
		radioCheese = new JRadioButton("치즈");
		radioCheese.addActionListener(this);
		panel_3.add(radioCheese);
		
		radioPepp = new JRadioButton("페페로니");
		radioPepp.addActionListener(this);
		panel_3.add(radioPepp);
		
		radioBacon = new JRadioButton("베이컨");
		radioBacon.addActionListener(this);
		panel_3.add(radioBacon);
		
		panel_1.add(panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		radioSmall = new JRadioButton("Small");
		radioSmall.addActionListener(this);
		panel_2.add(radioSmall);
		
		radioMedium = new JRadioButton("Medium");
		radioMedium.addActionListener(this);
		panel_2.add(radioMedium);
		
		radioLarge = new JRadioButton("Large");
		radioLarge.addActionListener(this);
		panel_2.add(radioLarge);
		panel_1.add(panel_2);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioCombo);
		group1.add(radioPotato);
		group1.add(radioBul);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(radioPepper);
		group2.add(radioCheese);
		group2.add(radioPepp);
		group2.add(radioBacon);
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(radioSmall);
		group3.add(radioMedium);
		group3.add(radioLarge);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textField.setText(e.getActionCommand());
	
		JButton btn = (JButton) e.getSource();
		
		if(btn==btnInput) {
			//JOptionPane.showInputDialog(this, "입력하세요");
			String value[]= {"피망","치즈","페페로니","베이컨"};
			JOptionPane.showInputDialog(this, "선택하세요", "선택", JOptionPane.PLAIN_MESSAGE, null, value,value[1]);
		}else {
			String option[]= {"Small","Medium", "Large"};
			JOptionPane.showOptionDialog(this, "피자 크기는 어떻게 할까요?", "주문", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
		}
		
	}

}
