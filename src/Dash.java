import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

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
    private JButton clearCartButton;
    private JButton orderButton1;
    private JButton logoutButton;

    private String DB_PASS = "";

    private JFrame h = new JFrame("Dash");
    private JFrame cart = new JFrame("Cart");
    private JFrame orders = new JFrame("Orders");

    public Dash() {
        h.setContentPane(panelDash);
        h.setTitle("E-Kart | Dashboard");
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

//        cart Panel code
        cart.setContentPane(cartPanel);

        cartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCart();
            }
        });

//        Order Panel code
        orders.setContentPane(orderPanel);
        clearCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cnf = JOptionPane.showConfirmDialog(null,"Do you want to clear cart?");
                if(cnf==0){
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/JDBC", "root", DB_PASS);
                        Statement stmt = con.createStatement();
                        String del = "DELETE from cart";
                        stmt.execute(del);
                        JOptionPane.showMessageDialog(panelDash, "Cleared Cart");
                        showCart();
                    } catch (Exception err) {
                        System.out.println(err);
                    }
                }
            }
        });
        // // // // // // // // // // // // // // this order button is inside cart which opens order panel
        orderButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(orderPanel);
                parentPanel.repaint();
                parentPanel.revalidate();

            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cnf = JOptionPane.showConfirmDialog(null,"Do you want to log out?");
                if(cnf==0)
                    h.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Dash();
    }

    public void showCart() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
            Statement stmt = con.createStatement();
            String s = "select * from cart";
            ResultSet rs = stmt.executeQuery(s);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = new DefaultTableModel();

            int col = rsmd.getColumnCount();
            col = col - 1;
            String[] colName = new String[col];
            for(int i=0;i<col;i++){
                colName[i] = rsmd.getColumnName(i+2);
            }
            model.setColumnIdentifiers(colName);
            String id,product,price,qty;
            while (rs.next()) {
                product = rs.getString("product");
                price = rs.getString("price");
                qty = rs.getString("qty");
                model.addRow(new Object[]{product,price,qty});
            }
            table1.setModel(model);

        }catch(Exception err){ System.out.println(err);}
    }
}
