package br.newtonpaiva;

import javax.swing.*;

public class Cantina {
    public static void main(String[] args) {
        String NCliente = null;
        String Massa = null;
        Double VMassa = null;

        NCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
        Massa = JOptionPane.showInputDialog("Informe o nome da massa (exem: Penne, espaquete, outros)$:");

        // Tratamento de exceção ao converter entrada do usuário para um valor double
        try {
            VMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor da massa inválido. Por favor, informe um número válido.");
            System.exit(0);
        }

        Pedido ped = new Pedido();

        ped.total = VMassa;

        int opcao = 0;
        while (opcao != 5) {
            // Tratamento de exceção ao converter entrada do usuário para um valor inteiro
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da massa: \n1-Bacon, \n2-Mussarela, \n3-Tomate, \n4-Queijo, \n5-Sair"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, informe um número válido.");
                continue;
            }

            switch (opcao) {
                case 1:
                    ped.Calcular(2.0);
                    ped.adIngredientes("Bacon");
                    break;
                case 2:
                    ped.Calcular(2.0);
                    ped.adIngredientes("Mussarela");
                    break;
                case 3:
                    ped.Calcular(2.0);
                    ped.adIngredientes("Tomate");
                    break;
                case 4:
                    ped.Calcular(2.0);
                    ped.adIngredientes("Queijo");
                    break;
                case 5:
                    ped.getIngrediente();

                    for (int i = 0; i < ped.ingrediente.size(); i++) {

                    }
                    System.out.println(NCliente + ", " + "Você pediu " + Massa + " " + "no valor de R$" + ped.total + " " + "com os ingredientes: " + ped.getIngrediente());
                    break;
            }
        }
    }
}