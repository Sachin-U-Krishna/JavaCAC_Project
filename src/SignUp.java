import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SignUp extends JFrame  {
    private JPanel panelSignup;
    private JTextField firstname;
    private JTextField email;
    private JTextField password;
    private JComboBox comboBox1;
    private JFormattedTextField phone;
    private JTextField lastname;
    private JButton submitSignUp;
    private JComboBox comboBox2;
    private JButton cancelButton;

    private JLabel GenderSelected;
    private JFrame frame = new JFrame("SignUp");
    private String DB_PASS = "";
    public SignUp() {
        frame.setContentPane(panelSignup);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Hi");
        frame.setSize(600,900);
        frame.setResizable(false);
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //GenderSelected.setText("" + comboBox1.getSelectedItem());
            }
        });

        submitSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.cj.Driver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
                    Statement stmt = con.createStatement();
                    String s = "INSERT into users(firstname,lastname,email,password,phone,gender,location) values('"+firstname.getText()+"','"+lastname.getText()+"','"+email.getText()+"','"+password.getText()+"','"+phone.getText()+"','"+comboBox1.getSelectedItem().toString()+"','"+comboBox2.getSelectedItem().toString()+"')";
                    stmt.execute(s);
                    JOptionPane.showMessageDialog(panelSignup, "User Registered");
                    frame.dispose();
                    new Login();
                }catch(Exception err){ System.out.println(err);}
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Login();
            }
        });
    }


    public static void main(String[] args) {
        new SignUp();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}