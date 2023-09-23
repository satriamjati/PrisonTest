/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisontest;

/**
 *
 * @author GaLa
 */
public class Prisoner {
    
    //Fields
    
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    private String securityCode;

    //Constructor
    
    public Prisoner(String name, double height, int sentence, Cell cell) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
    }

    //Methods

    public void openDoor(){
        getCell().setIsOpen(this.securityCode);
        if(getCell().getIsOpen()){
            System.out.println("Lucky!");
        }else{
            System.out.println("Out of luck.");
        }
    }
    
    public void think(String securityCode) {
        this.securityCode = securityCode;
        System.out.println("I'll have my revenge.");
    }

    public void display(boolean b) {
        System.out.println("Name: " + getName());
        System.out.println("Height: " + getHeight());
        System.out.println("Sentence: " + getSentence());
        System.out.println("Cell: " + getCell().getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSentence() {
        return sentence;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
