package checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class JCheckTest4 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckTest4 frame = new JCheckTest4();
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
	public JCheckTest4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Apple");
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Grape");
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Orange");
		panel_1.add(chckbxNewCheckBox_2);
		
		lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2);
		
		chckbxNewCheckBox.addItemListener(this);
		chckbxNewCheckBox_1.addItemListener(this);
		chckbxNewCheckBox_2.addItemListener(this);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox check = (JCheckBox) e.getItem();
		ImageIcon icon = null;
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(check.getText().equals("Apple")) {
				icon = new ImageIcon(getClass().getResource("apple.gif"));
				lblNewLabel.setIcon(icon);
			}else if(check.getText().equals("Grape")) {
				icon = new ImageIcon(getClass().getResource("grape.gif"));
				lblNewLabel_1.setIcon(icon);
			}else if(check.getText().equals("Orange")) {
				icon = new ImageIcon(getClass().getResource("orange.gif"));
				lblNewLabel_2.setIcon(icon);
			}
		}else {
			if(check.getText().equals("Apple")) {
				lblNewLabel.setIcon(null);
			}else if(check.getText().equals("Grape")) {
				lblNewLabel_1.setIcon(null);
			}else if(check.getText().equals("Orange")) {
				lblNewLabel_2.setIcon(null);
			}
		}
	}
	

}
