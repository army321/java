package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class example5_3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonDemo myButtonGUI = new ButtonDemo();
		myButtonGUI.setVisible(true);
		
	}

}

class ButtonDemo extends JFrame implements ActionListener{
	public static final int width = 250;
	public static final int height = 200;
	
	ButtonDemo()
	{
		setSize(width,height);
		setTitle("��ť����¼�");
		Container conPane = getContentPane();
		conPane.setBackground(Color.BLUE);
		conPane.setLayout(new FlowLayout());
		JButton retButt = new JButton("RED");
		retButt.addActionListener(this);
		conPane.add(retButt);
		JButton greenButt = new JButton("GREEN");
		greenButt.addActionListener(this);
		conPane.add(greenButt);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Container conPane = getContentPane();
		if(e.getActionCommand().equals("RED"))
			conPane.setBackground(Color.red);
		else if(e.getActionCommand().equals("GREEN"))
			conPane.setBackground(Color.yellow);
		//else {}
	}
}
 
 