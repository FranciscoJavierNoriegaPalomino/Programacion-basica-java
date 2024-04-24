package operacionesconcadenas;
public class OperacionesConCadenas {
    public static void main(String[] args) {
        String Nombres = "Francisco Javier";
        String Apellidos = "Noriega Palomino";
        
        //Concatenar
        String NombreCompleto = Nombres +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto);
        
        //Mayusculas
        String NombreCompleto1 = Nombres +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto1.toUpperCase());
        
        //Minusculas
        String NombreCompleto2 = Nombres +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto2.toLowerCase());
        
        //Contar cadenas
        String NombreCompleto3 = Nombres +" "+ Apellidos;
        System.out.println("Cantidad de Caracteres: "+ NombreCompleto3.length());
        
        //Cortar una cadena
        String NombreCompleto4 = Nombres +" "+ Apellidos;
        //("Francisco","Javier","Noriega","Palomino")
        String[] NombreCortado = NombreCompleto4.split(" ");
//        for(int I = 0;I < NombreCortado.length ;I++){
//            System.out.println(NombreCortado[I]);
//        }

        for(String nombre : NombreCortado){
            System.out.println(nombre);
        }
        
        //Equals
        boolean comparacion = Nombres.equals( Apellidos);
        System.out.println("Comparacion: "+comparacion);
        
       //Interposlacion de variables
       String n = "Francisco";
       String a = "Noriega";
       int e = 100;
       
       String mensaje = String.format("Mi nombre es %s y mi apellido es %s y tengo %d años",n, a, e );
        System.out.println(mensaje);
    }   
}
