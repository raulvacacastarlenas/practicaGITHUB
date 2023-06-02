package uf2;

import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = sc.nextLine();

        System.out.print("Caràcter: ");
        String caracter = sc.nextLine();

        if (caracter.length() != 1) {
            System.out.println("La longitud del carácter ha de ser 1");
        } else {
            String fraseModificada = frase.replace(caracter, "*");

            if (frase.equals(fraseModificada)) {
                System.out.println("El caràcter no existeix");
            } else {
                System.out.println("Sortida: " + fraseModificada);
            }
        }

        sc.close();
    }
}
