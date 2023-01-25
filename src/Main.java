import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        int indexM = frase.indexOf('m');
        int indexB = frase.indexOf('b');
        int indexY = frase.indexOf('y');

        if (indexM != -1) {
            System.out.println("La primera letra encontrada es: " + 'm');
        } else if (indexB != -1) {
            System.out.println("La primera letra encontrada es: " + 'b');
        } else if (indexY != -1) {
            System.out.println("La primera letra encontrada es: " + 'y');
        } else {
            System.out.println("No se encontró ninguna letra buscada.");
        }

        System.out.print("Ingrese el primer valor: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El módulo es: " + modulo);

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println(num1 + " y " + num2 + " son iguales");
        }

        System.out.print("Ingrese el tercer valor: ");
        int num3 = sc.nextInt();

        int[] nums = {num1, num2, num3};

        // Ordenamiento por selección
        for (int i = 0; i < nums.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[max];
            nums[max] = temp;
        }

        System.out.println("Valores en orden descendente:");
        for (int num : nums) {
            System.out.println(num);
        }

        for (int i = 0; i < num3; i++) {
            num1 += num2;
        }
        System.out.println("El resultado es: " + num1);
    }
}