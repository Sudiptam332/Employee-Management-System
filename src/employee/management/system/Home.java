package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove;
    
    Home() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(550, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 80, 650, 450);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(600, 200, 450, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 30));
        add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(650, 280, 150, 40);
        add.addActionListener(this);
        add(add);
        
        view = new JButton("View Employees");
        view.setBounds(820, 280, 150, 40);
        view.addActionListener(this);
        add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(650, 340, 150, 40);
        update.addActionListener(this);
        add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(820, 340, 150, 40);
        remove.addActionListener(this);
        add(remove);
        
        setSize(1120, 630);
        setLocation(120, 60);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
