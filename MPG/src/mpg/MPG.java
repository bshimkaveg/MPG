/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpg;
import java.util.Scanner;
/**
 *
 * @author gshimkaveg
 */
public class MPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double distance;
        double mpg;
        double pricePerGallon;
        double totalCost;
        
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter the total disance in miles: ");
        distance = myScanner.nextDouble();
        System.out.println("Enter the MPG for the vehical: ");
        mpg = myScanner.nextDouble();
        System.out.println("Enter the price of one gallon of gas: ");
        pricePerGallon = myScanner.nextDouble();
        
        totalCost = (distance/mpg)*pricePerGallon;
        System.out.printf("The trip is going to cost $%5.2f" ,totalCost);
        System.out.println();
        
        
   
    }
    
}
