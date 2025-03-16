/*
Un profesor ha desarrollado un examen tipo test de 20 preguntas y cada una de ellas tiene
cuatro opciones: a), b), c) ó d), siendo solo una de ellas la correcta. Cada pregunta correcta suma 0.5
puntos y cada una incorrecta resta 0.2 puntos, no pudiendo llevar un alumno ninguna nota inferior
a cero. Desarrolla una clase llamada Examen que almacene las respuestas correctas de las 20
preguntas. La clase debe disponer de algún mecanismo mediante el que se le pase las respuestas de
un alumno para las 20 preguntas (a,b,c,d o bien z, siendo respuesta en blanco) y nos informe de la
puntuación en el examen. Hacer un programa que permita primero informar de las respuestas
correctas a un examen y después introducir las respuestas de los alumnos, mostrándonos la nota
obtenida por los mismos. 
 */
package com.tema06clases;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO16_EXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char respuestaExamen;
        StringBuilder totalRespuestasExamen = new StringBuilder();

        char respuestaALumno;
        StringBuilder totalRespuestasAlumno = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Escribe la respuesta de la pregunta %d:", i);
            respuestaExamen = teclado.nextLine().charAt(0);
            totalRespuestasExamen.append(respuestaExamen);
           
        }
        System.out.println(totalRespuestasExamen);

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Escribe la respuesta de la pregunta %d:", i);
            respuestaALumno = teclado.nextLine().charAt(0);
            totalRespuestasAlumno.append(respuestaALumno);
           
        }
        System.out.println(totalRespuestasAlumno);

        Examen examen1 = new Examen(totalRespuestasAlumno.toString(), totalRespuestasExamen.toString());

        System.out.println(examen1.getNotaTotal());

    }

}

class Examen {

   
    private String respuestaalumno;
    private String respuestasExamen;
    private double notaTotal;

    public Examen(String respuestaalumno, String respuestasExamen) {
        this.respuestaalumno = respuestaalumno;
        this.respuestasExamen = respuestasExamen;
        this.notaTotal=calcularNota(respuestaalumno, respuestasExamen);

    }

   static double calcularNota(String respuestaalumno, String respuestasExamen) {
        double nota = 0;
        for (int i = 0; i < respuestasExamen.length(); i++) {

            if (respuestasExamen.charAt(i) == respuestaalumno.charAt(i)) {
                nota += 0.5;
            } else {
                nota -= 0.2;
            }
        }
        return nota;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

}
