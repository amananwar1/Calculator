//Author: Aman Anwar
//I  pledge  that  I  have  neither  given  nor  received  help  from  anyone  other  than  the 
//instructor/TA for all program components included here!

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Stack;
import java.lang.Character;
import java.util.ArrayList;
//import javax.swing.event.*;

public class Calculator extends JFrame implements ActionListener{

    JTextField textField;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, neg, plus, min,
    mult, div, power, dot, sin, cos, tan, cot, ln, log, eq, clear,
    lpar, rpar, lbrack, rbrack;
    //double t, t1, tempres, res;
    boolean x = true, y = true, z = false; 
    //z = false;
    //char c;
    String expresssion = new String("");

    Container c;
    JPanel textPanel, buttonpanel;

    Calculator() {
        c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel textpanel = new JPanel();
        textField = new JTextField(35);
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
      
      sin = new JButton("sin");
		buttonpanel.add(sin);
		sin.addActionListener(this);
		cos = new JButton("cos");
		buttonpanel.add(cos);
      cos.addActionListener(this);
      
      b4 = new JButton("4");
		buttonpanel.add(b4);
		b4.addActionListener(this);
      b5 = new JButton("5");
		buttonpanel.add(b5);
		b5.addActionListener(this);
      b6 = new JButton("6");
		buttonpanel.add(b6);
		b6.addActionListener(this);
      
      tan = new JButton("tan");
		buttonpanel.add(tan);
		tan.addActionListener(this);
      cot = new JButton("cot");
		buttonpanel.add(cot);
		cot.addActionListener(this);
      
		b1 = new JButton("1");
		buttonpanel.add(b1);
		b1.addActionListener(this);
		b2 = new JButton("2");
		buttonpanel.add(b2);
		b2.addActionListener(this);
		b3 = new JButton("3");
		buttonpanel.add(b3);
		b3.addActionListener(this);
      
      log = new JButton("log");
		buttonpanel.add(log);
		log.addActionListener(this);
      
      ln = new JButton("ln");
		buttonpanel.add(ln);
		ln.addActionListener(this);
      
      neg = new JButton("+/-");
		buttonpanel.add(neg);
		neg.addActionListener(this);
      
      b0 = new JButton("0");
		buttonpanel.add(b0);
		b0.addActionListener(this);
      
      dot = new JButton(".");
		buttonpanel.add(dot);
		dot.addActionListener(this);
      
      lpar = new JButton("(");
		buttonpanel.add(lpar);
		lpar.addActionListener(this);
      rpar = new JButton(")");
		buttonpanel.add(rpar);
		rpar.addActionListener(this);
      
      plus = new JButton("+");
		buttonpanel.add(plus);
		plus.addActionListener(this);
      
      eq = new JButton("=");
		buttonpanel.add(eq);
		eq.addActionListener(this);
      
      min = new JButton("-");
		buttonpanel.add(min);
		min.addActionListener(this);
      
      lbrack = new JButton("{");
		buttonpanel.add(lbrack);
		lbrack.addActionListener(this);
      
      rbrack = new JButton("}");
		buttonpanel.add(rbrack);
		rbrack.addActionListener(this);
      
      mult = new JButton("*");
		buttonpanel.add(mult);
		mult.addActionListener(this);
      
      div = new JButton("/");
		div.addActionListener(this);
		buttonpanel.add(div);
      
      power = new JButton("^");
		buttonpanel.add(power);
		power.addActionListener(this);
		
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
         
        // if (z == false) {
            //textField.setText(textField.getText() + "0");
         //} else {
            //textField.setText("");
				textField.setText(textField.getText() + "0");
            x = false;
            y = false;
           // z = false;
         //}
         
      } else if (str.equals("1")) {
          
         //if (z == false) {
            //textField.setText(textField.getText() + "1");
         //} else {
            //textField.setText("");
				textField.setText(textField.getText() + "1");
            x = false;
            y = false;
           // z = false;
         //}
         
      } else if (str.equals("2")) {
       
       //  if (z == false) {
           // textField.setText(textField.getText() + "2");
         //} else {
            //textField.setText("");
				textField.setText(textField.getText() + "2");
            x = false;
            y = false;
           // z = false;
         //}
         
      } else if (str.equals("3")) {
       
      //   if (z == false) {
        //    textField.setText(textField.getText() + "3");
         //} else {
            //textField.setText("");
				textField.setText(textField.getText() + "3");
            x = false;
            y = false;
           // z = false;
         //}
         
      } else if (str.equals("4")) {
       
         //if (z == false) {
            //textField.setText(textField.getText() + "4");
         //} else {
            //textField.setText("");
				textField.setText(textField.getText() + "4");
            x = false;
            y = false;
            //z = false;
         //}
         
      } else if (str.equals("5")) {
       
         //if (z == false) {
            textField.setText(textField.getText() + "5");
            x = false;
            y = false;
         //} else {
            //textField.setText("");
				//textField.setText(textField.getText() + "5");
           // z = false;
         //}
         
      } else if (str.equals("6")) {
       
         //if (z == false) {
            //textField.setText(textField.getText() + "6");
         //} else {
            //textField.setText("");
				textField.setText(textField.getText() + "6");
            x = false;
            y = false;
           // z = false;
         //}
         
      } else if (str.equals("7")) {
       
         //if (z == false) {
            //textField.setText(textField.getText() + "7");
        // } else {
            //textField.setText("");
				textField.setText(textField.getText() + "7");
            x = false;
            y = false;
            //z = false;
         //}
         
      } else if (str.equals("8")) {
       
         //if (z == false) {
            //textField.setText(textField.getText() + "8");
         //} else {
            //textField.setText("");
				textField.setText(textField.getText() + "8");
            x = false;
            y = false;
           // z = false;
         //}
         
      } else if (str.equals("9")) {
       
         //if (z == false) {
            //textField.setText(textField.getText() + "9");
         //} else {
            //textField.setText("");
				textField.setText(textField.getText() + "9");
            x = false;
            y = false;
           // z = false;
        // }
         
      } else if (str.equals("+/-")) {
         
         if (y == false) {
            textField.setText("-" + textField.getText());
            y = true;
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
      /*
         if (textField.getText().equals("")) {
				textField.setText("");
			} else {*/
				//tempres = Math.sin(Double.parseDouble(textField.getText()));
				//textField.setText("");
            textField.setText(textField.getText() + "sin(");
				//textField.setText(textField.getText() + tempres);
			//}

      } else if (str.equals("cos")) {
         /*      
         if (textField.getText().equals("")) {
				textField.setText("");
			} else {*/
				//tempres = Math.cos(Double.parseDouble(textField.getText()));
				//textField.setText("");
            textField.setText(textField.getText() + "cos(");
				//textField.setText(textField.getText() + tempres);
			//}

      } else if (str.equals("tan")) {
          /*  
         if (textField.getText().equals("")) {
				textField.setText("");
			} else {*/
				//tempres = Math.tan(Double.parseDouble(textField.getText()));
				//textField.setText("");
            textField.setText(textField.getText() + "tan(");
				//textField.setText(textField.getText() + tempres);
			//}

      } else if (str.equals("cot")) {
         /*   
         if (textField.getText().equals("")) {
				textField.setText("");
			} else {*/
				//tempres = (Math.cos(Double.parseDouble(textField.getText()))) / (Math.sin(Double.parseDouble(textField.getText())));
				//textField.setText("");
            textField.setText(textField.getText() + "cot(");
				//textField.setText(textField.getText() + tempres);
			//}

      } else if (str.equals("log")) {
      /*
      if (textField.getText().equals("")) {
				textField.setText("");
			} else {)*/
				//tempres = Math.log10(Double.parseDouble(textField.getText()));
				//textField.setText("");
            textField.setText(textField.getText() + "log(");
				//textField.setText(textField.getText() + tempres);
			//}
      
      } else if (str.equals("ln")) {
      /*
      if (textField.getText().equals("")) {
				textField.setText("");
			} else {*/
				//tempres = Math.log(Double.parseDouble(textField.getText()));
				//textField.setText("");
            textField.setText(textField.getText() + "ln(");
				//textField.setText(textField.getText() + tempres);
			//}
      
      } else if (str.equals("^")) {
         
         if (textField.getText().equals("")) {
				textField.setText("");
            //textField.setText(textField.getText() + "^");
				//t = 0;
				//op = '^';
			} else {
				//t = Double.parseDouble(textField.getText());
				//textField.setText("");
            textField.setText(textField.getText() + "^");
				//op = '^';
				//y = false;
				//x = false;
			}
         
      } else if (str.equals("+")) {
      
      //if (textField.getText().equals("")) {
				//textField.setText("");
				//t = 0;
				//op = '+';
			//} else {
				//t = Double.parseDouble(textField.getText());
				//textField.setText("");
            if ( x == false) {
               textField.setText(textField.getText() + "+");
               x = true;
            }
				//op = '+';
				//y = false;
				//x = false;
			//}
      
      } else if (str.equals("-")) {
      
         //if (textField.getText().equals("")) {
				//textField.setText("");
				//t = 0;
				//op = '-';
			//} else {
				//t = Double.parseDouble(textField.getText());
				//textField.setText("");
            if ( x == false) {
               textField.setText(textField.getText() + "-");
               x = true;
            }
				//op = '-';
				//y = false;
				//x = false;
			//}
         
      } else if (str.equals("*")) {
      
      //if (textField.getText().equals("")) {
				//textField.setText("");
				//t = 0;
				//op = '*';
			//} else {
				//t = Double.parseDouble(textField.getText());
				//textField.setText("");
            if ( x == false) {
               textField.setText(textField.getText() + "*");
               x = true;
            }
				//op = '*';
				//y = false;
				//x = false;
			//}
         
      } else if (str.equals("/")) {
         
         //if (textField.getText().equals("")) {
				//textField.setText("");
				//t = 0;
				//op = '/';
			//} else {
				//t = Double.parseDouble(textField.getText());
				//textField.setText("");
            if ( x == false) {
               textField.setText(textField.getText() + "/");
               x = true;
            }
				//op = '/';
				//y = false;
				//x = false;
			//}
      } else if (str.equals("(")) {
          textField.setText(textField.getText() + "(");
      }
      
      else if (str.equals(")")) {
          textField.setText(textField.getText() + ")");
      }
      
      else if (str.equals("{")) {
          textField.setText(textField.getText() + "{");
      }
      
      else if (str.equals("}")) {
          textField.setText(textField.getText() + "}");
      
      } else if (str.equals("=")) {
      
			if (textField.getText().equals("")) {
				textField.setText("");
			} else {
         /*
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
            */
            String s = infixToRpn(textField.getText());
            System.out.println(s);
            if (s.equals("This expression is invalid")) {
               textField.setText(infixToRpn(textField.getText()));
            } else {
               
               ArrayList<Character> numbers = new ArrayList<Character>();
               ArrayList<Character> operators = new ArrayList<Character>();
               
               for (int i = s.length() - 1; i >= 0; i--) {
                  
                  char c = s.charAt(i);
                  
                  if (Character.isDigit(c)) {
                     numbers.add(s.charAt(i));
                     //System.out.println(numbers.get(i));
                  }

                  
               }
               
               for (int i = 0; i < s.length(); i++) {
               
                  char c = s.charAt(i);
                  
                  if (!Character.isDigit(c)) {
                     operators.add(s.charAt(i));
                     //System.out.println(operators.get(i));
                     if(s.charAt(i) == 's') {
                        i += 3;
                     } else if(s.charAt(i) == 'c') {
                        i += 3;
                     } else if(s.charAt(i) == 't') {
                        i += 3;
                     } else if(s.charAt(i) == 'l') {
                        i += 3;
                     } else if(s.charAt(i) == 'c') {
                        i += 3;
                     } else if(s.charAt(i) == 'c') {
                        i += 3;
                     }
                  }

               }
               
               for (int i = 0; i < numbers.size(); i++) {
                  System.out.println(numbers.get(i));
               }
               
               for (int i = 0; i < operators.size(); i++) {
                  System.out.println(operators.get(i));
               }
               
               double sum = 0;
               
               for (int i = 0; i < operators.size(); i ++) {
                  
                  if (operators.get(i) == '+') {

                     double x = (double)numbers.get(i+1) - '0';
                     double y = (double)numbers.get(i) - '0';
                     sum += x + y;
                     System.out.println(x);
                     System.out.println(y);
                     System.out.println(sum);
                  } else if (operators.get(i) == '-') {
                     
                     double x = (double)numbers.get(i+1) - '0';
                     double y = (double)numbers.get(i) - '0';
                     sum += x - y;
                     System.out.println(x);
                     System.out.println(y);
                     System.out.println(sum);
                  } else if (operators.get(i) == '*') {
                  
                     double x = (double)numbers.get(i+1) - '0';
                     double y = (double)numbers.get(i) - '0';
                     sum += x * y;
                     System.out.println(x);
                     System.out.println(y);
                     System.out.println(sum);
                  } else if (operators.get(i) == '/') {
                  
                     double x = (double)numbers.get(i+1) - '0';
                     double y = (double)numbers.get(i) - '0';
                     sum += x / y;
                     System.out.println(x);
                     System.out.println(y);
                     System.out.println(sum);
                  } else if (operators.get(i) == '^') {
                  
                     double x = (double)numbers.get(i+1) - '0';
                     double y = (double)numbers.get(i) - '0';
                     sum += Math.pow(x, y);
                     System.out.println(x);
                     System.out.println(y);
                     System.out.println(sum);
                  } else if (operators.get(i) == 's') {
                  
                     //double x = (double)numbers.get(i+1) - '0';
                     double y = (double)numbers.get(i) - '0';
                     sum += Math.sin(y);
                     System.out.println(x);
                     System.out.println(y);
                     System.out.println(sum);
                  } else if (operators.get(i) == 'c') {
                  
                     //double x = (double)numbers.get(i+1) - '0';
                     double y = (double)numbers.get(i) - '0';
                     sum += Math.cos(y);
                     System.out.println(x);
                     System.out.println(y);
                     System.out.println(sum);
                  } else if (operators.get(i) == 't') {
                  
                     //double x = (double)numbers.get(i+1) - '0';
                     double y = (double)numbers.get(i) - '0';
                     sum += Math.tan(y);
                     System.out.println(x);
                     System.out.println(y);
                     System.out.println(sum);
                  } else if (operators.get(i) == 'l') {
                  
                     //double x = (double)numbers.get(i+1) - '0';
                     double y = (double)numbers.get(i) - '0';
                     sum += Math.log10(y);
                     System.out.println(x);
                     System.out.println(y);
                     System.out.println(sum);
                  }
                  
               }
               
               String sStr = String.valueOf(sum);
               textField.setText(sStr);
               
            }
            
			}
         
		} else if (str.equals("C")) {
         textField.setText("");
			x = false;
			y = false;
			z = false;
      } 
      
    }
    
    
    //-----External Source Code: https://www.geeksforgeeks.org/java-program-to-implement-shunting-yard-algorithm/ Start-----
    
