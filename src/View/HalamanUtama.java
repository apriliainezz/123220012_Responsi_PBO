/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import View.Dosen.ViewDataDosen;
import View.Mahasiswa.ViewDataMahasiswa;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HalamanUtama extends JFrame implements ActionListener{
    String username;
    String gender;
    
    JLabel header = new JLabel("Hai, Selamat Datang Ya!");
    JLabel label1 = new JLabel("Silahkan Pilih Data yang Ingin Anda Lihat :");
    JLabel label2 = new JLabel("Informasi Data Mahasiswa");
    JLabel label3 = new JLabel("Informasi Data Dosen");
    
            
    JButton tombolmhs = new JButton("Mahasiswa");
    JButton tomboldsn = new JButton("Dosen");
    JButton tombolexit = new JButton("Keluar / Exit");
    
    public HalamanUtama(){
       
        
        setVisible(true);
        setSize(565, 505);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        header.setFont(new Font("Times New Roman", Font.BOLD, 24));
        header.setBounds(25,25,330,35);
        
        
        add(label1);
        label1.setBounds(25, 65, 330, 35);
        add(label2);
        label2.setBounds(190 , 155, 330, 35);
        add(label3);
        label3.setBounds(204, 255, 330, 35);
        
        
        add(tombolmhs);
        tombolmhs.setFont(new Font("Times New Roman", Font.BOLD, 14));
        tombolmhs.setBounds(25, 190, 490, 35);
        add(tomboldsn);
        tomboldsn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        tomboldsn.setBounds(25, 285, 490, 35);
        add(tombolexit);
        tombolexit.setFont(new Font("Arial", Font.BOLD, 14));
        tombolexit.setBounds(25, 390, 490, 35);
        
        tombolmhs.addActionListener(this);
        tomboldsn.addActionListener(this);
        tombolexit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==tombolmhs){
                dispose();
                new ViewDataMahasiswa();
            } else if(e.getSource()==tomboldsn){
                dispose();
                new ViewDataDosen();
            } else if(e.getSource()==tombolexit){
                System.exit(0);
            }
        } catch(Exception error){
            JOptionPane.showMessageDialog(null,"Database belum terhubung, \n tolong nyalakan XAMPP");
            System.exit(0);
        }
    }
}

