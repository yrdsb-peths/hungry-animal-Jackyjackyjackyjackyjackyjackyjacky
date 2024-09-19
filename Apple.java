import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    public void act()
    {
        setLocation(getX(), getY() + 3);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
    }
}
