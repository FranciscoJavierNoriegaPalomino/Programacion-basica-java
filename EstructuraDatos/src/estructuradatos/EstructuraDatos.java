package estructuradatos;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EstructuraDatos {
    public static void main(String[] args) {
    try {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        while(!salir){
            System.out.println("Estructura de datos");
            System.out.println("1.- Array");
            System.out.println("2.- ArrayList");
            System.out.println("3.- HasMap");
            System.out.println("4.- Salir");
            
            System.out.print("Ingrese una opcion: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido a la ED Array");
                    int[] edades = {12,40,30,50,7,5,60,70,100};
                    String[] nombres = {"Daniel","Marcos","Diego","Ariel"};
                    
                    //Longitud del Array
                    System.out.println("Longitud edades: "+ edades.length);
                    System.out.println("Longitud nombre"+ nombres.length);
                                     
                    //Cambiar un valor
                    edades[1] = 38;
                    nombres[3] = "David";
                    System.out.println("Nuevo dato edad: "+ edades[1]);
                    System.out.println("Nuevo dato nombre: "+ nombres[3]);
                    
                    //Convertir una array a String
                    System.out.println(Arrays.toString(edades));
                    System.out.println(Arrays.toString(nombres));
                    
                    //Clonar
                    int[] edadesClon = edades.clone();
                    System.out.println("Array clonado: "+ Arrays.toString(edadesClon));
                    break;
                    
                case 2:
                    System.out.println("Bienvenido a ArrayList");
                    
                    ArrayList<String> ListaNombres = new ArrayList<>();
                    
                    //Agregar datos a la Lista
                    ListaNombres.add("David");
                    ListaNombres.add("Marco");
                    ListaNombres.add("Julio");
                    
                    //Longitud de la Lista  
                    System.out.println("Tamanño Lista: "+ListaNombres.size());
                    
                    //remover un elemento de la lista
                    ListaNombres.remove(2);
                    
                    //Obtener un elemento de la lista
                    System.out.println("Elemento optenido:"+ ListaNombres.get(2));
                    
                    //Comprobar si la lsita esta vacia
                    System.out.println("Lista Vacia: "+ ListaNombres.isEmpty());
                    
                    //Comprobar si un elemento existe
                    System.out.println("Existe: "+ListaNombres.contains("David"));
                    break;
                    
                case 3:
                    System.out.println("Bienvenido a HashMap");
                    Map<String,Integer> edades1 = new HashMap<>();
                    
                    //Insertando Data
                    edades1.put("Francisco",20);
                    edades1.put("Marco",12);
                    edades1.put("Javier",60);
                    edades1.put("Pedro",50);
                    
                    //Eliminar un dato
                    edades1.remove("Pedro");
                    
                    //Recuperar un Valor
                    System.out.println("Edad Francisco: "+edades1.get("Francisco"));
                    
                    //Longitud del Mapa
                    edades1.size();
                    
                    //Imprimir las llaves (Key)
                    for(String Key : edades1.keySet()){
                        System.out.println("Llave: "+Key);
                    }
                    
                    //Imprimir los valores (Value)
                    for(Integer value : edades1.values()){
                        System.out.println("Llave: "+value);
                    }
                    
                    //Imprimir las llaves y los valores
                    for(Map.Entry<String,Integer> lv : edades1.entrySet()){
                        System.out.println("LLave: "+ lv.getKey() + " Valor: "+ lv.getValue());
                    }
                    break;
                    
                    
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }
            
        }
        scanner.close();                
        } catch (Exception e) {
            System.out.println("Ocurrio un error"+ e.getMessage());
        } finally {
            System.out.println("Gracias por usar el programa");
        }
    }
        
}
