import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dash extends JFrame{
    private JPanel panelDash;
    private JPanel listPanel;
    private JPanel parentPanel;
    private JPanel homePanel;
    private JButton homeButton;
    private JButton profileButton;
    private JButton ordersButton;
    private JPanel profilePanel;
    private JPanel orderPanel;
    private JPanel panel1;
    private JPanel Tab;
    private JButton buyTab;
    private JComboBox tabBox1;
    private JPanel Laptop;
    private JButton buyLaptop;
    private JComboBox laptopBox1;
    private JPanel SmartWatch;
    private JButton buySmartWatch;
    private JComboBox smartWatchBox1;
    private JPanel AndroidPhone;
    private JButton buyAndroid;
    private JComboBox androisBox1;
    private JPanel Earphones;
    private JButton buyEarphone;
    private JComboBox earphoneBox1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;

    private JFrame h = new JFrame("Dash");

    public Dash() {
        h.setContentPane(panelDash);
        h.setTitle("Hi");
        h.setSize(1600,1200);
        h.setVisible(true);
        //h.setResizable(false);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.blue);
        greenPanel.setBounds(250,0,250,250);
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(homePanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(profilePanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        ordersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(orderPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
    }

    public static void main(String[] args) {
        new Dash();
    }
}
