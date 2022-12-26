
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sansk
 */

    

public class NewFrame extends JFrame{

    public static void main(String[] args){
        NewFrame frameTabel = new NewFrame();
    }
    JLabel welcome = new JLabel("******Welcome to MYSOFT Sdn Bhd!******", 
            SwingConstants.CENTER);
    JLabel dms = new JLabel("Delivery Management System");
    JPanel panel = new JPanel();

    NewFrame(){
        super("Welcome!");
        setSize(400,300);
        setLocation(500,280);
        setResizable(false);
        panel.setLayout(null);

        welcome.setBounds(60, 70, 300, 60);
        dms.setBounds(125, 100, 300, 60);

        panel.add(welcome);
        panel.add(dms);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

