/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class loginPage extends JFrame implements ActionListener{
    JLabel header = new JLabel("Selamat Datang !");
    JLabel ket1 = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel username = new JLabel ("Username");
    JLabel pw = new JLabel ("Password");
    JLabel gender = new JLabel ("Jenis Kelamin");
    
    JTextField inputUsername = new JTextField();
    JTextField inputPW = new JTextField();
    
    JRadioButton genLK = new JRadioButton("Laki-Laki");
    JRadioButton genPR = new JRadioButton("Perempuan");
    JButton login = new JButton("Login");

    public loginPage() throws HeadlessException {
        setVisible(true);
        setSize(750,740);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        header.setFont(new Font("arial", Font.BOLD, 21));
        header.setBounds(30, 30, 200, 40);
        
        add(ket1);
        ket1.setFont(new Font("arial", Font.BOLD, 15));
        ket1.setBounds(30, 60, 300, 40);
        
        add(username);
        username.setBounds(30, 92, 200, 40);
        
        add(pw);
        pw.setBounds(30, 152, 200, 40);
        
        add(gender);
        gender.setBounds(30, 220, 200, 40);
        
        add(inputUsername);
        inputUsername.setBounds(30, 122, 485, 35);
        
        add(inputPW);
        inputPW.setBounds(30, 182, 485, 35);
        
        ButtonGroup pilihGender = new ButtonGroup();
        pilihGender.add(genLK);
        pilihGender.add(genPR);
        
        add(genLK);
        genLK.setBounds(30, 255, 105, 30);
        
        add(genPR);
        genPR.setBounds(205, 255, 105, 30);
        
        add(login);
        login.setBounds(30, 300, 500, 40);
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
                String Username = inputUsername.getText();
                String password = inputPW.getText();
                String Gender = genLK.isSelected() ? "Mr. " : "Mrs. " ;
                
                if(Username.isEmpty()){
                    throw new Exception("Sowry, Jangan Kosong !");
                }
                else if (password.isEmpty()){
                    throw new Exception("Maaf, Password Masih Kosong!");
                }
                
            
                new HalamanUtama();
                this.dispose();
            
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
        
    }
    
}

