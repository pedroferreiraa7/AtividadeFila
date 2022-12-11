package Interfaces;
import Contato.Pedido;
import Fila.Fila1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Entregar extends JFrame implements ActionListener {
    JLabel lnumerodepedido, lplaca, lpedido, lfoto;
    JTextField tplaca, tnumerodepedido;
    JButton bproximo, bentregar, bverificarentrega, bsair;
    JTextArea tvisualizacao;
    Fila1 fila;
   
    public Entregar(Fila1 fila) {
        this.fila = fila;
        System.out.println("fila entregue " + this.fila.size());
        lnumerodepedido = new JLabel("N°Pedido:");
        tnumerodepedido = new JTextField("");
        lplaca = new JLabel("Placa:");
        lpedido = new JLabel("Pedido");
        lfoto = new JLabel("");
        tvisualizacao = new JTextArea("");
       

        bproximo = new JButton("Próximo");
        bentregar = new JButton("Entregar");
        bverificarentrega = new JButton("Verificar Entregas");
        bsair = new JButton("Sair");
        tplaca = new JTextField();

        lplaca.setBounds(80, 40, 150, 50);
        tplaca.setBounds(160, 60, 140, 20);

        lnumerodepedido.setBounds(80, 2, 150, 50);
        tnumerodepedido.setBounds(160, 20, 140, 20);

        lpedido.setBounds(80, 110, 150, 50);
        tvisualizacao.setBounds(80, 150, 190, 200);

        lfoto.setBounds(0, 0, 0, 0);
        bproximo.setBounds(410, 400, 140, 20);
        bentregar.setBounds(410, 440, 140, 20);
        bverificarentrega.setBounds(410, 480, 170, 20);
        bsair.setBounds(410, 520, 140, 20);

        this.add(lnumerodepedido);
        this.add(tnumerodepedido);
        this.add(lplaca);
        this.add(lpedido);
        this.add(lfoto);
        this.add(tplaca);
        this.add(bproximo);
        this.add(bentregar);
        this.add(bverificarentrega);
        this.add(bsair);
        this.add(tvisualizacao);

        this.setSize(700, 800);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.gray);
        
       

        bproximo.addActionListener(this);
        bentregar.addActionListener(this);
        bverificarentrega.addActionListener(this);
        bsair.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bproximo)) {
            Pedido temp = (Pedido) fila.dequeue();
             tplaca.setText(temp.getPlaca());
            tnumerodepedido.setText(temp.getNpedido()+"");
            tvisualizacao.setText(temp.getItensDoPedido());
            
        } else if (ae.getSource().equals(bentregar)){
            JOptionPane.showMessageDialog(null, "Tempo Estimado de 1 ano para a realização da Entrega!!");
            tplaca.setText(null);
            tnumerodepedido.setText(null);
            tvisualizacao.setText(null);
            
        } else if (ae.getSource().equals(bverificarentrega)) {
            JOptionPane.showMessageDialog(null, "Pedidos a serem entregues " + fila.size());
            
        } else if (ae.getSource().equals(bsair)) {
            
            this.setVisible(false);
        }
    }
}
