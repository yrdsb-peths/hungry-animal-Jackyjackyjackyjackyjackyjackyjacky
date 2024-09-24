import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Banana extends Food
{
    public Banana()
    {
        super(3);
    }
    public void act()
    {
        setLocation(getX(), getY() + speed  + 1);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
    }
}
