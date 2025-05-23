package com.mycompany.concessionaria;

package 3
;

import java.util.Scanner;

import com.mycompany.concessionaria.Veiculo;

public class Concessionaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            try {
                System.out.println("------- MENU -------");
                System.out.println("1 - CADASTRAR VEÍCULO");
                System.out.println("2 - CADASTRAR CLIENTE");
                System.out.println("3 - EDITAR CLIENTE");
                System.out.println("4 - EDITAR VEÍCULO");
                System.out.println("5 - DELETAR VEÍCULO");
                System.out.println("6 - DELETAR CLIENTE");
                System.out.println("7 - ACESSAR LISTA DE VEÍCULOS");
                System.out.println("8 - ACESSAR LISTA DE CLIENTES");
                System.out.println("9 - REALIZAR VENDA");
                System.out.println("10 - HISTÓRICO DE VENDAS");
                System.out.println("11 - SAIR");
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpa o buffer

                switch (opcao) {
                    case 1:
                        Veiculo.cadastrarVeiculo(scanner);
                        break;
                    case 2:
                        Cliente.cadastrarCliente(scanner);
                        break;
                    case 3:
                        Cliente.editarCliente(scanner);
                        break;
                    case 4:
                        Veiculo.editarVeiculo(scanner);
                        break;
                    case 5:
                        // Método para deletar veículo
                        break;
                    case 6:
                        // Método para deletar cliente
                        break;
                    case 7:
                        Veiculo.listarVeiculos();
                        break;
                    case 8:
                        Cliente.listadeClientes();
                        break;
                    case 9:
                        // Método para realizar venda
                        break;
                    case 10:
                        // Método para histórico de vendas
                        break;
                    case 11:
                        Thread.sleep(3000);
                        System.out.println("Encerrando o sistema...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("ERRO: Opção inválida! Tente novamente.");
                        Thread.sleep(3000);
                }

            } catch (NumberFormatException e) {
                System.out.println("ERRO: Você deve inserir um número válido.");
            } catch (Exception e) {
                System.out.println("ERRO: Ocorreu um erro inesperado.");
                System.out.println(e.getMessage());
            }
        }
    }
}
