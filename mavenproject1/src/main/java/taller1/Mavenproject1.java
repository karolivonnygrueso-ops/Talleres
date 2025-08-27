/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller1;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int horas;
        double valorHora, pagosindescuent, descuento, pagodescuent;

        System.out.print("Ingrese horas trabajadas: ");
        horas = in.nextInt();
        System.out.println("Horas: " + horas);

        System.out.print("Ingrese valor de la hora: ");
        valorHora = in.nextDouble();

        if (horas <= 40) {
            pagosindescuent = horas * valorHora;
        } else {
            pagosindescuent = (40 * valorHora) + ((horas - 40) * valorHora * 2);
        }
           System.out.println("El pago sin descuento : " + pagosindescuent);
           
        descuento = pagosindescuent * 0.08;
        pagodescuent = pagosindescuent - descuento;
        System.out.println("Descuento: " + descuento);
        
        
        System.out.println("Pago final: " + pagodescuent);
    }
}
