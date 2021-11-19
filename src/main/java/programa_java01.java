//7.1 Variaveis

import java.util.Scanner;

public class programa_java01 {
    public static void main(String args[]) {
        Scanner scnEntrada = new Scanner(System.in);

        System.out.println("Ola meu amigo!");
        System.out.println("Quantos anos voce tem?");
        int intIdade = scnEntrada.nextInt();
        int intDias = intIdade * 365;
        System.out.println("Voce ja viveu aproximadamente " + intDias + "dias...");
    }
}
