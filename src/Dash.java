import javax.swing.*;

public class Dash extends JFrame{
    private JList list1;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel panelDash;

    private JFrame h = new JFrame("Dash");
    public Dash() {
        h.setContentPane(panelDash);
        h.setTitle("Hi");
        h.setSize(500,400);
        h.setVisible(true);
        h.setResizable(false);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Dash();
    }
}
