/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author desha
 */
public class Demo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Helicopter helicopter =new Helicopter();
        Tank tank = new Tank();
        Submarine submarine = new Submarine();
        
        helicopter.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);
        
        Observable observable = new Observable();
        observable.addObserver(helicopter);
        observable.addObserver(tank);
        
        observable.addObserver(submarine);
        
        new MainController(observable).setVisible(true);
        
        // TODO code application logic here
    }
    
}
