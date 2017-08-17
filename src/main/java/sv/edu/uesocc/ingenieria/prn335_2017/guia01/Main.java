/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Utilities c = new Utilities();
        System.out.println(c.getResume("habia una ves una oveja que era fea, ella como pan todos los dias :v"));
        System.out.println(c.capitalizar("    habia  una     ves   una oveja que era fea, ella   como pan      todos los dias :v"));
        System.out.println(c.contarCoincidencias("pan","PAN pan Pan PaN pAn"));
        
    }
    
}
