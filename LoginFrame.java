/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
//import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class LoginFrame extends JFrame{
    //panels
    private JPanel headingPnl;
    private JPanel detailsPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    
    //textfields
    private JTextField usernameTxtFld;
    
    //password field
    private JPasswordField passwordFld;
    
    //buttons
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public LoginFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(300,400);
        setTitle("Login page");
        setResizable(true);
        
        //create panels
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        detailsPnl = new JPanel(new GridLayout(2,1,1,1));
        detailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Login details"));
        
        mainPnl = new JPanel(new BorderLayout());
        
        //create label
        headingLbl = new JLabel("Login");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 30));
        headingLbl.setForeground(Color.RED);
        
        usernameLbl = new JLabel("Username: ");
        passwordLbl = new JLabel("Password: ");
        
        //create textfield;
        usernameTxtFld = new JTextField(10);
        
        //create password field
        passwordFld = new JPasswordField(10);
        
        //create buttons
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add labels to panels
        headingPnl.add(headingLbl);
        
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTxtFld);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordFld);
        
        detailsPnl.add(usernamePnl);
        detailsPnl.add(passwordPnl);
        
        btnsPnl.add(submitBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(detailsPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        //pack the frame
        pack();
        
        setVisible(true);
        
    }
}
