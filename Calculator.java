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
		buttonpanel.setLayout(new GridLayout(8, 4, 3, 3));
      
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

		sin = new JButton("SIN");
		buttonpanel.add(sin);
		sin.addActionListener(this);
		cos = new JButton("COS");
		buttonpanel.add(cos);
		cos.addActionListener(this);
		tan = new JButton("TAN");
		buttonpanel.add(tan);
		tan.addActionListener(this);
		
		clear = new JButton("C");
		buttonpanel.add(clear);
		clear.addActionListener(this);
		c.add("Center", buttonpanel);
		c.add("North", textpanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public void actionPerformed(ActionEvent e) {

    }
    
    public static void main(String args[]) {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
		}
		Calculator calc = new Calculator();
		calc.setTitle("Calculator");
		calc.pack();
		calc.setVisible(true);
	}

}