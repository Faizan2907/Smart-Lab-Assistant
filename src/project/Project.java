import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame{

    public static void main(String[] args) throws Exception {
        Project frameTabel = new Project();
    }

    JButton blogin = new JButton("Login");
    JPanel panel = new JPanel();
    JLabel username = new JLabel("Username:");
    JLabel password = new JLabel("Password:");
    JTextField txtadmin = new JTextField(15);
    JPasswordField pass = new JPasswordField(15);

    Project(){
        super("Login Authentication");
        setSize(400,300);
        setLocation(500,280);
        setResizable(false);
        panel.setLayout(null);

        username.setBounds(80, 65, 100, 20);
        password.setBounds(80, 110, 100, 20);
        txtadmin.setBounds(155, 65, 150, 20);
        pass.setBounds(155, 110, 150, 20);
        blogin.setBounds(160, 180, 80, 20);

        panel.add(blogin);
        panel.add(username);
        panel.add(password);
        panel.add(txtadmin);
        panel.add(pass);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionlogin();
    }

    public void actionlogin(){
        blogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String paname = txtadmin.getText();
                String ppaswd = pass.getText();
                if(paname.equals("admin") && ppaswd.equals("1234")){
                   Jframe  regFace = new Jframe("New Frame");
                    this.setVisible(false);
                   regFace.setVisible(true);
                  
                
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Password / "
                            + "Username");
                    txtadmin.setText("");
                    pass.setText("");
                    txtadmin.requestFocus();
                    }
                }

            

        
        });
    }
}