package operacionesdecomparacion;
public class OperacionesDeComparacion {
    public static void main(String[] args) {
        int Operacion1 = 10;
        int Operacion2 = 20;
        
        //Mayor
        boolean mayor = Operacion2 > Operacion1;
        System.out.println("Mayor: "+mayor);
        
        //Menor
        boolean menor = Operacion1 < Operacion2;
        System.out.println("Menor: "+ menor);
        
        //MayorIgual
        boolean mayorigual = Operacion1 >= Operacion2;
        System.out.println("MayorIgual: "+ mayorigual);
        
        //MenorIgual
        boolean menorigual = Operacion1 <= Operacion2;
        System.out.println("MenorIgual: "+ menorigual);   
        
        //Igualdad
        boolean igualdad = Operacion1 == Operacion2;
        System.out.println("Igualdad: "+ igualdad);
        
        //NoIgualdad
        boolean igualdadNo = Operacion1 != Operacion2;
        System.out.println("IgualdadNo: "+ igualdadNo);
    }   
}
