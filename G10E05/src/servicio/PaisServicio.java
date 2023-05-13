/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author RENZO
 */
public class PaisServicio {

    Scanner leer = new Scanner(System.in);
    HashSet<String> listaPaises = new HashSet();

    public void crearPais() {
        String aux;
        do {
            System.out.println("Ingrese un Pais");
            listaPaises.add(leer.next());
            System.out.println("Desea agregar otro Pais? (s)");
            aux = leer.next();
        } while (aux.equals("s"));
        System.out.println(listaPaises);
    }
    
    public void buscaYelimina(){
        System.out.println("Ingrese un pais a eliminar");
        String aux1 = leer.next();
        Boolean aux2 = false;
        Iterator<String> it = listaPaises.iterator();        
        while (it.hasNext()) {
            String unPais = it.next();
            if (unPais.equals(aux1)) {
                listaPaises.remove(aux1);
                aux2=true;                
            }        
        }
        if (aux2) {
            System.out.println("Se elimino el Pais ingresado");
            System.out.println(listaPaises); 
        }else{
            System.out.println("El pais no estaba en la lista");
            System.out.println(listaPaises); 
        }
        
              
        
    }
}
