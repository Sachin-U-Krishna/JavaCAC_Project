import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
        private JTextField username;
    private JButton login;
    private JPanel panelMain;
    private JPasswordField password;

    public Login() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(login,"Hello ,"+username.getText()+" , pass " +password.getText());
            }
        });
    }
    public static void main(String[] args) {
        Login h= new Login();
        h.setContentPane(h.panelMain);
        h.setTitle("Hi");
        h.setSize(500,400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
