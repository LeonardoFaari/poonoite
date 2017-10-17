package controlecaixa;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela extends JFrame implements ActionListener, WindowListener {
    protected Dimension dFrame, dLabel, dTextField, 
            dButton, dTextArea;
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button cmdEntrada, cmdRetirada, 
            cmdConsulta, cmdSair;
    protected TextArea txtMsg;
    private Caixa caixa;
    
    public Tela(){
        //Instanciar objeto caixa
        caixa = new Caixa();
        //Aparência da Tela
        dFrame = new Dimension(350,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        this.setTitle("Controle de Caixa");
        this.setResizable(false);
        this.setSize(dFrame);
        this.setLayout(null);
        //Definir os labels
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        this.add(lblValor);
        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        this.add(lblSaldo);
        //Definir os textFields
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        this.add(txtValor);
        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        this.add(txtSaldo);
        //Definir os Buttons
        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        this.add(cmdEntrada);
        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        cmdConsulta.addActionListener(this);
        this.add(cmdConsulta);
        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180,150);
        cmdRetirada.addActionListener(this);
        this.add(cmdRetirada);
        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180,185);
        cmdSair.addActionListener(this);
        this.add(cmdSair);
        //Definir o textArea
        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        this.add(txtMsg);
        //Adicionar o listener
        this.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        txtSaldo.setText(null);
        if(e.getSource()==cmdSair){
            System.exit(0);
        }
        if(e.getSource()==cmdEntrada){
            double valor = Double.parseDouble(txtValor.getText());
            boolean op = caixa.depositar(valor);
            if(op==true){
                JOptionPane.showMessageDialog(null, "Depósito efetuado");
                txtMsg.append("Depósito de " + valor + " efetuado \n");
            }else{
                JOptionPane.showMessageDialog(null, "Valor inválido");
                txtMsg.append("Depósito não efetuado \n");
            }
            txtValor.setText(null);
            txtValor.requestFocus();  // coloca o foco no controle
        }
        if(e.getSource()==cmdRetirada){
            double valor = Double.parseDouble(txtValor.getText());
            boolean op = caixa.sacar(valor);
            if(op==true){
                JOptionPane.showMessageDialog(null, "Saque efetuado");
                txtMsg.append("Saque de " + valor + " efetuado \n");
            }else{
                JOptionPane.showMessageDialog(null, "Saldo não disponível");
                txtMsg.append("Saque não efetuado \n");
            }
            txtValor.setText(null);
            txtValor.requestFocus();  // coloca o foco no controle
        }
        if(e.getSource()==cmdConsulta){
            txtSaldo.setText(String.valueOf(caixa.getSaldo()));
            txtMsg.append("Consulta efetuada valor saldo momento: "
                    + caixa.getSaldo() + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0); //Sair e fechar
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
    
}
