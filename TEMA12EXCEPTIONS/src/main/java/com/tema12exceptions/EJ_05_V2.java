/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tema12exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ_05_V2 {


    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int dia = 0, mes = 0, año = 0;
        System.out.println("Introduce la fecha:");
        try {
            System.out.println("Intoduce el numero del dia: ");
            dia = Integer.parseInt(scaner.nextLine());
            System.out.println("Intoduce el numero del mes: ");
            mes = Integer.parseInt(scaner.nextLine());
            System.out.println("Intoduce el año: ");
            año = Integer.parseInt(scaner.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println("La fecha es valida: "+validarFecha(dia, mes, año));
    }

    static public boolean validarFecha(int dia, int mes, int año) {

        try {
            LocalDate fecha = LocalDate.of(año, mes, dia);
        } catch (DateTimeException ex) {
            return false;
        }
        return true;
    }

}