/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfo7_5_3_prisontest;

/**
 *
 * @author GaLa
 */
public class Cell {
    
    //Exercise1Part1
    
    //Fields
    //public String name; //Exercise1Part1
    private String name; //Exercise2
    //public boolean isOpen; //Exercise1Part1
    private boolean isOpen; //Exercise2
    private String securityCode; //Exercise3Part1
    //Constructor
    public Cell(String name, boolean isOpen, String securityCode){
        this.name = name;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }
    
    //Exercise3Part1
    
    //Methods
    public String getName() {
        return name;
    }
    public boolean getIsOpen() {
        return isOpen;
    }
    public void displayDoor(){
        if (isOpen){
            System.out.println(this.name+" door is opened.");
        }else{
            System.out.println(this.name+" door is closed.");
        }
    }
    public void setIsOpen(String securityCode){
        if (this.securityCode.equals(securityCode)){
            this.isOpen = !this.isOpen;
            this.displayDoor();
        }else{
            System.out.println("Code is incorrect.");
        }
    }
    
}
