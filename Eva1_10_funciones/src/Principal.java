
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
        System.out.println("Introduce la base: ");
        double dBase = input.nextDouble();
        System.out.println("Introduce la altura: ");
        double dAltura = input.nextDouble();
                        //Llamada a función
        double dArea = calculaArea(dBase, dAltura);
        System.out.println("El área es " + dArea );        
        double dArea2 = calculaArea(100,200);
        System.out.println("El área es: " +dArea2);
        
        
        
    }
    public static double calculaArea(double dBase, double dAltura){   //Declaración o cabecera de la función
          //Implementación de la función
   double dArea= (dBase * dAltura)/2;
          return  dArea;
        

    }         
}
