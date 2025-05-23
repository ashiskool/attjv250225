package com.mycompany.concessionaria;


import java.util.ArrayList;
import java.util.Scanner;

 public class vendas {
    private String cliente;
    private String carro;
    private String data;
    
    public vendas(String cliente, String carro, String data){
        this.cliente = cliente;
        this.carro = carro;
        this.data = data;
    }  
    
    private static final ArrayList<vendas> listaVenda = new ArrayList<>();
    
    public static void cadastrarvenda(Scanner scanner){
        System.out.println("------- Cadastro de Venda -------");
        System.out.print("Cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Carro: ");
        String documento = scanner.nextLine();
        System.out.print("data: ");
        String data = scanner.nextLine();
        
        Cliente novo = new vendas(cliente, carro, data);
        listaCliente.add(novo);
        System.out.println("Venda cadastrado com sucesso!");
        
    }
    
    public static void listadeVendas(){
        if (listaVenda.isEmpty()){
            System.out.println("NENHUMA VENDA CADASTRADA!");
            return;
        } else {
            System.out.println("------- Lista de Vendas -------");
            for (int i = 0; i < listaVenda.size(); i++) {
                vendas v = listadeVendas.get(i);
                System.out.println((i + 1) + " - Cliente: " + v.cliente + ", Carro: " + v.carro + ", data: " + v.data);
            }
        }
    }
 }