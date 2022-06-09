package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = "Lethycya";
        float nota = 8.5f;
        System.out.println("A nota é " + nota);
    }
}

//System.out.printf("A nota é %.2f \n", nota);

//System.out.format("A nota é %.2f \n", nota);

//System.out.println("A nota %s é %.4f \n, nome, nota);

//System.out.format("A nota %s é %.1f \n, nome, nota);


/*
 * package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.println("A nota é " + nota);
    }
}

 */