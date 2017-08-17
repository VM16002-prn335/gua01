/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.ing.prn335.guia01;

/**
 *
 * @author usuario
 */
public class Utilities {
    public String getResume(String texto) {
        String cadena = "";
        if (texto.length() > 30) {
            for (int i = 0; i < 30; i++) {
                cadena += String.valueOf(texto.charAt(i));
            }
        } else {
            cadena = texto;
        }
        return cadena;
    }

    public String capitalizar(String texto) {
        String cadena;
        texto = texto.replaceAll("  ", " ");
        cadena = String.valueOf(texto.charAt(0)).toUpperCase();

        for (int i = 1; i < texto.length(); i++) {
            if (texto.charAt(i - 1) == ' ' && texto.charAt(i) != ' ') {
                cadena += String.valueOf(texto.charAt(i)).toUpperCase();
            } else {
                cadena += texto.charAt(i);
            }

        }
        return cadena;
    }

    public int contarCoincidencias(String frase, String texto) {
        int cantidad = 0, niv=0;
        String busqueda;
        if (frase.length() < texto.length()) {
            for (int i = frase.length(); i <= texto.length(); i++, niv++) {
                busqueda="";
                for (int j = 0+niv; j < frase.length()+niv; j++) {
                    busqueda += String.valueOf(texto.charAt(j));
                }
                if(frase.equalsIgnoreCase(busqueda)){
                    cantidad++;
                }
            }

        } else {
            cantidad++;
        }
        return cantidad;
    }
}
