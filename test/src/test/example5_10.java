package test;
import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//�����߼���һ��forѭ��������Ĵ󲿷�ʱ�����ڲ��ֽ⹹��

class Panel_1 extends JPanel{
	JTextField text1,text2,text3;
	Panel_1(){ //���췽����������Panel����ʱ��Panel����ʼ��Ϊ��3����ǩ��
		//�����ı��򣬲���ΪGridLayout(1,6)
		text1 = new JTextField(10);
		text2 = new JTextField(10);
		text3 = new JTextField(10);
		setLayout(new GridLayout(1,6));
		add(new JLabel("��ʼ��",JLabel.RIGHT)); 
		add(text1);
		add(new JLabel("��ֹ��",JLabel.RIGHT)); 
		add(text2);
		add(new JLabel("����",JLabel.RIGHT)); 
		add(text3);
	}		
}

class Panel_2 extends JPanel{
	JTextArea text;
	JButton start_button;
	Panel_2(){//���췽����������Panel����ʱ��Panel����ʼ��Ϊ��1����ǩ��
		//1���ı��򣬲���ΪGridLayout(1,4)
		text = new JTextArea(4,10);
		text.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(text);
		start_button = new JButton("start");
		setLayout(new GridLayout(1,4));
		add(new JLabel("������",JLabel.RIGHT)); 
		add(jsp);
		add(new Label()); 
		add(start_button);
		
	}		
}

public class example5_10 extends Applet implements ActionListener{
	Panel_1 panel_1;
	Panel_2 panel_2;
	public void init() {
		setLayout(new GridLayout(3,1));
		setSize(400,200);
		panel_1 = new Panel_1();
		panel_2 = new Panel_2();
		add(new JLabel("�������ӱ���������",JLabel.CENTER));
		add(panel_1);
		add(panel_2);
		(panel_2.start_button).addActionListener(this);
	}
	


public void actionPerformed(ActionEvent e) {
	if(e.getSource() == (panel_2.start_button));{
		long n1,n2,f,count = 0;
		n1 = Long.parseLong(panel_1.text1.getText());
		n2 = Long.parseLong(panel_1.text2.getText());
		f = Long.parseLong(panel_1.text3.getText());
		for(long i = n1; i<=n2; i++) {
			if(i%f ==0)
				panel_2.text.append(String.valueOf(i)+ " ");
		}
	}
	
	}
}