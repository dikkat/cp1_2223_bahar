/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.section2;

import java.util.Locale;
import java.util.Scanner;


public class Week8_2 {
    
    
    public static void main(String[] args) {
        Material mat1 = new Material("carbon", 200);
        Material mat2 = new Material("lithium", 300);
        Material mat3 = new Material("carbon", 200);
        
        Factory factory = new Factory("Fabrika");
        
        factory.addMaterial(mat3);
        
        factory.removeMaterial(mat2);
        
    }
    
}
