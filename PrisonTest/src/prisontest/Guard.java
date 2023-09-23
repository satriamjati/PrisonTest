/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisontest;

/**
 *
 * @author GaLa
 */
public class Guard {
    
    //Fields
    
    private String name;
    private String securityCode;
    private Cell cell;
    
    //Constructor
    
    public Guard(String name, Cell cell, String securityCode){
        this.name = name;
        this.cell = cell;
        this.securityCode = securityCode;
    }
    
    //Methods
    
    public void openDoor(){
        getCell().setIsOpen(this.securityCode);
    }
    
    public String getName() {
        return name;
    }
    
    public Cell getCell() {
        return cell;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }
}