    // Method is used to get the precedence of operators
	private static boolean letterOrDigit(char c)
	{
		// boolean check
		if (Character.isLetterOrDigit(c))
			return true;
		else
			return false;
	}

	// Operator having higher precedence
	// value will be returned
	static int getPrecedence(char ch)
	{

		if (ch == '+' || ch == '-')
			return 1;
		else if (ch == '*' || ch == '/')
			return 2;
		else if (ch == '^')
			return 3;
		else
			return -1;
	}
	
	// Operator has Left --> Right associativity
	static boolean hasLeftAssociativity(char ch) {
		if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
			return true;
		} else {
			return false;
		}
	}

	// Method converts given infixto postfix expression
	// to illustrate shunting yard algorithm
	static String infixToRpn(String expression)
	{
		// Initialising an empty String
		// (for output) and an empty stack
		Stack<Character> stack = new Stack<>();

		// Initially empty string taken
		String output = new String("");

		// Iterating over tokens using inbuilt
		// .length() function
		for (int i = 0; i < expression.length(); ++i) {
			// Finding character at 'i'th index
			char c = expression.charAt(i);

			// If the scanned Token is an
			// operand, add it to output
			if (letterOrDigit(c))
				output += c;

			// If the scanned Token is an '('
			// push it to the stack
			else if (c == '(')
				stack.push(c);

			// If the scanned Token is an ')' pop and append
			// it to output from the stack until an '(' is
			// encountered
			else if (c == ')') {
				while (!stack.isEmpty()
					&& stack.peek() != '(')
					output += stack.pop();

				stack.pop();
			}

			// If an operator is encountered then taken the
			// further action based on the precedence of the
			// operator

			else {
				while (
					!stack.isEmpty()
					&& getPrecedence(c)
						<= getPrecedence(stack.peek()) 
					&& hasLeftAssociativity(c)) {
					// peek() inbuilt stack function to
					// fetch the top element(token)

					output += stack.pop();
				}
				stack.push(c);
			}
		}

		// pop all the remaining operators from
		// the stack and append them to output
		while (!stack.isEmpty()) {
			if (stack.peek() == '(')
				return "This expression is invalid";
			output += stack.pop();
		}
		return output;
	}
   
   
   //-----External Source Code End-----
    
    public static void main(String args[]) {

		Calculator calc = new Calculator();
		calc.setTitle("Calculator");
		calc.pack();
		calc.setVisible(true);
	}

}