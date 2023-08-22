// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese un numero: ");
       String number1 = scanner.nextLine();
       Integer numero1 = Integer.parseInt(number1);

       System.out.println("Ingrese un numero: ");
       String number2 = scanner.nextLine();
       Integer numero2 = Integer.parseInt(number2);



       System.out.println("Ingrese un numero: ");
       String number3 = scanner.nextLine();
       Integer numero3 = Integer.parseInt(number3);

       calcularNumeroMayor(numero1,numero2,numero3);
       calcularNumeroMenor(numero1,numero2,numero3);
   }

private static void calcularNumeroMayor(Integer numero1,Integer numero2,Integer numero3) {
    Integer numeroMayor = numero1;

    if (numero2 > numeroMayor) {
        numeroMayor = numero2;
    }
    if (numero3 > numeroMayor) {
        numeroMayor = numero3;
    }
    System.out.println("este es el numero mayor " + numeroMayor);
}

    /**
     * Esta es una estructura de comentario
     * @param numero1
     * @param numero2
     * @param numero3
     */
    private static void calcularNumeroMenor (Integer numero1, Integer numero2, Integer numero3){

        Integer numeroMenor = numero1;

        if (numero2 < numeroMenor) numeroMenor = numero2;
        if (numero3 < numeroMenor) numeroMenor = numero3;

        System.out.println("este es el numero menor " + numeroMenor);

    }


   }



