// The purpose of this class is to model a television
// Adrian 3/1/24
package com.mycompany.lab06;


public class Television {

    private final String MANUFACTURER; //will hold the brand name
    private final int SCREEN_SIZE; //will hold the size of the television
    private boolean powerOn = false; //will hold the value true if the power is on and false if the power is off
    private int channel = 2; //will hold the value of the station that the television is showing
    private int volume = 20; //will hold a number value representing the loudness (0 being no sound)
    
    //The purpose of the constructor is to create an instance of Television.
    //Constructors are used to construct objects.
    public Television(String brand,int size){    
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
    }
    
    /**
     * We can change the channel starting at 2 to a new channel int.
     * @param station will be the input to change the channel int.
     */
    public void setChannel(int station){
        channel = station;
    }
    
    /**
     * This method will change the state of powerOn from false to true and vice versa using the NOT(!) operator
     */
    public void power(){
        powerOn = !powerOn;
    }
    
    /**
     * This method will increase the volume up by one.
     */
    public void increaseVolume(){
        volume++;
    }
    
    /**
     * This method will decrease the volume by one.
     */
    public void decreaseVolume(){
        volume--;
    }
    
    /**
     * This method will give you the channel
     * @return 
     */
    public int getChannel(){
        return channel;
    }
    
    /**
     * This method will give you the volume.
     * @return 
     */
    public int getVolume(){
        return volume;
    }
    
    /**
     * This method will give you the manufacturer of the television.
     * @return 
     */
    public String getManufacturer(){
        return MANUFACTURER;
    }
    
    /**
     * This method will give you the screen size of the television.
     * @return 
     */
    public int getScreenSize(){
        return SCREEN_SIZE;
    }
   
    
    
}
