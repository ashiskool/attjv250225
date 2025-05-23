//codigos codespace
package com.mycompany.concessionaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String documento;
    private String contato;

    // Alteração: construtor com String (não int)
    public Cliente(String nome, String documento, String contato){
        this.nome = nome;
        this.documento = documento;
        this.contato = contato;
    }

    private static final ArrayList<Cliente> listaCliente = new ArrayList<>();

    public static void cadastrarCliente(Scanner scanner){
        System.out.println("------- Cadastro de Cliente -------");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Documento: ");
        String documento = scanner.nextLine();
        System.out.print("Telefone para contato: ");
        String contato = scanner.nextLine();

        Cliente novo = new Cliente(nome, documento, contato);
        listaCliente.add(novo);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void listadeClientes(){
        if (listaCliente.isEmpty()){
            System.out.println("NENHUM CLIENTE CADASTRADO!");
            return;
        } else {
            System.out.println("------- Lista de Clientes -------");
            for (int i = 0; i < listaCliente.size(); i++) {
                Cliente c = listaCliente.get(i);
                System.out.println((i + 1) + " - Nome: " + c.nome + ", Documento: " + c.documento + ", Contato: " + c.contato);
            }
        }
    }

    public static void editarCliente(Scanner scanner){
        if (listaCliente.isEmpty()) {
            System.out.println("NENHUM CLIENTE PARA EDITAR!");
            return;
        }

        listadeClientes();
        System.out.print("Informe o número do cliente a ser editado: ");
        int indice = Integer.parseInt(scanner.nextLine()) - 1;

        if (indice >= 0 && indice < listaCliente.size()) {
            Cliente cliente = listaCliente.get(indice);
            System.out.println("O que deseja editar?");
            System.out.println("1 - Nome");
            System.out.println("2 - Documento");
            System.out.println("3 - Contato");
            System.out.print("Opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Novo nome: ");
                    cliente.nome = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Novo documento: ");
                    cliente.documento = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Novo contato: ");
                    cliente.contato = scanner.nextLine();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            System.out.println("Cliente editado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
