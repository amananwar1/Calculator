//Author: Aman Anwar
//“I  pledge  that  I  have  neither  given  nor  received  help  from  anyone  other  than  the 
//instructor/TA for all program components included here!” 

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Calculator extends JFrame implements ActionListener{

    JTextField textField;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plus, min, mult, div, power,
    sin, cos, tan, cot, ln, log;

    Container c;
    JPanel textPanel, buttonpanel;

    Calculator() {
        c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel textpanel = new JPanel();
        textField = new JTextField(50);
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