package br.edu.infnet.app.tp1;

import java.util.Scanner;


public class TP1_Cadastro {
    private static String[] nomes;
    private static double[] primeiranota;
    private static double[] segundanota;
    private static final int TAMANHO = 99;
    private static int posicao;

    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
    nomes = new String[TAMANHO];
	primeiranota = new double[TAMANHO];
	segundanota = new double[TAMANHO];
	String opcao = null;
    do {
        System.out.println("*******************************");
        System.out.println("*******************************");
        System.out.println("*******************************");
    	System.out.println("[1] Registrar notas de um aluno");
    	System.out.println("[2] Consultar boletim");
    	System.out.println("[3] Consultar todos alunos");
    	System.out.println("[4] Sair");
        System.out.println("*******************************");
	    System.out.println("Digite uma das opções acima: ");
	    opcao = teclado.next();
        
        switch (opcao){
        case "1":
            if(posicao < TAMANHO){
                System.out.println("Digite o nome do aluno: ");
		        nomes[posicao] = teclado.next();
		        System.out.println("Informe a primeira nota: ");
		        primeiranota[posicao] = teclado.nextDouble();
		        System.out.println("Informe a segunda nota: ");
		        segundanota[posicao] = teclado.nextDouble();
		        posicao++;
            }else{
                System.out.println("A lista está totalmente preechida");
            }
            break;
        case "2":
            System.out.println("Informe o número do cadastro do aluno");
            int pos = teclado.nextInt();
            if (pos >= 0 && pos < posicao){
                imprimir(pos);
            }else {
                System.out.println("Aluno não cadastrado");
            }break;

        case "3":
            imprimir(); 
           break;
           
        case "4":
            System.out.println("Encerrado");
            break;
            
        default:
            System.out.println("Opção inválida");
            break;  
        }
       }while(!opcao.equals("4"));
      teclado.close();
    }
    private static double media(int pos){
        return (primeiranota[pos] + segundanota[pos])/2;
    }
    private static void imprimir(){
    System.out.println("resultado dos alunos");
    for(int i = 0; i < posicao; i++){
        imprimir(i);
    }
}
    private static void imprimir(int pos){
        double mediaFi = media(pos);
        System.out.printf("[%d] %s - %f - %f - %f -  %s%n", pos, nomes[pos], primeiranota[pos], segundanota[pos], mediaFi, situacao(mediaFi));
    }
    private static String situacao(double media){
        if (media < 4 ){
        return "REPROVADO";
        }else if(media > 7){
        return "APROVADO";
        }else{
            return "PROVA FINAL";
        }
    }
}