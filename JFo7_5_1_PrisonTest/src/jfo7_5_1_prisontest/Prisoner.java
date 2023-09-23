/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfo7_5_1_prisontest;

/**
 *
 * @author GaLa
 */
public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    public Cell cell; //Exercise1Part1
    
    //Constructor
    public Prisoner(String name, double height, int sentence, Cell cell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
        this.cell = cell; //Exercise1Part1
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell: " +cell.name); //Exercise1Part1
    }
    public void openDoor(){
        cell.isOpen=!cell.isOpen;
        if (cell.isOpen){
            System.out.println(cell.name+" door is opened.");
        } else {
            System.out.println(cell.name+" door is closed.");
        }
    } //Exercise1Part2
}
