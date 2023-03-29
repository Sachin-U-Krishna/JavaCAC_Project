import javax.swing.*;

public class SignUp extends JFrame{
    private JFrame h = new JFrame("Signup");
    private JPanel panelSignup;

    public SignUp() {
        h.setContentPane(panelSignup);
        h.setTitle("Hi");
        h.setSize(500,400);
        h.setVisible(true);
        h.setResizable(false);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SignUp();
    }
}
