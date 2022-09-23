/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03truthviñas;

/**
 *
 * @author cxarl
 */
public class WaterBottle {
    String color;
    String brand;
    int volume; // in ounces
    double height; // in cm
    double diameter; // in inches
    
    public WaterBottle() { // default
        color = "blue";
        brand = "Hydro Flask";
        volume = 32;
        height = 23.9;
        diameter = 3.58;
    }
    
    public WaterBottle(String c, String b, int v, double h, double d) {
        color = c;
        brand = b;
        volume = v;
        height = h;
        diameter = d;
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
