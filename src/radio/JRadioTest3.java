package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.BoxLayout;

public class JRadioTest3 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest3 frame = new JRadioTest3();
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
	public JRadioTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("어떤 크기의 피자를 주문하시겠습니까?");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JRadioButton rdbsms = new JRadioButton("Small Size");
		rdbsms.addActionListener(this);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_1.add(rdbsms);
		
		JRadioButton rdbmds = new JRadioButton("Medium Size");
		rdbmds.addActionListener(this);
		
			
		JLabel label_1 = new JLabel("");
		panel_1.add(label_1);
		panel_1.add(rdbmds);
		
		JRadioButton rdblas = new JRadioButton("Large Size");
		rdblas.addActionListener(this);
		panel_1.add(rdblas);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 12));
		panel_2.add(textField);
		textField.setColumns(20);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbsms);
		group.add(rdbmds);
		group.add(rdblas);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textField.setText(e.getActionCommand()+"가 선택되었습니다.");
		
	}

}
