package Interfaces;

import Fila.Fila1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaPrincipal extends JFrame implements ActionListener {

    JLabel ltitulo;
    JLabel lfoto;
    JButton befetuapedido, bsair, bentregapedido;
    Fila1 fila;
   
    public TelaPrincipal() {
    
        fila = new Fila1();
        ltitulo = new JLabel("--Sextou Lanches--");
        befetuapedido = new JButton("Efetuar Pedido");
        bentregapedido = new JButton("Entregar Pedido");
        bsair = new JButton("Sair");
        lfoto = new JLabel("");
        
        ImageIcon img1 = new ImageIcon("src/Imagens/lazaro2.jpg");
        lfoto.setIcon(img1);
        ltitulo.setFont(new Font("Serif", Font.ROMAN_BASELINE, 35));
        ltitulo.setForeground(Color.green);
        ltitulo.setBounds(270, 12, 550, 90);
        befetuapedido.setBounds(170, 90, 160, 40);
        bentregapedido.setBounds(170, 140, 160, 40);
        bsair.setBounds(170, 190, 160, 40);
        lfoto.setBounds(370, 10, 400, 500);
      

        this.add(bsair);
        this.add(befetuapedido);
        this.add(bentregapedido);
        this.add(ltitulo);
        this.add(lfoto);
       
       

        befetuapedido.addActionListener(this);
        bsair.addActionListener(this);
        bentregapedido.addActionListener(this);
       

        this.setSize(700, 800);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.gray);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(befetuapedido)) {
            Menu menu = new Menu(fila);
        } else if (ae.getSource().equals(bsair)) {
            this.setVisible(false);
        } else if (ae.getSource().equals(bentregapedido)) {
            Entregar entregar = new Entregar(fila);
        } 
    }
}