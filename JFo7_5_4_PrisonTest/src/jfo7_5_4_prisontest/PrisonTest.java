/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jfo7_5_4_prisontest;

/**
 *
 * @author GaLa
 */
public class PrisonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 
         * Model 
        
        * Prison    p01 = new Prisoner();
        * Cell      c01 = new Cell();
        * Guard     g01 = new Guard();
        * p01.name = "Bubba";
        * c01.name = "A1";
        * g01.name = "Boss Man";

        */
        
        //Exercise1Part2
        //Cell        c01 = new Cell("A1",false); //Exercise1Part2
        Cell        c01 = new Cell("A1",false,"0123"); //Exercise3Part2
        Prisoner    p01 = new Prisoner("Bubba", 2.08, 4,c01);
        p01.display(true);
        /*
        p01.openDoor();
        p01.openDoor();
        p01.openDoor();
        */ //Exercise3Part2
        
        //Exercise3Part2
        c01.setIsOpen("0123");
        c01.setIsOpen("1999");
    }
    
}
