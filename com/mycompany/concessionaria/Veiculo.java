package com.mycompany.concessionaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {
    private String modelo;
    private String placa;
    private double preco;

    public Veiculo(String modelo, String placa, double preco) {
        this.modelo = modelo;
        this.placa = placa;
        this.preco = preco;
    }

    private static final ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    public static void cadastrarVeiculo(Scanner scanner) {
        System.out.println("------- Cadastro de Veículo -------");
        scanner.nextLine(); // limpar buffer
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = Double.parseDouble(scanner.nextLine());

        Veiculo novo = new Veiculo(modelo, placa, preco);
        listaVeiculos.add(novo);
        System.out.println("Veículo cadastrado com sucesso!");
    }

    public static void listarVeiculos() {
        if (listaVeiculos.isEmpty()) {
            System.out.println("NENHUM VEÍCULO CADASTRADO!");
            return;
        }

        System.out.println("------- Lista de Veículos -------");
        for (int i = 0; i < listaVeiculos.size(); i++) {
            Veiculo v = listaVeiculos.get(i);
            System.out.println((i + 1) + " - Modelo: " + v.modelo + ", Placa: " + v.placa + ", Preço: R$" + v.preco);
        }
    }

    public static void editarVeiculo(Scanner scanner) {
        if (listaVeiculos.isEmpty()) {
            System.out.println("NENHUM VEÍCULO PARA EDITAR!");
            return;
        }

        listarVeiculos();
        System.out.print("Informe o número do veículo a ser editado: ");
        int indice = Integer.parseInt(scanner.nextLine()) - 1;

        if (indice >= 0 && indice < listaVeiculos.size()) {
            Veiculo veiculo = listaVeiculos.get(indice);

            System.out.println("O que deseja editar?");
            System.out.println("1 - Modelo");
            System.out.println("2 - Placa");
            System.out.println("3 - Preço");
            System.out.print("Opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Novo modelo: ");
                    veiculo.modelo = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Nova placa: ");
                    veiculo.placa = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Novo preço: ");
                    veiculo.preco = Double.parseDouble(scanner.nextLine());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            System.out.println("Veículo editado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}