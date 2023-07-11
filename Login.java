package quizapplication.project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules, exit;
    JTextField textField;
    
    Login(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Quiz Time");
        heading.setBounds(680, 50, 500, 50);
        heading.setFont(new Font(("Viner Hand ITC"), Font.BOLD, 45));
        heading.setForeground(Color.blue);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(700, 80, 500, 150);
        name.setFont(new Font(("Times New Roman"), Font.BOLD, 25));
        name.setForeground(Color.blue);
        add(name);
        
        textField = new JTextField();
        textField.setBounds(680, 200, 230, 30);
        textField.setFont(new Font(("Times New Roman"), Font.PLAIN, 18));
        add(textField);
        
        rules = new JButton("Rules");
        rules.setBounds(680, 250, 100, 30);
        rules.setBackground(Color.blue);
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);
        
        exit = new JButton("Exit");
        exit.setBounds(800, 250, 100, 30);
        exit.setBackground(Color.blue);
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        add(exit);
        
        setVisible(true);
        setSize(1000, 500);
        setLocation(150, 150);  
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            setVisible(false);
            String name = textField.getText();
            new Rules(name);
        }
        else if(ae.getSource() == exit)
            setVisible(false);
    }
    
    public static void main(String[] args) {
        //new Login();
        new Score("User", 0);
    }
    
}
