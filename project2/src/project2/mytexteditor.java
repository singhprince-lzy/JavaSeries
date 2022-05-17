package project2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;

public class mytexteditor extends  WindowAdapter implements ActionListener{
	Frame f;
	TextArea area;
	Label l1;
	mytexteditor(){
		
		f=new Frame();
		f.addWindowListener(this);
		//Text area components
	
		area=new TextArea();
		f.add(area);
		area.setBounds(10, 50, 475, 380);
		
		//word count
		 l1 = new Label();
		 l1.setBounds(50, 430, 100, 30);     
		 f.add(l1);
		 
		 Button btn=new Button("Count");
		 btn.setBounds(150,460,50,20);
		 f.add(btn);
		 
		 btn.addActionListener(this);
		 
		
		//Menu bar components
		MenuBar mb=new MenuBar();
		Menu menu1=new Menu("File");
		Menu menu2=new Menu("Edit");
		Menu menu3=new Menu("Format");
		Menu menu4=new Menu("View");
		Menu menu5=new Menu("Help");
		
		//first men items for FILE
		MenuItem menu1item1=new MenuItem("New");
		MenuItem menu1item2=new MenuItem("Open");
		MenuItem menu1item3=new MenuItem("Save");
		MenuItem menu1item4=new MenuItem("Exit");
		MenuItem menu1item5=new MenuItem("Settings");
		
		menu1item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		menu1.add(menu1item1);
		menu1.add(menu1item2);
		menu1.add(menu1item3);
		menu1.add(menu1item4);
		menu1.add(menu1item5);
	
		mb.add(menu1);
		
		//second menu items EDIT
		MenuItem menu2item1=new MenuItem("New");
		MenuItem menu2item2=new MenuItem("Open");
		MenuItem menu2item3=new MenuItem("Save");
		MenuItem menu2item4=new MenuItem("Exit");
		MenuItem menu2item5=new MenuItem("Settings");
		
		menu2.add(menu2item1);
		menu2.add(menu2item2);
		menu2.add(menu2item3);
		menu2.add(menu2item4);
		menu2.add(menu2item5);
		mb.add(menu2);
		
		//menu 3
		MenuItem menu3item1=new MenuItem("New");
		MenuItem menu3item2=new MenuItem("Open");
		MenuItem menu3item3=new MenuItem("Save");
		MenuItem menu3item4=new MenuItem("Exit");
		MenuItem menu3item5=new MenuItem("Settings");
		
		menu3.add(menu3item1);
		menu3.add(menu3item2);
		menu3.add(menu3item3);
		menu3.add(menu3item4);
		menu3.add(menu3item5);
		mb.add(menu3);
		
		//menu 4
		MenuItem menu4item1=new MenuItem("New");
		MenuItem menu4item2=new MenuItem("Open");
		MenuItem menu4item3=new MenuItem("Save");
		MenuItem menu4item4=new MenuItem("Exit");
		MenuItem menu4item5=new MenuItem("Settings");
		
		menu4.add(menu4item1);
		menu4.add(menu4item2);
		menu4.add(menu4item3);
		menu4.add(menu4item4);
		menu4.add(menu4item5);
		mb.add(menu4);
		
		//menu 5
		MenuItem menu5item1=new MenuItem("New");
		MenuItem menu5item2=new MenuItem("Open");
		MenuItem menu5item3=new MenuItem("Save");
		MenuItem menu5item4=new MenuItem("Exit");
		MenuItem menu5item5=new MenuItem("Settings");
		
		menu5.add(menu5item1);
		menu5.add(menu5item2);
		menu5.add(menu5item3);
		menu5.add(menu5item4);
		menu5.add(menu5item5);
		mb.add(menu5);
		
		
		f.setMenuBar(mb);
		f.setSize(500,500);
		f.setTitle("Example");
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {    
	    String text = area.getText();    
	    String words[]=text.split("\\s");    
	    l1.setText("Words: "+words.length);    
	        
	}
	public void windowClosing (WindowEvent e) {    
	    f.dispose();    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mytexteditor();

	}
	public void actionPerformed1(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
