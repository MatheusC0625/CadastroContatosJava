package br.com.fiap.contato.view;
import br.com.fiap.contato.model.Contato;

import javax.swing.*;

public class Terminal {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");

        String numero = JOptionPane.showInputDialog("Digite o número do contato: ");
        JOptionPane.showMessageDialog(null, "Número confirmado!");

        Contato contato = new Contato(nome, numero);

    }
}
