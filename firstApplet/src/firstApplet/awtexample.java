package firstApplet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.regex.Pattern;

import javax.swing.Popup;

 class database_operation{
	public database_operation() {
		
	}
	
}

public class awtexample extends Frame implements ActionListener {
	TextField utf,ptf;
	Graphics g;
	Label heading,uname,pass;
	
	
	public awtexample() {
		
		Font myfont=new Font("Courier",Font.BOLD,20);
		
		setFont(myfont);
		setBackground(Color.MAGENTA);
		//this is for menu bar 
		MenuBar mb=new MenuBar();
		Menu menu1=new Menu("Sign In");
		Menu menu2=new Menu("Sign Up");
		mb.add(menu1); mb.add(menu2);
		setMenuBar(mb);
		
		//label
		
		heading=new Label("Student Login");
		heading.setBounds(150, 70, 200, 30);
		uname=new Label("UserName:");
		uname.setBounds(100,100,150,30);
		pass=new Label("Password:");
		pass.setBounds(100,140,150,30);
		
		add(heading);add(uname);add(pass);
		
		//textfield
		
		
		utf=new TextField();
		utf.setColumns(2);
		utf.setBounds(250, 100, 200, 30);
		ptf=new TextField();
		ptf.setColumns(2);
		ptf.setBounds(250, 140, 200, 30);
		
		add(utf);add(ptf);
		
		//button
		
		Button b1=new Button("Login");
		b1.setBounds(200,185,100,25);
		b1.setBackground(Color.cyan);
		add(b1);
		b1.addActionListener(this);
		
		//
		
		
		
		
		//closing windows
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String pasd=ptf.getText();
		String user=utf.getText();
		
		Pattern pts=Pattern.compile(pasd);
		
		
		
		if(!user.contains("K")) {
			String s="Enter valid Email";
			Font myfont=new Font("Courier",Font.ITALIC,20);
			setFont(myfont);
			Label l=new Label(s);
			l.setBounds(100,250,500,250);
			add(l);
		}
		
		if(pasd.length()<4) {
			String str="Password must be greater than 8 ";
			Font myfont=new Font("Courier",Font.ITALIC,20);
			setFont(myfont);
			Label l;
			l=new Label(str);
			l.setBounds(100,250,500,250);
			add(l);
		}
		else {
			try {
			String uName=utf.getText();
			String passw=ptf.getText();
			int pass=Integer.parseInt(passw);
			jdbcexample obj=new jdbcexample();
			obj.insert(uName, pass);
			}catch(Exception p) {
				System.out.println(p);
				
			}
			
			
		}
	}
	
	public void paint(Graphics g) {
		
	}
	public static void main(String[] args) {
		
		awtexample a=new awtexample();
	}

	

}
