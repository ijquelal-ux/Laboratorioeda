/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorioedad;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class Laboratorioedad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc/*escaner*/ = new Scanner(System.in);
        int edad;
        System.out.print("Ingerese su edad: ");
        edad=sc.nextInt();
        if(edad>=18){
            if(edad >65){
                if(edad >105){
                    System.out.println("Edad fuera de rango, Ingrese correctamente la edad");
                }else{
                    System.out.println("Eres de Tercera edad.");
                }
            }else{
                System.out.println("Eres Mayor Edad");
            }
        }else if(edad <0){
            System.out.println("Ingrese una edad correcta.");
    }
    
    }
}