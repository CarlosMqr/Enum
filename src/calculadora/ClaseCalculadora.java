package calculadora;

import calculadora.Calculadora;

import java.util.Scanner;

public class ClaseCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calcula = new Calculadora();
        System.out.println("Que operación aritmética deseas realizar" +
                "\n1:Suma" +
                "\n2:Resta" +
                "\n3:Multiplicacion" +
                "\n4:Divicion");
        int tipo = scanner.nextInt();
        if (tipo > 4){
            System.out.println("El tipo de operacion aritmetica que desea realizar no existe");
            System.out.println("elige operacion del 1 al 4");
            main(args);
            System.exit(0);

        }else {
            System.out.print("Ingresa primer valor: ");
            int valA = scanner.nextInt();
            if (tipo == 1){
                System.out.println("Más");
            } else if (tipo == 2) {
                System.out.println("Menos");
            } else if (tipo == 3) {
                System.out.println("Por");
            } else if (tipo == 4) {
                System.out.println("Entre");
            }
            System.out.print("Ingresa segundo valor: ");
            int valB = scanner.nextInt();

            calcula.setTipoOperacion(tipo);
            calcula.setValorA(valA);
            calcula.setValorB( valB);


            System.out.println(calcula.calculadora(calcula.getValorA(), calcula.getValorB()));
        }




    }
}
