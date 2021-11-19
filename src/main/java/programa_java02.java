//7.2 Operadores


import java.util.Scanner;

public class programa_java02 {
    public static void main (String args[]){
        Scanner scnEtrada = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        int intIdade = scnEtrada.nextInt();

        if (intIdade < 18)
            System.out.println("Voce é menor de idade!");
        else
            System.out.println("Voce é maior de idade");
    }
}
