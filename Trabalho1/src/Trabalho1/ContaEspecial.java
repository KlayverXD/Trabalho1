/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author klayv
 */
public class ContaEspecial extends Contas {

    public int limite;
    public double multa;
    double novoSaldo, saldoDescontado;

    public void saqueEspecial(double valor) {
        novoSaldo = getSaldo() - valor;
        descontar(multa);
    }

    public void descontar(double multa) {
        saldoDescontado = (novoSaldo * multa) / 100;
        double soma = novoSaldo + saldoDescontado;
        setSaldo(soma);
    }

    public void tipoConta() {
        JOptionPane.showMessageDialog(null, "Conta especial");
    }
}
