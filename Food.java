import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Food extends Actor
{
    int value;
    int speed = 2;
    public Food(int value){
        this.value = value;
    }
    public void setSpeed(int spd) {
       speed = spd; 
    }
}