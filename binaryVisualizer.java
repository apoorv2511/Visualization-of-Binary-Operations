import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class binaryVisualizer extends JApplet implements ActionListener {
	String msg = "WELCOME";
	String msg2 = "";
	JTextField tf1, tf2;
	JLabel jl1, jl2;
	JButton bX, bY, b1, b2, b3, b4, b5;
	JTextField[] tfc, tfx, tfy, tfr, tf1c, tf2c;
	JPanel pall, panel1, panel2;
    
    public void init(){		

	//FONT
		Font font = new Font("Arial", Font.BOLD, 20);
		Font font1 = new Font("Arial", Font.BOLD, 15);
		Font font2 = new Font("Arial", Font.BOLD, 18);
		//Border bord = new LineBorder(Color.BLACK, 12);
		
		pall = new JPanel();
		pall.setBounds(0,0,300,300);
		pall.setLayout(null);
		
	//This is Panel 1	
		panel1 = new JPanel();
		panel1.setBounds(0,0,400,1000);
		panel1.setBackground(new Color(102,153,255));
		panel1.setLayout(null);
		//panel.setVisible(true);
		
	//This is Panel 2
		panel2 = new JPanel();
		panel2.setBounds(700,100,400,250);
		//panel2.setBackground(Color.gray);
		panel2.setLayout(new GridLayout(4,1));
		
	//This is panel 3
		JPanel panel3 = new JPanel();
		panel3.setBounds(610,92,80,250);
		panel3.setLayout(new GridLayout(4,1));
		
	//This is panel 5
		JPanel panel5 = new JPanel();
		panel5.setBounds(600,442,130,90);
		panel5.setLayout(new GridLayout(2,1));	
		
	//This is panel 4 for complements
		JPanel panel4 = new JPanel();
		panel4.setBounds(750,450,350,70);
		//panel4.setBackground(Color.gray);
		//panel4.setBorder(BorderFactory.createLineBorder(Color.black));
		panel4.setLayout(new GridLayout(2,1,5,10));
				
	// X in panel 1
		jl1 = new JLabel("X : ");
		jl1.setFont(font2);
		jl1.setBounds(50,150,40,30);
		jl1.setPreferredSize(new Dimension(200, 200));
		tf1 = new JTextField();
		tf1.setBounds(80,150, 200, 30);
		tf1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		tf1.setEditable(true);
		tf1.setFont(font);
		bX = new JButton("X");
		bX.setIcon(new ImageIcon("C:\\Users\\apoorv2511\\Desktop\\Java programs\\image.png"));
		bX.setBounds(300, 150, 50, 30);
		bX.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
	//Y in panel 1	
		jl2 = new JLabel("Y : ");
		jl2.setFont(font2);
		jl2.setBounds(50,230,40,30);
		tf2 = new JTextField();
		tf2.setBounds(80,230, 200, 30);
		tf2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		tf2.setEditable(true);
		tf2.setFont(font);
		bY = new JButton("Y");
		bY.setIcon(new ImageIcon("C:\\Users\\apoorv2511\\Desktop\\Java programs\\image.png"));
		bY.setBounds(300, 230, 50, 30);
		bY.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
		
        b1 = new JButton("ADD");
		b1.setFont(font2);
		b1.setBounds(0,350,400,50);
		b1.setBackground(new Color(102,153,255));
		b1.setForeground(Color.WHITE);
		b1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		b2 = new JButton("SUBTRACT");
		b2.setFont(font2);
		b2.setBounds(0,400,400,50);
		b2.setBackground(new Color(102,153,255));
		b2.setForeground(Color.WHITE);
		b2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		b3 = new JButton("1's COMPLEMENT of X");
		b3.setFont(font2);
		b3.setBounds(0,450,400,50);
		b3.setBackground(new Color(102,153,255));
		b3.setForeground(Color.WHITE);
		b3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		b4 = new JButton("2's COMPLEMENT of X");
		b4.setFont(font2);
		b4.setBounds(0,500,400,50);
		b4.setBackground(new Color(102,153,255));
		b4.setForeground(Color.WHITE);
		b4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		b5 = new JButton("Reset");
		b5.setFont(font2);
		b5.setBounds(0,550,400,50);
		b5.setBackground(new Color(102,153,255));
		b5.setForeground(Color.WHITE);
		b5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
	//Adding components into panel 1
        panel1.add(jl1); panel1.add(tf1); panel1.add(bX); panel1.add(bY); panel1.add(jl2); panel1.add(tf2); 
		panel1.add(b1); panel1.add(b2); panel1.add(b3); panel1.add(b4); panel1.add(b5);	
		
	// Panel 2
		tfc = new JTextField[9];
		tfx = new JTextField[9];
		tfy = new JTextField[9];
		tfr = new JTextField[9];
		JPanel pc = new JPanel();
		//px.setLayout(new GridLayout(1,2));
		JPanel px = new JPanel();
		//py.setLayout(new GridLayout(1,2));
		JPanel py = new JPanel();
		//pc.setLayout(new GridLayout(1,2));
		JPanel pr = new JPanel();
		//pr.setLayout(new GridLayout(1,2));
		
		panel2.add(pc); panel2.add(px); panel2.add(py); panel2.add(pr);
		
		JLabel l1 = new JLabel("Carry :  ");
		panel3.add(l1);
		l1.setFont(font1);
		for(int i=0; i<9; i++){
			tfc[i]=new JTextField("0",2);
			tfc[i].setFont(font);
			tfc[i].setHorizontalAlignment(JTextField.CENTER);
			tfc[i].setMargin(new Insets(3, 0, 3, 0));
			tfc[i].setEditable(false);
			pc.add(tfc[i]);
		}
		
		JLabel l2 = new JLabel("X :      ");
		l2.setFont(font1);
		panel3.add(l2);
		for(int i=0; i<9; i++){
			tfx[i]=new JTextField("0",2);
			tfx[i].setFont(font);
			tfx[i].setHorizontalAlignment(JTextField.CENTER);
			tfx[i].setMargin(new Insets(3, 0, 3, 0));
			tfx[i].setEditable(false);
			//tfx[i].setBorder(BorderFactory.createLineBorder(Color.black));
			px.add(tfx[i]);
		}
		
		JLabel l3 = new JLabel("Y :      ");
		l3.setFont(font1);
		panel3.add(l3);
		for(int i=0; i<9; i++){
			tfy[i]=new JTextField("0",2);
			tfy[i].setFont(font);
			tfy[i].setHorizontalAlignment(JTextField.CENTER);
			tfy[i].setMargin(new Insets(3, 0, 3, 0));
			tfy[i].setEditable(false);
			//tfy[i].setBorder(BorderFactory.createLineBorder(Color.black));
			py.add(tfy[i]);
		}
		
		JLabel l4 = new JLabel("Result : ");
		l4.setFont(font1);
		panel3.add(l4);
		for(int i=0; i<9; i++){
			tfr[i]=new JTextField("0",2);
			tfr[i].setFont(font);
			tfr[i].setHorizontalAlignment(JTextField.CENTER);
			tfr[i].setMargin(new Insets(3, 0, 3, 0));
			tfr[i].setEditable(false);
			//tfr[i].setBorder(BorderFactory.createLineBorder(Color.black));
			pr.add(tfr[i]);
		}
	 
	
	//Panel 4
	JLabel l5 = new JLabel("1's Complement :");
	l5.setFont(font1);
	panel5.add(l5);
	tf1c = new JTextField[8];
		for(int i=0; i<8; i++){
			tf1c[i] = new JTextField("0",2);
			tf1c[i].setFont(font);
			tf1c[i].setHorizontalAlignment(JTextField.CENTER);
			tf1c[i].setMargin(new Insets(3, 0, 3, 0));
			tf1c[i].setEditable(false);
			panel4.add(tf1c[i]);			
		}
	
	JLabel l6 = new JLabel("2's Complement :");
	l6.setFont(font1);
	panel5.add(l6);	
	tf2c = new JTextField[8];
		for(int i=0; i<8; i++){
			tf2c[i] = new JTextField("0",2);
			tf2c[i].setFont(font);
			tf2c[i].setHorizontalAlignment(JTextField.CENTER);
			tf2c[i].setMargin(new Insets(3, 0, 3, 0));
			tf2c[i].setEditable(false);
			panel4.add(tf2c[i]);			
		}	
		
	//Add components to panel_all	
		pall.add(panel1); pall.add(panel2); pall.add(panel3); pall.add(panel4); pall.add(panel5);
		add(pall);
		/*f1.add(panel1); f1.add(panel2);
			f1.setSize(1400,1000);
			f1.setLayout(null);
			f1.setVisible(true);
		*/	
		bX.addActionListener(this);
		bY.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
    }
	
	//RESET
	public void reset(){
		for(int i=0; i<9; i++){
			tfc[i].setText("0");
			tfx[i].setText("0");
			tfy[i].setText("0");
			tfr[i].setText("0");
		}	
		for(int j=0; j<8; j++){
			tf1c[j].setText("0");
			tf2c[j].setText("0");	
		}
	}
	
	//set X in textfield X
	public void setX()
	{
		String textX = tf1.getText();
		char[] ch1 = textX.toCharArray();
		for(int i=7; i>=0; i--){
			tfx[i+1].setText(Character.toString(ch1[i]));
		}
		
		//tf2.setText(textX);
		for(int i=8; i>=0; i--){
			tfc[i].setText("0");
		}
	}
	
	//set Y in textfield Y
	public void setY()
	{
		String textY = tf2.getText();
		char[] ch2 = textY.toCharArray();
		for(int i=7; i>=0; i--){
			tfy[i+1].setText(Character.toString(ch2[i]));
		}
		//tf2.setText(textX);
	}
	
	//Addition total with thread
	public void addStep(){
		Thread t1 = new Thread(new Runnable(){
				public void run(){
					for(int i=8; i>=0; i--){
						try{
							addition_step(i);
							Thread.sleep(300);
						}
						catch(Exception e){
							
						}
					}
				}
		});
		t1.start();
	}
	
	//ADDITION_STEP
	public void addition_step(int i){
			int a = Integer.parseInt(tfx[i].getText());
			int b = Integer.parseInt(tfy[i].getText());
			int c = Integer.parseInt(tfc[i].getText());
			int sum = a + b + c;
			
			if(sum == 0){
				a = 0;
				b = 0;
				tfr[i].setText(Integer.toString(a));
			}
			else if(sum == 1){
				a = 1;
				b = 0;
				tfr[i].setText(Integer.toString(a));
				//tfc[i-1].setText(Integer.toString(b));
			}
			else if(sum == 2){
				a = 0;
				b = 1;
				tfr[i].setText(Integer.toString(a));
				tfc[i-1].setText(Integer.toString(b));
			}
			else if(sum == 3){
				a = 1;
				b = 1;
				tfr[i].setText(Integer.toString(a));
				tfc[i-1].setText(Integer.toString(b));
			}
	}
	
	//1's COMPLEMENT
	public void oneComple(){
		Thread t3 = new Thread(new Runnable(){
			public void run(){
				try{
					for(int i=8; i>0; i--){
					int x = Integer.parseInt(tfx[i].getText());
					if(x == 0)
						tf1c[i-1].setText(Integer.toString(1));
					else if(x == 1)
						tf1c[i-1].setText(Integer.toString(0));
					Thread.sleep(400);
					}
				}
				catch(Exception e){
					
				}
			}
		});
		t3.start();	
	}
	
	//2's COMPLEMENT
	public void twoComple(){
		Thread t4 = new Thread(new Runnable(){
			public void run(){
				try{
				boolean flag = false;
					for(int i=8; i>0; i--){
						int y = Integer.parseInt(tfx[i].getText());
						if(y == 0 && flag == false){
							tf2c[i-1].setText(Integer.toString(y));
							Thread.sleep(500);
							continue;
						}
						
						if(y == 1 && flag == false){
							flag = true;
							tf2c[i-1].setText(Integer.toString(1));
							Thread.sleep(500);
							continue;
						}
						
						if(flag == true){
							if(y == 0)
								tf2c[i-1].setText(Integer.toString(1));
							else if(y == 1)
								tf2c[i-1].setText(Integer.toString(0));
							Thread.sleep(500);
						}
					}
				}
				catch(Exception e){
					
				}
			}
		});	
		t4.start();
	}
	
	//Thread for subtraction method
	public void subStep(){
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				try{
					boolean flag = false;
					for(int i=8; i>0; i--){
						int y = Integer.parseInt(tfy[i].getText());
						if(y == 0 && flag == false){
							tf2c[i-1].setText(Integer.toString(y));
							Thread.sleep(400);
							continue;
						}
						
						if(y == 1 && flag == false){
							flag = true;
							tf2c[i-1].setText(Integer.toString(1));
							Thread.sleep(400);
							continue;
						}
						
						if(flag == true){
							if(y == 0)
								tf2c[i-1].setText(Integer.toString(1));
							else if(y == 1)
								tf2c[i-1].setText(Integer.toString(0));
							Thread.sleep(400);
						}
					}
					for(int i=8; i>=0; i--){
						subtract(i);
						Thread.sleep(400);
					}
				}
				catch(Exception e){
				
				}
			}
		});
		t2.start();
	}
	
	//SUBTRACTION
	/*public void Y2complement(int i){
		//find 2's complement of y
		boolean flag = false;
			int y = Integer.parseInt(tfy[i].getText());
			if(y == 0 && flag == false){
				tf2c[i-1].setText(Integer.toString(y));
				continue;
			}
			
			if(y == 1 && flag == false){
				flag = true;
				tf2c[i-1].setText(Integer.toString(1));
				continue;
			}
			
			if(flag == true){
				if(y == 0)
					tf2c[i-1].setText(Integer.toString(1));
				else if(y == 1)
					tf2c[i-1].setText(Integer.toString(0));
			}
	}*/
	
	public void subtract(int i){
		//adding 
			int a = Integer.parseInt(tfx[i].getText());
			int b;
			if(i==0){
				b=0;
			}else{
				b = Integer.parseInt(tf2c[i-1].getText());
			}
			int c = Integer.parseInt(tfc[i].getText());
			int sum = a + b + c;
			
			if(sum == 0){
				a = 0;
				b = 0;
				tfr[i].setText(Integer.toString(a));
				//tfc[i-1].setText(Integer.toString(b));
			}
			else if(sum == 1){
				a = 1;
				b = 0;
				tfr[i].setText(Integer.toString(a));
				//tfc[i-1].setText(Integer.toString(b));
			}
			else if(sum == 2){
				a = 0;
				b = 1;
				tfr[i].setText(Integer.toString(a));
				tfc[i-1].setText(Integer.toString(b));
			}
			else if(sum == 3){
				a = 1;
				b = 1;
				tfr[i].setText(Integer.toString(a));
				tfc[i-1].setText(Integer.toString(b));
			}
	}
	
	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		String d = "";
		if(s.equals("X")){
			d = tf1.getText();
			if(d.length() > 8){
				JOptionPane.showMessageDialog(panel2, "You can't insert more than 8 no's ", "Message", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(d.length() <8){
				JOptionPane.showMessageDialog(panel2, "You can't insert less than 8 no's ", "Message", JOptionPane.INFORMATION_MESSAGE);	
			}
			else{
			setX();
			}	
		}
		else if(s.equals("Y")){
			d = tf2.getText();
			if(d.length() > 8){
				JOptionPane.showMessageDialog(panel2, "You can't insert more than 8 no's ", "Message", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(d.length() <8){
				JOptionPane.showMessageDialog(panel2, "You can't insert less than 8 no's ", "Message", JOptionPane.INFORMATION_MESSAGE);	
			}
			else{
			setY();
			}
		}	
		else if(s.equals("ADD"))
		{	
			msg = "Addition";
			addStep();
		}
		else if(s.equals("SUBTRACT"))
		{
			msg = "Subtraction";
			msg2 = "( -Y )";
			subStep();
		}
		else if(s.equals("1's COMPLEMENT of X")){
			oneComple();
		}
		else if(s.equals("2's COMPLEMENT of X")){
			msg2 = "( X )";
			twoComple();
		}
		else if(s.equals("Reset")){
			msg = "Welcome";
			msg2 = " ";
			reset();
		}
		repaint();
	}
    
    public void paint(Graphics g){
		super.paintComponents(g);
		g.drawLine(400,0,400,1000);
		g.drawLine(580,80,580,350);
		g.drawLine(580,350,1130,350);
		g.drawLine(1130,350,1130,80);
		g.drawLine(1130,80,580,80);
		g.drawLine(580,430,580,535);
		g.drawLine(580,430,1130,430);
		g.drawLine(1130,430,1130,535);
		g.drawLine(1130,535,580,535);
		g.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		g.drawString(msg,800,60);
		g.drawString(msg2,1145,515);
		        //g.drawLine(400,500,2000,500);

		//String a = t1.getText();
		//char[] ap = a.toCharArray();
		//int b = Integer.parseInt(t2.getText());
		//int c = a + b;
		//for(int i=0; i<5; i++){
			//g.drawString(ap[i] + "", 600 + 20*i, 400);

		//}
		}
}	
