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
public class Contas {

    private String nome;
    private int numero;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        saldo = saldo + valor;
        return saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        }
    }

    public double transferir(int conta1, int conta2, double valor) {
        if (saldo > valor) {
            saldo = saldo - valor;
        }
        return saldo;
    }

    public void tipoConta() {
        JOptionPane.showMessageDialog(null, "Conta Comum");
    }
}
