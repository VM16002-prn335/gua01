/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

/**
 *
 * @author VM16002
 */
public class Utilities {

    /**
     * Este metodo sirve sirve para hacer un resumen de un texto, retornando las
     * primeras 30 letras.
     *
     * @param texto En esta variable se espera recibir un texto.
     * @return Devolvera las primeras 30 letras de el texto.
     */
    public String getResume(String texto) {
        String cadena = "";
        int ct1;
        if (texto.length() > 30) {
            for (ct1 = 0; ct1 < 30; ct1++) {
                cadena += String.valueOf(texto.charAt(ct1));
            }
        } else {
            cadena = texto;
        }
        return cadena;
    }

    /**
     * Este metodo sirve para convertir los espacios dobles en espacios simples
     * y capitalizar las palabras.
     *
     * @param texto En esta variable se espera recibir un texto.
     * @return Retornara el mismo texto, pero con espacios simples y palabras capitalizadas.
     */
    public String capitalizar(String texto) {
        String cadena;
        int ct1;
        texto = texto.replaceAll("  ", " ");
        cadena = String.valueOf(texto.charAt(0)).toUpperCase();

        for (ct1 = 1; ct1 < texto.length(); ct1++) {
            if (texto.charAt(ct1 - 1) == ' ' && texto.charAt(ct1) != ' ') {
                cadena += String.valueOf(texto.charAt(ct1)).toUpperCase();
            } else {
                cadena += texto.charAt(ct1);
            }

        }
        return cadena;
    }

    /**
     * Este metodo sirve para buscar concidencias en un texto.
     *
     * @param frase En esta variable se espera recibir una frase o una palabra para buscar en el texo ingresado.
     * @param texto En esta variable se espera recibir un texto.
     * @return Retornara el numero de veces que aparecera la frase en el texto.
     */
    public int contarCoincidencias(String frase, String texto) {
        int cantidad = 0, niv = 0, ct1, ct2;
        String busqueda;
        if (frase.length() < texto.length()) {
            for (ct1 = frase.length(); ct1 <= texto.length(); ct1++, niv++) {
                busqueda = "";
                for (ct2 = 0 + niv; ct2 < frase.length() + niv; ct2++) {
                    busqueda += String.valueOf(texto.charAt(ct2));
                }
                if (frase.equalsIgnoreCase(busqueda)) {
                    cantidad++;
                }
            }

        } else {
            cantidad++;
        }
        return cantidad;
    }
}
