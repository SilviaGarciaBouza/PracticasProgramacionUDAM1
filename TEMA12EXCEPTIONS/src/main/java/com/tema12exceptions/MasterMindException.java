/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tema12exceptions;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class MasterMindException {


    private int longitud;
    private String numeroAleatorio;
    private String cadenaIntroducida;
    private int numeroAciertosMismoLugar;
    private int numeroAciertosDiferenteLugar;

    public MasterMindException(int longitud, String cadenaIntroducida) {
        this.longitud = longitud;
        this.numeroAleatorio = numeroAleatorio(longitud);
        this.cadenaIntroducida = cadenaIntroducida;
       
        this.numeroAciertosMismoLugar = aciertosMismoLugar(cadenaIntroducida, this.numeroAleatorio);
        this.numeroAciertosDiferenteLugar = publicaciertosDiferenteLugar(cadenaIntroducida, this.numeroAleatorio);
    }

    public String getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public int getNumeroAciertosMismoLugar() {
        return numeroAciertosMismoLugar;
    }

    public int getNumeroAciertosDiferenteLugar() {
        return numeroAciertosDiferenteLugar;
    }

    static public String numeroAleatorio(int longitud) {
        StringBuilder cadena = new StringBuilder();
        StringBuilder numerosCadena = new StringBuilder("123456789");
        int numero;
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            numero = random.nextInt(0, numerosCadena.length());
            cadena.append(numerosCadena.toString().charAt(numero));
            numerosCadena.deleteCharAt(numero);
        }
        return cadena.toString();
    }

    static public int aciertosMismoLugar(String cadenaIntroducida, String cadenaAleatoria) {
        int contador = 0;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {
            if (cadenaAleatoria.charAt(i) == cadenaIntroducida.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }

    static public int publicaciertosDiferenteLugar(String cadenaIntroducida, String cadenaAleatoria) {
        int contador = 0;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {
            
            for (int j = 0; j < cadenaAleatoria.length(); j++) {
                if (cadenaIntroducida.charAt(i) == cadenaAleatoria.charAt(j)) {
                    contador++;
                    break;
                }
            }
          
        }
        return contador;
    }

}