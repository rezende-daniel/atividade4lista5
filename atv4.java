//Faça um programa, com uma função que necessite de um argumento. 
//A função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.


import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) throws Exception {

        pn();
    }

        
        
        static void pn(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o número:");
        int num1 =entrada.nextInt();
        entrada.close();

        if (num1>0){
            System.out.println("P");

        } else {
            System.out.println("N");
        }}



    }