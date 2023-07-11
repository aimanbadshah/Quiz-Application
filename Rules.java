package quizapplication.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    private String name;
    JButton start, back;
    
    Rules(String name){
        this.name = name;
        JLabel heading = new JLabel("Welcome " + name + " to your quiz");
        heading.setBounds(50, 40, 500, 50);
        heading.setFont(new Font(("Viner Hand ITC"), Font.BOLD, 26));
        heading.setForeground(Color.blue);
        add(heading);
        
        JLabel statement = new JLabel("Read the following rules carefully:");
        statement.setBounds(50, 80, 500, 50);
        statement.setFont(new Font(("Times New Roman"), Font.BOLD, 20));
        add(statement);
        
        JLabel rules = new JLabel("Welcome " + name + " to your quiz");
        rules.setBounds(50, 30, 500, 350);
        rules.setFont(new Font(("Times New Roman"), Font.PLAIN, 18));
        rules.setText(
                "<html>" +
                        "1. Allah is watching you if not your teacher." + "<br>" +
                        "2. You are supposed to do the quiz on your own." + "<br>" +
                        "3. You would be allowed only 15 seconds per MCQ" + "<br>" +
                        "4. Re-submission is not allowed so submit your answer after checking it thoroughly." + "<br>" +
                        "5. The text will be submitted automatically even if you fail to submit it." + "<br>" +
                        "6. Good Luck on your quiz" + "<br>" +
                "</html>"
        );
        add(rules);
         
        back = new JButton("back");
        back.setBounds(80, 300, 100, 30);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        
        start = new JButton("start");
        start.setBounds(190, 300, 100, 30);
        start.setBackground(Color.blue);
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);
       
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        setSize(800, 650);
        setLocation(320, 60);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        } else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
    
}
