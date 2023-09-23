/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfo7_5_4_prisontest;

/**
 *
 * @author GaLa
 */
public class Prisoner {
    //Fields 
    //Exercise4
    private String name;
    private double height;
    private int sentence;
    private Cell cell; //Exercise1Part1
    /*
    public String name;
    public double height;
    public int sentence;
    public Cell cell; //Exercise1Part1
    */ //Exercise4
    
    //Constructor
    public Prisoner(String name, double height, int sentence, Cell cell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
        this.cell = cell;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight());
        System.out.println("Sentence: " +getSentence());
        //System.out.println("Cell: " +cell.name); //Exercise1Part1
        System.out.println("Cell: " +getCell().getName()); //Exercise3Part2
    }
    
    /*
    public void openDoor(){
        cell.isOpen=!cell.isOpen;
        if (cell.isOpen){
            System.out.println(cell.name+" door is opened.");
        } else {
            System.out.println(cell.name+" door is closed.");
        }
    } //Exercise1Part2
    */ //Exercise3Part2

    //Exercise4
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
