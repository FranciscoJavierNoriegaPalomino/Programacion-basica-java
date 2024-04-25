package switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("Bienvenido a ......");
        System.out.println("1.- Saludar");
        System.out.println("2.- Despedir");
        System.out.println("3.- Cobrar");
        System.out.println("4.- Escapar");
        System.out.println("5.- Salir");
        System.out.println("---------------------------");
        
        Scanner scanner = new Scanner(System.in);
        
        int Opcion = scanner.nextInt();
        
        switch (Opcion) {
            case 1:
                System.out.println("Buenos Dias");
                break;
            case 2:
                System.out.println("Vuelva Pronto");
                break;      
            case 3:
                System.out.println("Quiero que me pagues");
                break;  
            case 4:
                System.out.println("Se escapo...");
                break;                
            case 5:
                System.out.println("Gracias por usar nuestro Menu");
                break;                
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
        scanner.close();
    }    
}
