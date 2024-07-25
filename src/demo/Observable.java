/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;
import java.util.ArrayList;
/**
 *
 * @author desha
 */
public class Observable {
    private final ArrayList<Observer> observerList = new ArrayList<>();
    
    private boolean status;
    private int position;
    private String message;
    private boolean select;
    private int checkNum;
    
    public void addObserver(Observer ob){
        observerList.add(ob);
    }
    public void setAreaClearedMessage(boolean status){
        if(this.status!=status){
            this.status=status;
            areaClearedMsgNotifyDevices();
        }
    }
    public void setUpdatePosition(int position){
        if(this.position!=position){
            this.position=position;
            updatePositionNotifyDevices();
        }
    }
    public void setUpdateSendMessages(String message, boolean select, int checkNum){
        if (this.message!=message) {
            this.message=message;
            this.select=select;
            this.checkNum=checkNum;
            updateSendMsgPositionNotifyDevices();
        }
    }
    
      public void areaClearedMsgNotifyDevices(){
        for (Observer ob : observerList) {
          ob.areaClearedMessage(status);  
        }
    }
    
    public void updatePositionNotifyDevices(){
        for (Observer ob : observerList) {
            ob.updatePosition(position);
        }
        
    }
  
    public void updateSendMsgPositionNotifyDevices(){
        for (Observer ob : observerList) {
            ob.updateSendMessage(message,select,checkNum);
        }
        
    }
    
}
