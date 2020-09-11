/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19graduskonverter;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private Scanner scan = new Scanner(System.in);
    public void Start(){
        System.out.printf("select temperature%nC - 1%nF - 2%nK - 3 ");
        int choise = scan.nextInt();
        switch(choise){
            case 1:{
                System.out.print("incert temperature in celsius: ");
                double number = scan.nextDouble();
                System.out.printf("F = %.3f\nK = %.2f", number*1.8+32 , number + 273.15);
                break;
            }
            case 2:{
                System.out.print("incert temperature in Fahrenheit: ");
                double number = scan.nextDouble();
                System.out.printf("C = %.3f\nK = %.3f", (number-32)/1.8,(number-32)/1.8+273.15 );
                break;
            }
            case 3:{
                System.out.print("incert temperature in Kelvin: ");
                double number = scan.nextDouble();
                System.out.printf("C = %.3f\nF = %.3f", number - 273.15,(number-273.15)*1.8+32);
                break;
            }
            default:{
                System.out.println("Select valid operation");
                this.Start();
                break;
            }
        }
    }
    
}
