/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg.g.e;

/**
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
 * un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E 0-0-4 0-1-2
 * 0-1-E Nota: investigar función equals() y como convertir números a String.
 *
 * @author RENZO
 */
public class G03EE12 {

    public static void main(String[] args) {
        String auxi, auxj, auxk;

        for (int i = 0; i < 10; i++) {
            auxi = Integer.toString(i);
            if (auxi.equals("3")) {
                auxi = "E";
            }
            for (int j = 0; j < 10; j++) {
                auxj = Integer.toString(j);
                if (auxj.equals("3")) {
                    auxj = "E";
                }
                for (int k = 0; k < 10; k++) {
                    auxk = Integer.toString(k);
                    if (auxk.equals("3")) {
                        auxk = "E";
                    }

                    System.out.println(auxi + "-" + auxj + "-" + auxk);
                }
            }

        }
    }
}
