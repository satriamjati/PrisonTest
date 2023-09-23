/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisontest;

/**
 *
 * @author GaLa
 */
public class Cell {

    //Fields
    
    private String name;
    private boolean isOpen;
    private String securityCode;
    private Guard guard;

    //Constructor
    
    public Cell(String name, boolean isOpen, String securityCode) {
        this.name = name;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }

    //Methods
    
    public String getName() {
        return name;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void displayDoor() {
        if (isOpen) {
            System.out.println(this.name + " door is opened.");
        } else {
            System.out.println(this.name + " door is closed.");
        }
    }

    public void setIsOpen(String securityCode) {
        if (this.securityCode.equals(securityCode)) {
            this.isOpen = !this.isOpen;
            this.displayDoor();
        } else {
            System.out.println("Code is incorrect.");
        }
    }
}
