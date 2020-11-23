// Importing the Abstract Window Toolkit and applet packages

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="oop" width=1250 height=1000>
 </applet>
 */
public class oop extends Applet implements ActionListener
{   
	int q1, q2, q3, q4, q5, t, m1, m2, m3, m4, m5 = 0;
    Label l1, l2, l3, l4, l5;
    Button c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20;
    TextField inp;
    public void init()
    {  
		setLayout(null);
		Button b1 = new Button("View Results");
		add(b1); 

		b1.addActionListener(this);
		b1.setBounds(850,400,150,30);

		l1=new Label("1. The sum of a number and the number decreased by five is 25. Find the number");
		l2=new Label("2. A salesman sold twice as much pears in the afternoon than in the morning. If he sold 360 kg of \npears that day, how many kilograms did he sell in the morning and how many in the afternoon?");
		l3=new Label("3. I chose a number and divide it by 5. Then I subtracted 154 from the result and got 6. What was \nthe number I chose?");
		l4=new Label("4. Find the smallest number which on adding 19 to it is exactly divisible by 28, 36 and 45.");
		l5=new Label("5. The ratio of Jenny's trophies to Meredith's trophies is 7:4. Jenny has 28 trophies. How many does \nMeredith have?");
			
		c1 = new Button("40");
		add(c1);
		c1.addActionListener(this);
		c2 = new Button("15");
		add(c2);
		c2.addActionListener(this);
		c3 = new Button("25");
		add(c3);
		c3.addActionListener(this);
		c4 = new Button("30");
		add(c4);
		c4.addActionListener(this);
		c5 = new Button("11, 22");
		add(c5);
		c5.addActionListener(this);
		c6 = new Button("60, 120");
		add(c6);
		c6.addActionListener(this);	       
		c7 = new Button("120, 240");
		add(c7);
		c7.addActionListener(this);
		c8 = new Button("120, 140");
		add(c8);
		c8.addActionListener(this);
		c9 = new Button("800");
		add(c9);
		c9.addActionListener(this);
		c10 = new Button("500");
		add(c10);
		c10.addActionListener(this);
		c11 = new Button("900");
		add(c11);
		c11.addActionListener(this);
		c12 = new Button("400");
		add(c12);
		c12.addActionListener(this);
		c13 = new Button("1241");
		add(c13);
		c13.addActionListener(this);
		c14 = new Button("1260");
		add(c14);
		c14.addActionListener(this);
		c15 = new Button("1250");
		add(c15);
		c15.addActionListener(this);
		c16 = new Button("2167");
		add(c16);
		c16.addActionListener(this);
		c17 = new Button("32");
		add(c17);
		c17.addActionListener(this);
		c18 = new Button("12");
		add(c18);
		c18.addActionListener(this);
		c19 = new Button("24");
		add(c19);
		c19.addActionListener(this);
		c20 = new Button("16");
		add(c20);
		c20.addActionListener(this);	       		
		
		c1.setBounds(300,120,80,20);
		c2.setBounds(400,120,80,20);
		c3.setBounds(300,150,80,20);
		c4.setBounds(400,150,80,20);

		c5.setBounds(300,250,80,20);
		c6.setBounds(400,250,80,20);
		c7.setBounds(300,280,80,20);
		c8.setBounds(400,280,80,20);

		c9.setBounds(300,380,80,20);
		c10.setBounds(400,380,80,20);
		c11.setBounds(300,410,80,20);
		c12.setBounds(400,410,80,20);

		c13.setBounds(300,490,80,20);
		c14.setBounds(400,490,80,20);
		c15.setBounds(300,520,80,20);
		c16.setBounds(400,520,80,20);


		c17.setBounds(300,620,80,20);
		c18.setBounds(400,620,80,20);
		c19.setBounds(300,650,80,20);
		c20.setBounds(400,650,80,20);      

        int i;
		inp = new TextField();
		inp.setBounds(800,100,270,50);
		this.add(inp);

		Button button[] = new Button[10];
		for(i = 0;i < 10; i++)
		{
			button[i] = new Button(String.valueOf(9-i));
			button[i].setBounds(800 + ((i % 3) * 50), 150 + ((i / 3) * 50), 50, 50);
			this.add(button[i]);
			button[i].addActionListener(this);
		}

		Button dec = new Button(".");
		dec.setBounds(850,300,50,50);
		this.add(dec);
		dec.addActionListener(this);
	
		Button clr = new Button("C");
		clr.setBounds(900,300,50,50);
		this.add(clr);
		clr.addActionListener(this);
	
		Button operator[] = new Button[5];
		operator[0] = new Button("/");
		operator[1] = new Button("*");
		operator[2] = new Button("-");
		operator[3] = new Button("+");
		operator[4] = new Button("=");
		for(i = 0;i < 4; i++)
		{
			operator[i].setBounds(950,150+(i*50),50,50);
			this.add(operator[i]);
			operator[i].addActionListener(this);
		}
		operator[4].setBounds(1000,300,70,50);
		this.add(operator[4]);
		operator[4].addActionListener(this);
	}
	String num1 = "";
	String op = "";
	String num2 = "";
	public void actionPerformed(ActionEvent e) 
	{
		String button = e.getActionCommand();
		char ch = button.charAt(0);
		if(ch >= '0' && ch <= '9'|| ch == '.') 
		{ 
			if (!op.equals("")) 
				num2 = num2 + button; 
			else
				num1 = num1 + button;   
			inp.setText(num1 + op + num2); 
		} 
		else if(ch == 'C') 
		{ 
			num1 = op = num2 = ""; 
			inp.setText(""); 
		}
		else if (ch == '=') 
		{ 
			if(!num1.equals("") && !num2.equals(""))
			{
				double temp;
				double n1 = Double.parseDouble(num1);
				double n2 = Double.parseDouble(num2);
				if(n2 == 0 && op.equals("/"))
				{
					inp.setText(num1 + op + num2 +" = Zero Division Error");
					num1 = op = num2 = "";
				}
				else
				{
					if (op.equals("+")) 
						temp = n1 + n2; 
					else if (op.equals("-")) 
						temp = n1 - n2; 
					else if (op.equals("/")) 
						temp = n1/n2; 
					else
						temp = n1*n2; 
					inp.setText(num1+op+num2+" = "+temp); 
					num1 = Double.toString(temp);
					op = num2 = ""; 
				}
			}
			else
			{
				num1 = op = num2 = ""; 
				inp.setText("");
			}
		} 
		else 
		{ 
			if (op.equals("") || num2.equals("")) 
				op = button; 
			else 
			{ 
				double temp;
				double n1=Double.parseDouble(num1);
				double n2=Double.parseDouble(num2);
				if(n2 == 0 && op.equals("/"))
				{
					inp.setText(num1+op+num2+" = Zero Division Error");
					num1 = op = num2 = "";
				}
				else
				{
					if (op.equals("+")) 
						temp = n1 + n2; 
					else if (op.equals("-")) 
						temp = n1 - n2; 
					else if (op.equals("/")) 
						temp = n1/n2; 
					else
						temp = n1*n2; 
					num1 = Double.toString(temp); 
					op = button; 
					num2 = ""; 
				}
			}
			inp.setText(num1 + op + num2);
		}	
		if (e.getSource() == c1)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q1 == 0)
			{
				c1.setBackground(Color.red);
				q1 = 1;
			}
		}
		else if (e.getSource() == c2)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q1 == 0)
			{
				c2.setBackground(Color.green);
				q1=1;
				m1=1; 
			}
		}
		else if (e.getSource() == c3)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q1==0)
			{
				c3.setBackground(Color.red);
				q1=1; 
			}
		}
		else if (e.getSource() == c4)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q1==0)
			{
				c4.setBackground(Color.red);
				q1=1; 
			}
		}
		
		if (e.getSource() == c5)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q2==0) 
			{
				c5.setBackground(Color.red);
				q2=1;
			}
		}
		else if (e.getSource() == c6)
		{
			num1 = op = num2 = ""; 
			inp.setText("");			
			if(q2==0)
			{
				c6.setBackground(Color.red);
				q2=1;
			}
		}
		else if (e.getSource() == c7)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q2==0)
			{
				c7.setBackground(Color.green);
				q2=1;
				m2=1;
			}
		}	
		else if (e.getSource() == c8)
		{	
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q2==0)
			{
				c8.setBackground(Color.red);
				q2=1;
			}
		}
		if (e.getSource() == c9)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q3==0) 
			{
				c9.setBackground(Color.green);
				q3=1;
				m3=1;
			}
		}
		else if (e.getSource() == c10)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q3==0)
			{
				c10.setBackground(Color.red);
				q3=1;
			}
		}
		else if (e.getSource() == c11)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q3==0)
			{
				c11.setBackground(Color.red);
				q3=1;
			}
		}
		else if (e.getSource() == c12)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q3==0)
			{
				c12.setBackground(Color.red);
				q3=1;
			}
		}
		else if (e.getSource() == c13)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q4==0) 
			{
				c13.setBackground(Color.green);
				q4=1;
				m4=1;
			}
		}
		else if (e.getSource() == c14)
		{	
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q4==0)
			{
				c14.setBackground(Color.red);
				q4=1;
			}
		}
		else if (e.getSource() == c15)
		{	
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q4==0)
			{	
				c15.setBackground(Color.red);
				q4=1;
			}
		}
		else if (e.getSource() == c16)
		{
			num1 = op = num2 = ""; 
			inp.setText("");			
			if(q4==0)
			{
				c16.setBackground(Color.red);
				q4=1;
			}
		}
		
		
		if (e.getSource() == c17)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q5==0) 
			{
				c17.setBackground(Color.red);
				q5=1;
			}
		}
		else if (e.getSource() == c18)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q5==0)
			{
				c18.setBackground(Color.red);
				q5=1;
			}
		}
		else if (e.getSource() == c19)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q5==0)
			{
				c19.setBackground(Color.red);
				q5=1;
			}
		}
		else if (e.getSource() == c20)
		{
			num1 = op = num2 = ""; 
			inp.setText("");
			if(q5==0)
			{
				c20.setBackground(Color.green);
				q5=1;
				m5=1;
			}
		}

		String total=e.getActionCommand();
		
		if(total.equals("View Results"))
		{ 	
			num1 = op = num2 = ""; 
			inp.setText("");
			t = m1+m2+m3+m4+m5;
			c2.setBackground(Color.green);
			c7.setBackground(Color.green);
			c9.setBackground(Color.green);
			c13.setBackground(Color.green);
			c20.setBackground(Color.green);
		}
		repaint();
	}
	private void drawString(Graphics g, String text, int x, int y) 
	{
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());
	}
	public void paint(Graphics g)
	{   
		Font f = new Font("Arial",Font.PLAIN,14);
		g.setFont(f);
		drawString(g,"Math Quiz",607,28);
		g.drawRoundRect(580,25,120,30, 30, 30);
		drawString(g,l1.getText(),100,80);
		drawString(g,l2.getText(),100,190);
		drawString(g,l3.getText(),100,320);
		drawString(g,l4.getText(),100,450);
		drawString(g,l5.getText(),100,560);
		drawString(g,"Total Score = "+t,875,450);
    }
}