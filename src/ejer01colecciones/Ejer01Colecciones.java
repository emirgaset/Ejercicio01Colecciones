package ejer01colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
        
        System.out.println("-------------------------------------------------");
        
        //Eliminar mascota
        
        System.out.println("Que raza quiere eliminar??");
        String razaEliminar = leer.next();
        Iterator<String> iT = listaMascotas.iterator();
        int cont = 0;
        while (iT.hasNext()){
            
            if (iT.next().equals(razaEliminar)) {
                iT.remove();
                cont ++;
            }
            
        //Si no se encuentra raza, se le informa y se muestra lista ordenanda.
        
        }
        if (cont == 0) {
            System.out.println("No se encontro la Raza"); 
        }
        
        Collections.sort(listaMascotas);
        
        System.out.println("Se imprime lista ordenada");
        for (String aux : listaMascotas) {
            System.out.println(aux);
        }
        
    }
    
}
