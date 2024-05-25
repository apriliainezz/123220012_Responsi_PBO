/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Mahasiswa;

import Controller.ControllerMahasiswa;
import Model.Mahasiswa.ModelMahasiswa;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EditDataMahasiswa extends JFrame {
    ControllerMahasiswa controller;
    
    JLabel header = new JLabel("Edit Mahasiswa");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNIM = new JLabel("NIM");
    JTextField inputNama = new JTextField();
    JTextField inputNIM = new JTextField();
    JButton tombolEdit = new JButton("Edit Mahasiswa");
    JButton tombolKembali = new JButton("Kembali");

    public EditDataMahasiswa(ModelMahasiswa mahasiswa) {
        setVisible(true);
        setTitle("Edit Mahasiswa");
        setSize(565, 615);
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
        add(tombolEdit);
        tombolEdit.setBounds(240, 170, 195, 40);
        add(tombolKembali);
        tombolKembali.setBounds(28, 170, 195, 40);
        
        inputNama.setText(mahasiswa.getNama());
        inputNIM.setText(mahasiswa.getNim());
        
        controller = new ControllerMahasiswa(this);

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataMahasiswa();
            }
        });

        tombolEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.editMahasiswa(mahasiswa.getId());
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

