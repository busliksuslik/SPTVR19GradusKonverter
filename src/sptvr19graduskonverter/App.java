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
        System.out.printf("incert operation%nFrom C to F - 1%nFrom F to C - 2");
        int choise = scan.nextInt();
        switch(choise){
            case 1:{
                System.out.print("incert temperature in celsius: ");
                double number = scan.nextDouble();
                System.out.printf("Ans = %.3f", number*1.8+32);
                break;
            }
            case 2:{
                System.out.print("incert temperature in Fahrenheit: ");
                double number = scan.nextDouble();
                System.out.printf("Ans = %.3f", (number-32)/1.8);
                break;
            }
        }
    }
    
}
