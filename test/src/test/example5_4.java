package test;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;



class MyWindow extends JFrame {
	public MyWindow(int w,int h) {
	setTitle("滚动条实例");
	Container con = getContentPane();
	con.setPreferredSize(new Dimension(w,h));
	JPanel p = new JPanel();
	p.setLayout(new GridLayout(6,6));
	for(int i = 0;i < 6;i++){
		p.add(new JLabel());
		for(int j = 1;j<=2;j++) {
			p.add(new JButton("button"+ (2*i+j)));
			p.add(new JLabel("Label"+ (2*i+j)));
			}
		p.add(new JLabel());
		}
	p.setBackground(Color.BLUE);
	p.setPreferredSize(new Dimension(w+50,h+50));
	ScrollPane sp = new ScrollPane(p);  //这里应该要用ScrollPane，要不然定义了没用
	sp.setPreferredSize(new Dimension(w-100,h-600));
	add(sp,BorderLayout.CENTER);
	setVisible(true);
	pack();
	}
}


class ScrollPane extends JScrollPane{
	public ScrollPane(Component p) {
		super(p);
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
}


public class example5_4 extends Applet {

	
	MyWindow myWindow;
	public void init()
	{
		myWindow = new MyWindow(400,300);
	}

}