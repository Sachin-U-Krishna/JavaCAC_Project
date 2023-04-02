import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dash extends JFrame{
    private JPanel panelDash;
    private JPanel listPanel;
    private JPanel parentPanel;
    private JPanel homePanel;
    private JButton homeButton;
    private JButton cartButton;
    private JButton ordersButton;
    private JPanel cartPanel;
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
    private JComboBox androidBox1;
    private JPanel Earphones;
    private JButton buyEarphone;
    private JComboBox earphoneBox1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JButton buyIphone;
    private JComboBox iphoneBox1;
    private JTable table1;

    private String DB_PASS = "";

    private JFrame h = new JFrame("Dash");
    private JFrame cart = new JFrame("Cart");
    private JFrame orders = new JFrame("Orders");

    public Dash() {
        h.setContentPane(panelDash);
        h.setTitle("Hi");
        h.setSize(1200, 720);
        h.setVisible(true);
//        h.setResizable(false);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.blue);
        greenPanel.setBounds(10, 0, 10, 10);
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(homePanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        cartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(cartPanel);
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

//      Home Panel
        buyIphone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC", "root", DB_PASS);
                    Statement stmt = con.createStatement();
                    String del = "DELETE from cart where id = 1;";
                    stmt.execute(del);
                    String s = "INSERT into cart values(1,'Iphone',29999," + Integer.parseInt(iphoneBox1.getSelectedItem().toString()) + ");";
                    stmt.execute(s);
                    JOptionPane.showMessageDialog(panelDash, "Added to cart");
                } catch (Exception err) {
                    System.out.println(err);
                }
            }
        });

        buyTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC", "root", DB_PASS);
                    Statement stmt = con.createStatement();
                    String del = "DELETE from cart where id = 2;";
                    stmt.execute(del);
                    String s = "INSERT into cart values(2,'Tab',20000," + Integer.parseInt(tabBox1.getSelectedItem().toString()) + ");";
                    stmt.execute(s);
                    JOptionPane.showMessageDialog(panelDash, "Added to cart");
                } catch (Exception err) {
                    System.out.println(err);
                }
            }
        });
        buyLaptop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC", "root", DB_PASS);
                    Statement stmt = con.createStatement();
                    String del = "DELETE from cart where id = 3;";
                    stmt.execute(del);
                    String s = "INSERT into cart values(3,'Laptop',52000," + Integer.parseInt(laptopBox1.getSelectedItem().toString()) + ");";
                    stmt.execute(s);
                    JOptionPane.showMessageDialog(panelDash, "Added to cart");
                } catch (Exception err) {
                    System.out.println(err);
                }
            }
        });
        buySmartWatch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC", "root", DB_PASS);
                    Statement stmt = con.createStatement();
                    String del = "DELETE from cart where id = 4;";
                    stmt.execute(del);
                    String s = "INSERT into cart values(4,'Smart Watch',2500," + Integer.parseInt(smartWatchBox1.getSelectedItem().toString()) + ");";
                    stmt.execute(s);
                    JOptionPane.showMessageDialog(panelDash, "Added to cart");
                } catch (Exception err) {
                    System.out.println(err);
                }
            }
        });
        buyAndroid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC", "root", DB_PASS);
                    Statement stmt = con.createStatement();
                    String del = "DELETE from cart where id = 5;";
                    stmt.execute(del);
                    String s = "INSERT into cart values(5,'Android Phone',18999," + Integer.parseInt(androidBox1.getSelectedItem().toString()) + ");";
                    stmt.execute(s);
                    JOptionPane.showMessageDialog(panelDash, "Added to cart");
                } catch (Exception err) {
                    System.out.println(err);
                }
            }
        });
        buyEarphone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC", "root", DB_PASS);
                    Statement stmt = con.createStatement();
                    String del = "DELETE from cart where id = 6;";
                    stmt.execute(del);
                    String s = "INSERT into cart values(6,'Earphones',5000," + Integer.parseInt(earphoneBox1.getSelectedItem().toString()) + ");";
                    stmt.execute(s);
                    JOptionPane.showMessageDialog(panelDash, "Added to cart");
                } catch (Exception err) {
                    System.out.println(err);
                }
            }
        });

//        Order Panel code
        cart.setContentPane(cartPanel);


//        Order Panel code
        orders.setContentPane(orderPanel);

    }

    public static void main(String[] args) {
        new Dash();
    }
}
