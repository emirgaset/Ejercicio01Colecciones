package ejer01colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer01Colecciones {
    public static void main(String[] args) {
        
        Scanner leer= new Scanner (System.in).useDelimiter("\n");
        
        ArrayList<String> listaMascotas = new ArrayList();
        
        //Agregar razas a la lista!!!
        
        boolean seguir = true;
        while(seguir){
            
            System.out.println("Ingrese la raza del perro");
            String raza = leer.next();
            listaMascotas.add(raza);
            
            System.out.println("Quiere continuar? si o no? gatito");
            String pregunta = leer.next();
            seguir = !"no".equals(pregunta);
          
        }
        
        System.out.println("-------------------------------------------------");
        
        //Muestre list
        
        System.out.println("Las mascotas de la lista son ");
        for (String aux : listaMascotas) {
            System.out.println(aux);
        }
        
    }
    
}
