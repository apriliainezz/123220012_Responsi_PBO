/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Mahasiswa;

import Controller.ControllerMahasiswa;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InputDataMahasiswa extends JFrame{
    ControllerMahasiswa controller;
    
    JLabel header = new JLabel("Input Mahasiswa");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNIM = new JLabel("NIM");
    JTextField inputNama = new JTextField();
    JTextField inputNIM = new JTextField();
    JButton tombolTambah = new JButton("Tambah Mahasiswa");
    JButton tombolKembali = new JButton("Kembali");

    public InputDataMahasiswa() {
        setVisible(true);
        setTitle("Input Mahasiswa");
        setSize(480, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);

        add(header);
        header.setFont(new Font("Times New Roman", Font.BOLD, 14));
        header.setBounds(20, 8, 440, 24);
        add(labelInputNama);
        labelInputNama.setBounds(20, 32, 440, 24);
        add(labelInputNIM);
        labelInputNIM.setBounds(20, 96, 440, 24);
        add(inputNama);
        inputNama.setBounds(18, 56, 430, 36);
        add(inputNIM);
        inputNIM.setBounds(18, 120, 430, 36);
        add(tombolTambah);
        tombolTambah.setBounds(240, 170, 195, 40);
        add(tombolKembali);
        tombolKembali.setBounds(28, 170, 195, 40);
        
        controller = new ControllerMahasiswa(this);

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataMahasiswa();
            }
        });

        tombolTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.insertMahasiswa();
            }
        });
    }
    
    public String getInputNama() {
        return inputNama.getText();
    }
    
    public String getInputNIM() {
        return inputNIM.getText();
    }
}
