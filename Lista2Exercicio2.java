package lista2exercicio2;

import java.util.Scanner;

public class Lista2Exercicio2 {

    public static void main(String[] args) {
        
        System.out.println("Programa para verificar gasto ");
        
        float   CL;
        
        System.out.println("Descreva o valor de sua conta de luz Ex: 100,00");
        Scanner teclado = new Scanner (System.in);
        CL = teclado.nextFloat();
        
        if (CL>=50){
            System.out.println("O valor de sua conta está muito alta");
        }else{
            System.out.println("O valor de sua conta está normal");
        }       
    }
    
}
