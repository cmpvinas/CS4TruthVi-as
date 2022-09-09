/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
/**
 *
 * @author TRUTH
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String typeA = "Workplace";
        String typeB = "Family";
        String typeC = "Friends";
        
        int aSeasons = 7;
        int bSeasons = 11;
        
        System.out.print("Sitcom 1 \n");
        System.out.print("Name: Parks and Recreation \n");
        System.out.printf("Type of Sitcom: %s \n", typeA);
        System.out.printf("Number of Seasons: %d \n \n", aSeasons);
        
        System.out.print("Sitcom 2 \n");
        System.out.print("Name: Modern Family \n");
        System.out.printf("Type of Sitcom: %s \n", typeB);
        System.out.printf("Number of Seasons: %d \n \n", bSeasons);
        
        System.out.print("Sitcom 3 \n");
        System.out.print("Name: New Girl \n");
        System.out.printf("Type of Sitcom: %s \n", typeC);
        System.out.printf("Number of Seasons: %d \n \n", aSeasons);
        
        boolean aWorkplaceSitcom = true;
        boolean notAWorkplaceSitcom = false;
        
        boolean hasMoreSeasons = true;
        boolean hasLessSeasons = false;
        
        System.out.printf("Total Number of Seasons: %d \n", (bSeasons + aSeasons*2));
        System.out.println("New Girl is a workplace sitcom:"); {
            if (typeC == "Workplace")
                System.out.println(notAWorkplaceSitcom);
                        else System.out.println(aWorkplaceSitcom);
        }
    }
    
}
