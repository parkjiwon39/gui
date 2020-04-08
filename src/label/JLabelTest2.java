package label;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JLabelTest2 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JToggleButton tglbtnNewToggleButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelTest2 frame = new JLabelTest2();
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
	public JLabelTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		tglbtnNewToggleButton = new JToggleButton("이미지를 보려면 클릭하세요");
		tglbtnNewToggleButton.addItemListener(this);
		contentPane.add(tglbtnNewToggleButton, BorderLayout.SOUTH);
		
		
		
		lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			ImageIcon dog = new ImageIcon(getClass().getResource("pu.jpg"));
			lblNewLabel_1.setIcon(dog);
			lblNewLabel_1.setText("그림이 나타났어요");
		}else {
			//ImageIcon dog = new ImageIcon(getClass().getResource(""));
			lblNewLabel_1.setIcon(null);
			lblNewLabel_1.setText("그림이 사라졌어요");
		}
		
		
	}


}
