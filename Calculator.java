//Author: Aman Anwar
//I  pledge  that  I  have  neither  given  nor  received  help  from  anyone  other  than  the 
//instructor/TA for all program components included here!

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Calculator extends JFrame implements ActionListener{

    JTextField textField;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, neg, plus, min, mult, div, power, dot,
    sin, cos, tan, cot, ln, log, eq, clear;
    double t, t1, tempres, res;
    boolean x = false, y = false, z = false;
    char op;

    Container c;
    JPanel textPanel, buttonpanel;

    Calculator() {
        c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel textpanel = new JPanel();
        textField = new JTextField(50);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
		  textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent keyevent) {
				char c = keyevent.getKeyChar();
				if (c >= '0' && c <= '9') {
				} else {
					keyevent.consume();
				}
			}
		});
		textpanel.add(textField);
		buttonpanel = new JPanel();
		buttonpanel.setLayout(new GridLayout(6, 4, 3, 3));
      
      b7 = new JButton("7");
		buttonpanel.add(b7);
		b7.addActionListener(this);
      b8 = new JButton("8");
		buttonpanel.add(b8);
		b8.addActionListener(this);
      b9 = new JButton("9");
		buttonpanel.add(b9);
		b9.addActionListener(this);
      b4 = new JButton("4");
		buttonpanel.add(b4);
		b4.addActionListener(this);
      b5 = new JButton("5");
		buttonpanel.add(b5);
		b5.addActionListener(this);
      b6 = new JButton("6");
		buttonpanel.add(b6);
		b6.addActionListener(this);
      
		b1 = new JButton("1");
		buttonpanel.add(b1);
		b1.addActionListener(this);
		b2 = new JButton("2");
		buttonpanel.add(b2);
		b2.addActionListener(this);
		b3 = new JButton("3");
		buttonpanel.add(b3);
		b3.addActionListener(this);
      
      neg = new JButton("+/-");
		buttonpanel.add(neg);
		neg.addActionListener(this);
		
      b0 = new JButton("0");
		buttonpanel.add(b0);
		b0.addActionListener(this);
      
      dot = new JButton(".");
		buttonpanel.add(dot);
		dot.addActionListener(this);

		plus = new JButton("+");
		buttonpanel.add(plus);
		plus.addActionListener(this);

		min = new JButton("-");
		buttonpanel.add(min);
		min.addActionListener(this);

		mult = new JButton("*");
		buttonpanel.add(mult);
		mult.addActionListener(this);

		div = new JButton("/");
		div.addActionListener(this);
		buttonpanel.add(div);


		eq = new JButton("=");
		buttonpanel.add(eq);
		eq.addActionListener(this);

		log = new JButton("log");
		buttonpanel.add(log);
		log.addActionListener(this);
      
      ln = new JButton("ln");
		buttonpanel.add(ln);
		ln.addActionListener(this);
      
      power = new JButton("^");
		buttonpanel.add(power);
		power.addActionListener(this);

		sin = new JButton("sin");
		buttonpanel.add(sin);
		sin.addActionListener(this);
		cos = new JButton("cos");
		buttonpanel.add(cos);
		cos.addActionListener(this);
		tan = new JButton("tan");
		buttonpanel.add(tan);
		tan.addActionListener(this);
      cot = new JButton("cot");
		buttonpanel.add(cot);
		cot.addActionListener(this);
		
		clear = new JButton("C");
		buttonpanel.add(clear);
		clear.addActionListener(this);
      
		c.add("Center", buttonpanel);
		c.add("North", textpanel);
      
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public void actionPerformed(ActionEvent e) {
      String str = e.getActionCommand();
      
      if(str.equals("0")) {
         
         if (z == false) {
            textField.setText(textField.getText() + "0");
         } else {
            textField.setText("");
				textField.setText(textField.getText() + "0");
            z = false;
         }
         
      } else if (str.equals("1")) {
          
         if (z == false) {
            textField.setText(textField.getText() + "1");
         } else {
            textField.setText("");
				textField.setText(textField.getText() + "1");
            z = false;
         }
         
      } else if (str.equals("2")) {
       
         if (z == false) {
            textField.setText(textField.getText() + "2");
         } else {
            textField.setText("");
				textField.setText(textField.getText() + "2");
            z = false;
         }
         
      } else if (str.equals("3")) {
       
         if (z == false) {
            textField.setText(textField.getText() + "3");
         } else {
            textField.setText("");
				textField.setText(textField.getText() + "3");
            z = false;
         }
         
      } else if (str.equals("4")) {
       
         if (z == false) {
            textField.setText(textField.getText() + "4");
         } else {
            textField.setText("");
				textField.setText(textField.getText() + "4");
            z = false;
         }
         
      } else if (str.equals("5")) {
       
         if (z == false) {
            textField.setText(textField.getText() + "5");
         } else {
            textField.setText("");
				textField.setText(textField.getText() + "5");
            z = false;
         }
         
      } else if (str.equals("6")) {
       
         if (z == false) {
            textField.setText(textField.getText() + "6");
         } else {
            textField.setText("");
				textField.setText(textField.getText() + "6");
            z = false;
         }
         
      } else if (str.equals("7")) {
       
         if (z == false) {
            textField.setText(textField.getText() + "7");
         } else {
            textField.setText("");
				textField.setText(textField.getText() + "7");
            z = false;
         }
         
      } else if (str.equals("8")) {
       
         if (z == false) {
            textField.setText(textField.getText() + "8");
         } else {
            textField.setText("");
				textField.setText(textField.getText() + "8");
            z = false;
         }
         
      } else if (str.equals("9")) {
       
         if (z == false) {
            textField.setText(textField.getText() + "9");
         } else {
            textField.setText("");
				textField.setText(textField.getText() + "9");
            z = false;
         }
         
      } else if (str.equals("+/-")) {
         
         if (x == false) {
            textField.setText("-" + textField.getText());
            x = true;
         } else {
            textField.setText(textField.getText());
         }
         
      } else if (str.equals(".")) {
      
         if (y == false) {
            textField.setText(textField.getText() + ".");
            y = true;
         } else {
            textField.setText(textField.getText());
         }
         
      } else if (str.equals("sin")) {
      
         if (textField.getText().equals("")) {
				textField.setText("");
			} else {
				tempres = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + tempres);
			}

      } else if (str.equals("cos")) {
               
         if (textField.getText().equals("")) {
				textField.setText("");
			} else {
				tempres = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + tempres);
			}

      } else if (str.equals("tan")) {
            
         if (textField.getText().equals("")) {
				textField.setText("");
			} else {
				tempres = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + tempres);
			}

      } else if (str.equals("cot")) {
            
         if (textField.getText().equals("")) {
				textField.setText("");
			} else {
				tempres = (Math.cos(Double.parseDouble(textField.getText()))) / (Math.sin(Double.parseDouble(textField.getText())));
				textField.setText("");
				textField.setText(textField.getText() + tempres);
			}

      } else if (str.equals("log")) {
      
      if (textField.getText().equals("")) {
				textField.setText("");
			} else {
				tempres = Math.log10(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + tempres);
			}
      
      } else if (str.equals("ln")) {
      
      if (textField.getText().equals("")) {
				textField.setText("");
			} else {
				tempres = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + tempres);
			}
      
      } else if (str.equals("^")) {
         
         if (textField.getText().equals("")) {
				textField.setText("");
				t = 0;
				op = '^';
			} else {
				t = Double.parseDouble(textField.getText());
				textField.setText("");
				op = '^';
				y = false;
				x = false;
			}
         
      } else if (str.equals("+")) {
      
      if (textField.getText().equals("")) {
				textField.setText("");
				t = 0;
				op = '+';
			} else {
				t = Double.parseDouble(textField.getText());
				textField.setText("");
				op = '+';
				y = false;
				x = false;
			}
      
      } else if (str.equals("-")) {
      
         if (textField.getText().equals("")) {
				textField.setText("");
				t = 0;
				op = '-';
			} else {
				t = Double.parseDouble(textField.getText());
				textField.setText("");
				op = '-';
				y = false;
				x = false;
			}
         
      } else if (str.equals("*")) {
      
      if (textField.getText().equals("")) {
				textField.setText("");
				t = 0;
				op = '*';
			} else {
				t = Double.parseDouble(textField.getText());
				textField.setText("");
				op = '*';
				y = false;
				x = false;
			}
         
      } else if (str.equals("/")) {
         
         if (textField.getText().equals("")) {
				textField.setText("");
				t = 0;
				op = '/';
			} else {
				t = Double.parseDouble(textField.getText());
				textField.setText("");
				op = '/';
				y = false;
				x = false;
			}
         
      } else if (str.equals("=")) {
      
			if (textField.getText().equals("")) {
				textField.setText("");
			} else {
				t1 = Double.parseDouble(textField.getText());
				if (op == '+') {
				   res = t + t1;
            } else if (op == '-') {
				   res = t - t1;
            } else if (op == '*') {
				   res = t * t1;
            } else if (op == '/') {
				   res = t / t1;
            } else if (op == '^') {
               res = Math.pow(t, t1);
            }
				textField.setText("");
				textField.setText(textField.getText() + res);
				z = true;
			}
         
		} else if (str.equals("C")) {
         textField.setText("");
			x = false;
			y = false;
			z = false;
      } 
      
    }
    
    public static void main(String args[]) {

		Calculator calc = new Calculator();
		calc.setTitle("Calculator");
		calc.pack();
		calc.setVisible(true);
	}

}