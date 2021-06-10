//EjercicioRepositorio4
import java.util.Scanner;
public class EjercicioRepositorio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mayorEdad = 0, menorEdad = 90;     //90 años como limite de edad maxima
        double aleatorio;
        
            for(int i = 1; i <= 20; i++){
                aleatorio = (int)(Math.random() * (90));
                System.out.println("Edad #"+ i +": "+ aleatorio);
                
                if (aleatorio > mayorEdad) {
                    mayorEdad = (int)aleatorio;
               
                }   else if (aleatorio < menorEdad) {
                    menorEdad = (int)aleatorio;
                }
                
            }
            
        System.out.println("La edad mayor es: " + mayorEdad);
        System.out.println("La edad menor es: " + menorEdad);
        
        
    }
}