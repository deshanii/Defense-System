/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package demo;

/**
 *
 * @author desha
 */
public interface Observer {
    public void areaClearedMessage(boolean status);
    public void updatePosition(int position);
    public void updateSendMessage(String message, boolean select, int checkNum);
}
    
