import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- MENÚ EJERCICIOS -----");
        System.out.println("1. Número positivo");
        System.out.println("2. Mayor de edad");
        System.out.println("3. Mayor de dos números");
        System.out.println("4. Aprobado/Reprobado");
        System.out.println("5. Par o Impar");
        System.out.println("6. Mayor de tres números");
        System.out.println("7. Año bisiesto");
        System.out.println("8. Validar contraseña");
        System.out.println("9. FizzBuzz");
        System.out.println("10. Cajero automático");
        System.out.print("Elige el número de ejercicio: ");

        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        switch (opcion) {
            case 1:
                System.out.print("Ingrese un número: ");
                int n1 = sc.nextInt();
                System.out.println(n1 > 0 ? "Es positivo" : "No es positivo");
                break;

            case 2:
                System.out.print("Ingrese la edad: ");
                int edad = sc.nextInt();
                System.out.println(edad >= 18 ? "Mayor de edad" : "Menor de edad");
                break;

            case 3:
                System.out.print("Ingrese dos números: ");
                int a = sc.nextInt(), b = sc.nextInt();
                System.out.println("Mayor: " + (a > b ? a : b));
                break;

            case 4:
                System.out.print("Ingrese la calificación (0-100): ");
                int nota = sc.nextInt();
                System.out.println(nota >= 60 ? "Aprobado" : "Reprobado");
                break;

            case 5:
                System.out.print("Ingrese un número: ");
                int n5 = sc.nextInt();
                System.out.println(n5 % 2 == 0 ? "Par" : "Impar");
                break;

            case 6:
                System.out.print("Ingrese tres números: ");
                int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
                int mayor = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
                System.out.println("Mayor: " + mayor);
                break;

            case 7:
                System.out.print("Ingrese un año: ");
                int anio = sc.nextInt();
                boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
                System.out.println(bisiesto ? "Bisiesto" : "No bisiesto");
                break;

            case 8:
                System.out.print("Ingrese una contraseña: ");
                String pass = sc.nextLine();
                boolean largo = pass.length() > 8;
                boolean tieneNum = pass.matches(".*[0-9].*");
                boolean mayus = pass.matches(".*[A-Z].*");
                System.out.println((largo && tieneNum && mayus) ? "Contraseña válida" : "Inválida");
                break;

            case 9:
                System.out.print("Ingrese un número: ");
                int n9 = sc.nextInt();
                if (n9 % 3 == 0 && n9 % 5 == 0) System.out.println("FizzBuzz");
                else if (n9 % 3 == 0) System.out.println("Fizz");
                else if (n9 % 5 == 0) System.out.println("Buzz");
                else System.out.println(n9);
                break;

            case 10:
                double saldo = 1000; // saldo inicial
                System.out.print("Ingrese el monto a retirar: ");
                double retiro = sc.nextDouble();
                System.out.println(retiro <= saldo ? 
                    "Retiro exitoso. Nuevo saldo: " + (saldo - retiro) : 
                    "Fondos insuficientes");
                break;

            default:
                System.out.println("Opción inválida");
        }
    }
}
