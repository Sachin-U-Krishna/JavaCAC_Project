import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame  {
    private JPanel panelSignup;
    private JTextField firstName;
    private JTextField email;
    private JTextField createPassword;
    private JComboBox comboBox1;
    private JFormattedTextField a91FormattedTextField;
    private JTextField lastNameTextField;
    private JButton submitSignUp;
    private JComboBox comboBox2;

    private JLabel GenderSelected;
    private JFrame frame = new JFrame("SignUp");
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