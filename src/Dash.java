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
    private JButton removeIphone;
    private JButton removeTab;
    private JButton removeLaptop;
    private JButton removeSmartWatch;
    private JButton removeAndroid;
    private JButton removeEarphones;
    private JTable table2;
    private JButton confirmButton;

    private String DB_PASS = "Kpsy@2022";

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

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cnf = JOptionPane.showConfirmDialog(null,"Do you want to log out?");
                if(cnf==0)
                    h.dispose();
            }
        });
        removeIphone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
                    Statement stmt = con.createStatement();
                    String s = "select * from cart where id = 1";
                    ResultSet rs = stmt.executeQuery(s);
                    if(rs.next()){
                        int cnf = JOptionPane.showConfirmDialog(null,"Remove Iphone from cart?");
                        if(cnf == 0) {
                            String del = "DELETE from cart where id = 1;";
                            stmt.execute(del);
                            JOptionPane.showMessageDialog(null, "Removed Iphone from cart");
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Item not present in cart");
                }catch(Exception err){ System.out.println(err);}
            }
        });
        removeTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
                    Statement stmt = con.createStatement();
                    String s = "select * from cart where id = 2";
                    ResultSet rs = stmt.executeQuery(s);
                    if(rs.next()){
                        int cnf = JOptionPane.showConfirmDialog(null,"Remove Tab from cart?");
                        if(cnf == 0) {
                            String del = "DELETE from cart where id = 2;";
                            stmt.execute(del);
                            JOptionPane.showMessageDialog(null, "Removed Tab from cart");
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Item not present in cart");
                }catch(Exception err){ System.out.println(err);}
            }
        });
        removeLaptop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
                    Statement stmt = con.createStatement();
                    String s = "select * from cart where id = 3";
                    ResultSet rs = stmt.executeQuery(s);
                    if(rs.next()){
                        int cnf = JOptionPane.showConfirmDialog(null,"Remove Laptop from cart?");
                        if(cnf == 0) {
                            String del = "DELETE from cart where id = 3;";
                            stmt.execute(del);
                            JOptionPane.showMessageDialog(null, "Removed Laptop from cart");
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Item not present in cart");
                }catch(Exception err){ System.out.println(err);}
            }
        });
        removeSmartWatch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
                    Statement stmt = con.createStatement();
                    String s = "select * from cart where id = 4";
                    ResultSet rs = stmt.executeQuery(s);
                    if(rs.next()){
                        int cnf = JOptionPane.showConfirmDialog(null,"Remove Smart Watch from cart?");
                        if(cnf == 0) {
                            String del = "DELETE from cart where id = 4;";
                            stmt.execute(del);
                            JOptionPane.showMessageDialog(null, "Removed Smart Watch from cart");
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Item not present in cart");
                }catch(Exception err){ System.out.println(err);}
            }
        });
        removeAndroid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
                    Statement stmt = con.createStatement();
                    String s = "select * from cart where id = 5";
                    ResultSet rs = stmt.executeQuery(s);
                    if(rs.next()){
                        int cnf = JOptionPane.showConfirmDialog(null,"Remove Android Phone from cart?");
                        if(cnf == 0) {
                            String del = "DELETE from cart where id = 5;";
                            stmt.execute(del);
                            JOptionPane.showMessageDialog(null, "Removed Android Phone from cart");
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Item not present in cart");
                }catch(Exception err){ System.out.println(err);}
            }
        });
        removeEarphones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
                    Statement stmt = con.createStatement();
                    String s = "select * from cart where id = 6";
                    ResultSet rs = stmt.executeQuery(s);
                    if(rs.next()){
                        int cnf = JOptionPane.showConfirmDialog(null,"Remove Earphones from cart?");
                        if(cnf == 0) {
                            String del = "DELETE from cart where id = 6;";
                            stmt.execute(del);
                            JOptionPane.showMessageDialog(null, "Removed Earphones from cart");
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Item not present in cart");
                }catch(Exception err){ System.out.println(err);}
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

//        Order Panel code
        orders.setContentPane(orderPanel);

        // Order Button
        orderButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(orderPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
                showOrderTable();
            }
        });
        ordersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showOrderTable();
            }
        });
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
                    Statement stmt = con.createStatement();
                    String s = "select * from cart";
                    ResultSet rs = stmt.executeQuery(s);
                    if (rs.next()) {
                        int i = JOptionPane.showConfirmDialog(null,"Place Order?");
                        if(i==0){
                            JOptionPane.showMessageDialog(null,"Order Placed!\nYour Order will be delivered in 2-3 working days\n\nYou are being logged out...");
                            h.dispose();
                            new Login();
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Cart Empty!\nAdd items to cart before checkout");
                    }
                }catch(Exception err){ System.out.println(err);}
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
                product = rs.getString("Product");
                price = rs.getString("Price");
                qty = rs.getString("Quantity");
                model.addRow(new Object[]{product,price,qty});
            }
            table1.setModel(model);

        }catch(Exception err){ System.out.println(err);}
    }

    public void showOrderTable() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC","root",DB_PASS);
            Statement stmt = con.createStatement();
            String s = "select * from cart";
            ResultSet rs = stmt.executeQuery(s);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model2 = new DefaultTableModel();

            int col = rsmd.getColumnCount();
            col = col + 1;
            String[] colName = new String[col];
            colName[0] = "S.No";
            int i;
            for(i=1;i<col-1;i++){
                colName[i] = rsmd.getColumnName(i+1);
            }
            colName[i] = "Total";
            model2.setColumnIdentifiers(colName);
            String product,price,qty,costStr;
            int cost,sum=0;
            i=0;
            while (rs.next()) {
                i = i + 1;
                product = rs.getString("Product");
                price = rs.getString("Price");
                qty = rs.getString("Quantity");
                cost = Integer.parseInt(rs.getString("Price")) * Integer.parseInt(rs.getString("Quantity"));
                sum = sum + cost;
                costStr = String.valueOf(cost);
                model2.addRow(new Object[]{String.valueOf(i),product,price,qty,costStr});
            }
            model2.addRow(new Object[]{"","","","",""});
            model2.addRow(new Object[]{"","","","Total",sum});
            table2.setModel(model2);

        }catch(Exception err){ System.out.println(err);}
    }
}
