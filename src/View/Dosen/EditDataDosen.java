/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Dosen;

import Controller.ControllerDosen;
import Model.Dosen.ModelDosen;
import View.Dosen.ViewDataDosen;
import java.awt.Font;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class EditDataDosen extends JFrame {
    ControllerDosen controller;
    String Username;
    String Gender;
    
    JLabel header = new JLabel("Edit Dosen");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNoHP = new JLabel("No HP");
    JLabel labelInputEmail = new JLabel("Email");
    JTextField inputNama = new JTextField();
    JTextField inputNoHP = new JTextField();
    JTextField inputEmail = new JTextField();
    JButton tombolEdit = new JButton("Edit Dosen");
    JButton tombolKembali = new JButton("Kembali");

    public EditDataDosen(ModelDosen dosen) {
        setVisible(true);
        setTitle("Edit Dosen");
        setSize(565, 615);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);

        add(header);
        header.setFont(new Font("Times New Roman", Font.BOLD, 14));
        header.setBounds(20, 8, 440, 24);
        add(labelInputNama);
        labelInputNama.setBounds(20, 32, 440, 24);
        add(labelInputNoHP);
        labelInputNoHP.setBounds(20, 96, 440, 24);
        add(labelInputEmail);
        labelInputEmail.setBounds(20, 165, 440, 24);
        add(inputNama);
        inputNama.setBounds(18, 56, 430, 36);
        add(inputNoHP);
        inputNoHP.setBounds(18, 120, 430, 36);
        add(inputEmail);
        inputEmail.setBounds(18, 190, 430, 36);
        add(tombolEdit);
        tombolEdit.setBounds(240, 234, 195, 40);
        add(tombolKembali);
        tombolKembali.setBounds(28, 234, 195, 40);
        
        inputNama.setText(dosen.getNama());
        inputNoHP.setText(dosen.getNoHP());
        inputEmail.setText(dosen.getEmail());
        
        controller = new ControllerDosen(this);

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataDosen();
            }
        });

        tombolEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.editDosen(dosen.getId());
            }
        });
    }
   
    public String getInputNama() {
        return inputNama.getText();
    }
    
    public String getInputNoHP() {
        return inputNoHP.getText();
    }
    
    public String getInputEmail() {
        return inputEmail.getText();
    }
}
