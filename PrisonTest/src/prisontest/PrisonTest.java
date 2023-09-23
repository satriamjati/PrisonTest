/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prisontest;

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
        
        //Initilization
        String securityCode = randomSecurityCode();
        Cell        c01 = new Cell("A1",false,securityCode); 
        Prisoner    p01 = new Prisoner("Bubba", 2.08, 4,c01);
        Guard       g01 = new Guard("Boss Man",c01,securityCode);
        p01.display(true);
        
        //Guard testing door
        System.out.println("\n"+g01.getName()+" is testing "+g01.getCell().getName()+" door:");
        g01.openDoor();
        g01.openDoor();
        
        //Prisoner trying to open door
        System.out.println("\n"+p01.getName()+" is trying to open "+p01.getCell().getName()+" door:");
        p01.think(randomSecurityCode());
        p01.openDoor();
    }
    public static String randomSecurityCode(){
        //Generate 4 Digit Number
        return String.valueOf((int)Math.floor(Math.random()*10));
    }
}
