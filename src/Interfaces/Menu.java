spackage Interfaces;

import Contato.Pedido;
import Contato.Produtos;
import Fila.Fila1;
import Interfaces.TelaPrincipal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Menu extends JFrame implements ActionListener {

    JLabel lpedido, lplacacarro, llanches, lbebidas, lvisualizacao, lvalortotal, lqtd;
    JLabel lbttfrita, lhmb, lpizza, ltaco;
    JLabel lcafe, lsuco, lrefri, lagua;
    JLabel plbttfrita, phmb, ppizza, ptaco;
    JLabel pcafe, psuco, prefri, pagua;
    JTextField tpedido, tplacacarro;
    JButton bmenuinicial, blimpapedido, badicionar, bconfirmarpedido;
    JComboBox cbqtd;
    JCheckBox cbttfrita, chmb, cpizza, ctaco,
            ccafe, csuco, crefri, cagua;
    JTextArea tavisualizacao;
    String itensdopedido = "";
    double valortotal = 0;
    Fila1 fila;
    int contador;
    ButtonGroup bgbotao;

    public Menu(Fila1 fila) {
        this.contador = 1;
        this.fila = fila;

        plbttfrita = new JLabel("45 R$");
        phmb = new JLabel("100 R$");
        ppizza = new JLabel("20 R$");
        ptaco = new JLabel("26 R$");
        pcafe = new JLabel("10 R$");
        psuco = new JLabel("14 R$");
        prefri = new JLabel("30 R$");
        pagua = new JLabel("19 R$");

        bgbotao = new ButtonGroup();
        lpedido = new JLabel("Pedido N°:");
        tpedido = new JTextField("");
        lplacacarro = new JLabel("Placa do Carro:");
        tplacacarro = new JTextField("");
        llanches = new JLabel("Lanches");
        lbebidas = new JLabel("Bebidas");
        lvisualizacao = new JLabel("Visualização do pedido");
        tavisualizacao = new JTextArea();
        lvalortotal = new JLabel("Valor Total:");
        bmenuinicial = new JButton("Menu Inicial");

        blimpapedido = new JButton("Limpar Pedido");
        badicionar = new JButton("Adicionar");
        bconfirmarpedido = new JButton("Confirmar Pedido");
        cbttfrita = new JCheckBox("");
        chmb = new JCheckBox("");
        cpizza = new JCheckBox("");
        ctaco = new JCheckBox("");
        ccafe = new JCheckBox("");
        csuco = new JCheckBox("");
        crefri = new JCheckBox("");
        cagua = new JCheckBox("");
        lqtd = new JLabel("Qtd:");
        cbqtd = new JComboBox();
        cbqtd.addItem("1");
        cbqtd.addItem("2");
        cbqtd.addItem("3");
        cbqtd.addItem("4");
        tpedido.setText(this.contador + "");

        lbttfrita = new JLabel("");
        ImageIcon img1 = new ImageIcon("src/Imagens/lbttfrita.jpg");
        lbttfrita.setIcon(img1);
        lhmb = new JLabel("");
        ImageIcon img2 = new ImageIcon("src/Imagens/lhmb.png");
        lhmb.setIcon(img2);
        lpizza = new JLabel("");
        ImageIcon img3 = new ImageIcon("src/Imagens/lpizza.png");
        lpizza.setIcon(img3);
        ltaco = new JLabel("");
        ImageIcon img4 = new ImageIcon("src/Imagens/ltaco.jpg");
        ltaco.setIcon(img4);
        lcafe = new JLabel("");
        ImageIcon img5 = new ImageIcon("src/Imagens/lcafe.jpg");
        lcafe.setIcon(img5);
        lsuco = new JLabel("");
        ImageIcon img6 = new ImageIcon("src/Imagens/lsuco.jpg");
        lsuco.setIcon(img6);
        lrefri = new JLabel("");
        ImageIcon img7 = new ImageIcon("src/Imagens/lrefri.jpg");
        lrefri.setIcon(img7);
        lagua = new JLabel("");
        ImageIcon img8 = new ImageIcon("src/Imagens/lagua.jpg");
        lagua.setIcon(img8);
        lpedido.setBounds(35, 1, 100, 50);
        lplacacarro.setBounds(240, 1, 120, 50);

        llanches.setBounds(45, 45, 100, 50);
        lbebidas.setBounds(300, 45, 100, 50);
        lvisualizacao.setBounds(475, 40, 190, 50);
        lvalortotal.setBounds(425, 440, 100, 50);
        lqtd.setBounds(175, 490, 40, 20);
        tpedido.setBounds(115, 18, 100, 20);
        tplacacarro.setBounds(355, 18, 100, 20);
        tavisualizacao.setBounds(465, 90, 300, 340);
        bmenuinicial.setBounds(485, 17, 140, 20);
        blimpapedido.setBounds(25, 490, 140, 20);
        badicionar.setBounds(270, 490, 120, 20);
        bconfirmarpedido.setBounds(420, 490, 310, 20);
        cbqtd.setBounds(210, 490, 40, 20);

        plbttfrita.setBounds(160, 90, 100, 50);
        phmb.setBounds(160, 150, 100, 50);
        ppizza.setBounds(160, 220, 100, 50);
        ptaco.setBounds(160, 300, 100, 50);
        pcafe.setBounds(400, 90, 100, 50);
        psuco.setBounds(400, 160, 100, 50);
        pagua.setBounds(400, 310, 100, 50);
        prefri.setBounds(400, 230, 100, 50);

        lbttfrita.setBounds(50, 90, 100, 50);
        lhmb.setBounds(50, 150, 100, 50);
        lpizza.setBounds(50, 220, 100, 50);
        ltaco.setBounds(50, 300, 100, 50);
        lcafe.setBounds(290, 90, 100, 50);
        lsuco.setBounds(290, 160, 100, 50);
        lrefri.setBounds(290, 230, 100, 50);
        lagua.setBounds(290, 310, 100, 50);

        cbttfrita.setBounds(15, 80, 100, 50);
        chmb.setBounds(15, 150, 100, 50);
        cpizza.setBounds(15, 220, 100, 50);
        ctaco.setBounds(15, 290, 100, 50);
        ccafe.setBounds(250, 80, 100, 50);
        csuco.setBounds(250, 150, 100, 50);
        crefri.setBounds(250, 220, 100, 50);
        cagua.setBounds(250, 290, 100, 50);

//tornar o campo número do pedido não editável
        tpedido.setEditable(false);

        this.add(lpedido);
        this.add(lplacacarro);
        this.add(llanches);
        this.add(lbebidas);
        this.add(lvisualizacao);
        this.add(lvalortotal);
        this.add(lqtd);
        this.add(lbttfrita);
        this.add(lhmb);
        this.add(lpizza);
        this.add(ltaco);
        this.add(lcafe);

        this.add(lsuco);
        this.add(lrefri);
        this.add(lagua);
        this.add(tpedido);
        this.add(tplacacarro);
        this.add(tavisualizacao);
        this.add(bmenuinicial);
        this.add(blimpapedido);
        this.add(badicionar);
        this.add(bconfirmarpedido);
        this.add(cbqtd);
        this.add(cbttfrita);
        this.add(chmb);
        this.add(cpizza);
        this.add(ctaco);
        this.add(ccafe);
        this.add(csuco);
        this.add(crefri);
        this.add(cagua);
        this.add(plbttfrita);
        this.add(phmb);
        this.add(ppizza);
        this.add(ptaco);
        this.add(pcafe);
        this.add(pagua);
        this.add(prefri);
        this.add(psuco);

        bgbotao.add(chmb);
        bgbotao.add(cpizza);
        bgbotao.add(ctaco);
        bgbotao.add(ccafe);
        bgbotao.add(csuco);
        bgbotao.add(crefri);
        bgbotao.add(cagua);
        bgbotao.add(cpizza);
        bgbotao.add(cbttfrita);

        blimpapedido.addActionListener(this);
        bmenuinicial.addActionListener(this);
        badicionar.addActionListener(this);
        bconfirmarpedido.addActionListener(this);
        this.setSize(700, 800);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.gray);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bmenuinicial)) {
            this.dispose(); // fecha apenas esta janela
        } else if (ae.getSource().equals(bconfirmarpedido)) {
            if (valortotal > 0) {
                Pedido pedido = new Pedido();
                pedido.setItensDoPedido(itensdopedido);
                pedido.setPlaca(tplacacarro.getText());
                pedido.setValorTotal(valortotal);
                pedido.setNpedido(Integer.parseInt(tpedido.getText()));

                fila.queue(pedido);
                JOptionPane.showMessageDialog(null, "Pedido Encaminhado!");
                System.out.println("fila:" + fila.size());
                itensdopedido = "";
                contador++;
                tpedido.setText(contador + "");
                tplacacarro.setText(null);
                cbqtd.setSelectedItem("0");
                tavisualizacao.setText(null);
                valortotal = 0;
            } else {

                JOptionPane.showMessageDialog(null, "Adicione algum pedido!");
            }
        } else if (ae.getSource().equals(blimpapedido)) {
            lpedido.setText(null);
            lplacacarro.setText(null);
            cbttfrita.setText(null);
            chmb.setText(null);
            cpizza.setText(null);
            ctaco.setText(null);
            ccafe.setText(null);
            csuco.setText(null);
            crefri.setText(null);
            cagua.setText(null);
        } else if (ae.getSource().equals(badicionar)) {
            int qtd = Integer.parseInt(cbqtd.getSelectedItem().toString());
            if (cbttfrita.isSelected()) {
                itensdopedido = itensdopedido + "Batata frita \n" + "x" + cbqtd.getSelectedItem().toString() + "\n";
                valortotal += 45.0 * qtd;
            } else if (cpizza.isSelected()) {
                itensdopedido = itensdopedido + "Pizza \n" + "x" + cbqtd.getSelectedItem().toString() + "\n";
                valortotal += 20 * qtd;
            } else if (chmb.isSelected()) {
                itensdopedido = itensdopedido
                        + "Hamburger \n" + "x" + cbqtd.getSelectedItem().toString() + "\n";
                valortotal += 100 * qtd;

            } else if (ctaco.isSelected()) {
                itensdopedido = itensdopedido + "Taco \n" + "x" + cbqtd.getSelectedItem().toString() + "\n";
                valortotal += 26 * qtd;
            } else if (ccafe.isSelected()) {
                itensdopedido = itensdopedido + "Café \n" + "x" + cbqtd.getSelectedItem().toString() + "\n";
                valortotal += 10 * qtd;
            } else if (cagua.isSelected()) {
                itensdopedido = itensdopedido + "Agua \n" + "x" + cbqtd.getSelectedItem().toString() + "\n";
                valortotal += 19 * qtd;
            } else if (csuco.isSelected()) {
                itensdopedido = itensdopedido + "Suco \n" + "x" + cbqtd.getSelectedItem().toString() + "\n";
                valortotal += 14 * qtd;
            } else if (crefri.isSelected()) {
                itensdopedido = itensdopedido + "Refri \n" + "x" + cbqtd.getSelectedItem().toString() + "\n";
                valortotal += 30 * qtd;
            }

            tavisualizacao.setText(itensdopedido);
        }
    }
}
