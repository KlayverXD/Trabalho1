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
public class ContaPoupanca extends Contas {

    public double taxa;

    public void reajustar() {
        double saldoAtual = getSaldo();
        double reajuste = saldoAtual * 0.1;
        depositar(reajuste);
    }

    public void reajustar(double taxa) {
        double saldoAtual = getSaldo();
        double reajuste = saldoAtual * (taxa / 100);
        depositar(reajuste);
    }

    public void tipoConta() {
        JOptionPane.showMessageDialog(null, "Conta Poupança");
    }
}
