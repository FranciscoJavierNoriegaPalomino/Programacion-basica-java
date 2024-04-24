package operadoresaritmeticos;
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        
        //Incremento
        //variableUno = variableUno + 1;
        variableUno ++;
        System.out.println("Incremento: "+ variableUno);
        
        //Decremento
        //variableDos = variableDos - 1;
        variableDos --;
        System.out.println("Decremento: "+variableDos);
        
        
        //Suma
        int Suma = variableUno + variableDos;        
        System.out.println("Suma: "+Suma);
        
        //Resta
        int Resta = variableUno - variableDos; 
        System.out.println("Resta: "+Resta);
        
        //Multiplicacion
        int Multiplicacion = variableUno * variableDos;
        System.out.println("Multiplicacion: "+Multiplicacion);
        
        //Division
        int Division = variableUno / variableDos;
        System.out.println("Division: "+Division);
                        
        //Modulo
        int Modulo = variableUno % variableDos;
        System.out.println("Modulo: "+Modulo);        
    }   
}
