import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] V = new String[5];
        String[] W = new String[5];
        int[] X = new int[10];
        int[] Y = new int[10];

        V[0] = "Giuseppe Bono";
        V[1] = "Symon c";
        V[2] = "Lorenzo Jovanotti";
        V[3] = "Tiziano Ferro";
        V[4] = "Vasco Rossi";

        int i = 0;
        while (i < 5) {
            System.out.print("Inserire il nome del " + (i + 1) + " cantante: ");
            W[i] = in.next();
            i++;
        }

        i = 0;
        while (i < 10) {
            X[i] = i + 1;
            i++;
        }

        i = 0;
        while (i < 10) {
            Y[i] = i * 2;
            i++;
        }

        System.out.println("1° " + V[0] + " 2° " + V[1] + " 3° " + V[2]);

        i = 0;
        while (i < 5) {
            System.out.println((i + 1) + "° elemento di V " + V[i]);
            System.out.println((i + 1) + "° elemento di W " + W[i]);
            i++;
        }

        i = 0;
        while (i < 10) {
            System.out.println((i + 1) + "° elemento di X " + X[i]);
            System.out.println((i + 1) + "° elemento di Y " + Y[i]);
            i++;
        }

        i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println(i + "° elemento pari " + X[i]);
            }
            i++;
        }

        i = 0;
        while (i < 10) {
            if (i % 2 != 0) {
                System.out.println(i + "° Elemento dispari " + X[i]);
            }
            i++;
        }

        i = 0;
        while (i < 10) {
            if (X[i] % 2 == 0) {
                System.out.println(X[i] + " è pari");
            }
            i++;
        }
    }
}

