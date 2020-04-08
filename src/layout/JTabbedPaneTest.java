package layout;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame {
	
	public JTabbedPaneTest() {
		setTitle("JTabbedPane");
		setSize(500, 500);
		setVisible(true);
		JTabbedPane jTabbed = new JTabbedPane();
		//tab이 보여질 위치 지정 LEFT / RIGHT / TOP / BOTTOM
		jTabbed.setTabPlacement(JTabbedPane.BOTTOM);
		
		//탬에 보여줄 패널 추가
		JPanel first = new JPanel();
		first.setBackground(Color.yellow);
		jTabbed.addTab("첫번째", first);
		
		JPanel second= new JPanel();
		second.setBackground(Color.blue);
		jTabbed.addTab("두번째",second);
		
		JPanel third = new JPanel();
		third.setBackground(Color.red);
		jTabbed.addTab("세번째", third);
		
		add(jTabbed);
	}

	public static void main(String[] args) {
		JTabbedPaneTest pane = new JTabbedPaneTest();

	}

}