/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*. Escreva um algoritmo que leia o nome de um vendedor,
           o seu salário fixo e o total de vendas efetuadas por 
          ele no mês (em dinheiro). Sabendo que este vendedor
          ganha 15% de comissão sobre sua efetuadas, informar
          o seu nome, o salário fixo e salário no final do mês;*/
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = input.nextLine();

        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = input.nextDouble();

        System.out.print("Digite o total de vendas efetuadas no mês: R$ ");
        double totalVendas = input.nextDouble();

        double comissao = totalVendas * 0.15; // 15% de comissão sobre as vendas
        double salarioFinal = salarioFixo + comissao;

        System.out.printf("Nome do vendedor: %s%n", nomeVendedor);
        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Salário no final do mês: R$ %.2f%n", salarioFinal);
    }
    
}
