/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

import Contas.JanelaComum;
import javax.swing.JOptionPane;

/**
 *
 * @author klayv
 */
public class Principal {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Olá, bem vindo!");

        new JanelaComum(null, null, null).setVisible(true);

    }
}
