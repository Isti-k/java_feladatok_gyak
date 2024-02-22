/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feladatok;

import java.util.Random;
import java.util.Scanner;

public class Feladatok {
    
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in,"latin2");
        
    public static void main(String[] args) {
        System.out.println("1. feladat:");
        int szam = rnd.nextInt(3,11);
        System.out.println("Genarált szám: " + szam);
        
        System.out.println("");
        
        System.out.println("2. feladat:");
        System.out.print("Adjon meg egy tetszőleges betűt!: ");
        String betu = sc.nextLine();
        System.out.println("Betűt: " + betu);
        
        System.out.println("");
        
        System.out.println("3. feladat:");
        while (betu.length() > 1){
            System.out.println("Adj meg egy karakterű betűt!: ");
            betu = sc.nextLine();
        }
        System.out.println("Egy karakterű!");
        
        System.out.println("");
        
        System.out.println("4. feladat:");
        for (int i = 0; i <szam; i++) {
            if (i < szam-1){
               System.out.print(betu + ",");
            }else if (i < szam){
                System.out.println(betu + "");
            }
        }
        
        System.out.println("");
        
        System.out.println("5. feladat:");
        System.out.println("A tömb elemei: ");
        final int Lista = 5;
        double[] szamok = new double[5];
        for (int i = 0; i < Lista; i++){
            szamok[0] = Math.PI;
            szamok[1] = Math.E;
        }
        for (int i = 0; i < szamok.length; i++){
                System.out.println(szamok[i]);
        }
        
        System.out.println("");
        
        System.out.println("6. feladat:");
        for (int i = 0; i < Lista; i++) {
            szamok[2] = 1/3;
            if (szamok[i] > 0){
                System.out.println(szamok[i]);
            }
            
        }
        
        System.out.println("");
        
        System.out.println("7. feladat:");
        for (int i = 0; i < Lista; i++) {
            szamok[3] = rnd.nextDouble(10.2,19.51);
            szamok[4] = rnd.nextDouble(10.2,19.51);
            System.out.println(szamok[i]);
        }
        
    }
    
    
    
}
