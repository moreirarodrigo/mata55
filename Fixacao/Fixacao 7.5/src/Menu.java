package menu;

import imovel.*;

import java.util.ArrayList;

import java.util.Scanner;

public class Menu {
    private Beneficiario beneficiario = new Beneficiario("Rodrigo", "40028922", "35353035");
    private ArrayList<Imovel> imoveis = new ArrayList<Imovel>();

    public void menuPrincipal() {
        Scanner sc = new Scanner(System.in);

        int opt = 0;

        while(opt != 4) {
            System.out.println("\n1 - Cadastrar Imovel\n2 - Listar Imoveis\n3 - Calcular Taxa\n4 - Sair");

            System.out.print("Opção: ");
            opt = sc.nextInt();

            switch(opt) {
                case 1:
                    System.out.print("\nNúmero de inscrição: ");
                    int numeroInscricao = sc.nextInt();

                    System.out.print("Endereço: ");
                    String endereco = sc.next();

                    System.out.print("Área total: ");
                    float areaTotal = sc.nextFloat();

                    System.out.print("Valor: ");
                    float valor = sc.nextFloat();

                    System.out.print("Localização: ");
                    char localizacao = sc.next().charAt(0);

                    String areaDeLocalizacao = "";

                    char padraoConstrutivo;

                    System.out.print("Tipo (1 - Casa, 2 - Apartamento, 3 - Terreno): ");
                    int tipo = sc.nextInt();

                    switch(tipo) {
                        case 1:
                            System.out.print("Padrão (A, B, C, D): ");
                            padraoConstrutivo = sc.next().charAt(0);

                            imoveis.add(new Casa(numeroInscricao, endereco, areaTotal, valor, localizacao, beneficiario, padraoConstrutivo));
                            break;
                        case 2:
                            System.out.print("Área privativa: ");
                            float areaPrivativa = sc.nextFloat();
                            System.out.print("Padrão (A, B, C, D): ");
                            padraoConstrutivo = sc.next().charAt(0);

                            imoveis.add(new Apartamento(numeroInscricao, endereco, areaTotal, valor, localizacao, beneficiario, areaPrivativa, padraoConstrutivo));
                            break;
                        case 3:
                            System.out.print("Área de Localização (1 - Ambiental, 2 - Rural): ");
                            int opc = sc.nextInt();

                            if(opc == 1) {
                                areaDeLocalizacao = "preservacao ambiental";
                            } else if (opc == 2) {
                                areaDeLocalizacao = "area rural";
                            }

                            imoveis.add(new Terreno(numeroInscricao, endereco, areaTotal, valor, localizacao, beneficiario, areaDeLocalizacao));
                            break;
                    }
                    break;
                case 2:
                    for(Imovel imovel: imoveis) {
                        System.out.println("\nImoveis: ");
                        System.out.println(String.format("Inscrição: %d\nEndereço: %s\nÁrea: %f\nValor: %f\nLocalização: %s", imovel.getNumeroInscricao(), imovel.getEndereco(), imovel.getAreaTotal(), imovel.getValor(), imovel.getLocalizacao()));
                    }
                    break;
                case 3:
                    System.out.print("\nNúmero de inscrição: ");
                    int inscrição = sc.nextInt();

                    for(Imovel imovel: imoveis) {
                        if(imovel.getNumeroInscricao() == inscrição) {
                            System.out.println(String.format("Inscrição: %d\nTaxa: %f", imovel.getNumeroInscricao(), imovel.calculaTaxa()));
                        }
                    }
                    break;
            }
        }
    }
}