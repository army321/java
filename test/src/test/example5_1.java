package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class example5_1 {

	public static myWindowDemo mw1;
	public static myWindowDemo mw2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mw = new JFrame("我的第一个窗口");
		mw.setSize(300,200);
		JButton button = new JButton("button1");
		mw.getContentPane().add(button);
		mw.setVisible(true);
		
		JButton button1 = new JButton("button1");
		String name1 = "我的第一个窗口";
		String name2 = "我的第2个窗口";
		JButton button2 = new JButton("other button2");
		mw1 = new myWindowDemo(name1,button1,Color.blue,300,600);
		mw1.setVisible(true);
		
		mw2 = new myWindowDemo(name2,button2,Color.magenta,500,200);
		mw2.setVisible(true);
		
	}

}

 class myWindowDemo extends JFrame{
	public myWindowDemo(String name,JButton button,Color C ,int w, int h)
	{
		super(); setTitle(name);setSize(w,h);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.setBackground(C);
		contentPane.add(button);;
	}
}