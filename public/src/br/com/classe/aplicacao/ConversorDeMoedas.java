package br.com.classe.aplicacao;

import br.com.classe.servico.ConversorApi;

import java.io.IOException;
import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        ConversorApi conversorApi = new ConversorApi();
        System.out.println("------------------------------------------");
        System.out.println("Informe o valor a ser convertido: ");
        double valorParaConversao = leitura.nextDouble();

        String mensagemMenu = String.format("""
                ------------------------------------------
                Opções:
                    [1] BRL -> USD
                    [2] USD -> BRL
                    [3] BRL -> ARS
                    [4] BRL -> BOB
                    [5] BRL -> CLP
                    [6] BRL -> COP
                    ---------------
                    [7] Sair
                ------------------------------------------
                """);

        int sair = 0;
        int opcao;
        while (sair != 1){
            System.out.println(mensagemMenu);
            System.out.println("Informe a opção que deseja: ");
            opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    try{
                        System.out.println();
                        conversorApi.conversor("BRL","USD",valorParaConversao);
                    } catch (Exception e){
                        System.out.println("Erro: "+e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        conversorApi.conversor("USD","BRL",valorParaConversao);
                    }catch (Exception e){
                        System.out.println("Erro: "+e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        conversorApi.conversor("BRL","ARS",valorParaConversao);
                    } catch (Exception e){
                        System.out.println("Erro: "+e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        conversorApi.conversor("BRL","BOB",valorParaConversao);
                    } catch (Exception e){
                        System.out.println("Erro: "+e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        conversorApi.conversor("BRL","CLP",valorParaConversao);
                    } catch (Exception e){
                        System.out.println("Erro: "+e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        conversorApi.conversor("BRL","COP",valorParaConversao);
                    } catch (Exception e){
                        System.out.println("Erro: "+e.getMessage());
                    }
                    break;
                case 7:
                    sair = 1;
                    break;
                default:
                    System.out.println("------ (Valor Inválido...) ------");
                    break;
            }
        }
        String mensagemFinal = String.format("""
                *************************************
                        Programa Finalizado!
                *************************************
                """);
        System.out.println(mensagemFinal);
    }
}
