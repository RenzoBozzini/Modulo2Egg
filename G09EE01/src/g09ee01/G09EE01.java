/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g09ee01;

import java.util.Scanner;

/**
 *Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 * @author RENZO
 */
public class G09EE01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] mesesDelAnio = {"enero","febrero","marzo","abril",
        "mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        
        String mesSecreto;
        mesSecreto = mesesDelAnio[8];
        
        String val;
        do {
         System.out.println("adivine el mes secreto");
        val = leer.next();
        
        if (val.equals(mesSecreto)) {
            System.out.println("Ganaste!");   
        }else{
            System.out.println("Intente con otro mes");
        }   
            
            
            
        } while (!val.equals(mesSecreto));
        
        
        
    }
    
}
