import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends JFrame{
        private JTextField username;
    private JButton login;
    private JPanel panelMain;
    private JPasswordField password;

    private JFrame h = new JFrame("Login");
    private String DB_PASS = "Kpsy@2022";
    public Login() {
        h.setContentPane(panelMain);
        h.setTitle("Hi");
        h.setSize(500,400);
        h.setVisible(true);
        h.setResizable(false);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname = username.getText();
                String pass = password.getText();

                try{
            Class.forName("com.mysql.jdbc.Driver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
                    Statement stmt = con.createStatement();
                    String s = "select * from users where username='"+uname+"' and password='"+pass+"'";
                    ResultSet rs = stmt.executeQuery(s);
                    if(rs.next()){
                        h.dispose();
                        new Dash();
                    }
                    else{
                        JOptionPane.showMessageDialog(login, "Invalid Credentials");
                    }
                }catch(Exception err){ System.out.println(err);}
            }
        });
    }
    public static void main(String[] args) {
        new Login();
    }
}
