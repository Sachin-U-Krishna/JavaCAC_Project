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
    private JPanel Iphone;
    private JPanel Laptop;
    private JPanel Mobile;
    private JPanel Watch;
    private JPanel Earphone;
    private JPanel orderPanel;
    private JPanel Tab;
    private JButton buyButton;
    private JComboBox comboBox1;

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
