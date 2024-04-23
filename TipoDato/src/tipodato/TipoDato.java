package tipodato;
public class TipoDato {
    public static void main(String[] args) {
        //Cadenas o Strings
        //Declarando
        String Nombre;
        int Edad;
        boolean Estado;
        double Saldo;
        Object TodoTipoDato;
        //Asignando        
        Nombre = "Francisco Javier Noriega Palomino";
        Edad = 20;
        Saldo = 1000.34;
        TodoTipoDato = "Cadena";
        TodoTipoDato = 2;
        TodoTipoDato = true;
        TodoTipoDato = 23.23;
        //Imprimiendo
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Saldo: " + Saldo);
        System.out.println("TodoTipoDato: " + TodoTipoDato);
    }
}
