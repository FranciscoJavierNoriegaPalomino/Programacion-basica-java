package ciclowhitle;
import java.util.Scanner;
public class CicloWhitle {
    public static void main(String[] args) {
        boolean salir = false;
        
        while(!salir){
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
                int[] numeros = {1,2,3,4,5};
                Object[] numerosLetras = {12,"Francisco",123.21,true,"Noriega"};
//                for (Object nl:numerosLetras){
//                        System.out.println(nl);    
//                }               
                for (int n=0;n<numeros.length;n++){
                    if(numeros[n] == 2){     
                        System.out.println("Numero encontrado");
                    }else{
                        System.out.println("No encontrado");
                    }    
                    System.out.println(numeros[n]);
                }                     
                System.out.println("Vuelva Pronto");
                break;  
                
            case 3:                
                System.out.println("Quiero que me pagues");
                break;  
                
            case 4:
                System.out.println("Se escapo...");
                break; 
                
            case 5:
                salir = true;
                System.out.println("Gracias por usar nuestro Menu");
                break;  
                
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
        scanner.close();        
        }

    }    
}
