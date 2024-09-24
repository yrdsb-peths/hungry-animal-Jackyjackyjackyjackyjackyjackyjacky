import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * title screen
 */

public class TitleScreen extends World
{
    Label titleLabel = new Label ("Hungry Elephant", 60);
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        addObject(titleLabel, getWidth() / 2, 200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,466,142);
        elephant.setLocation(468,150);
        elephant.setLocation(482,150);
        elephant.setLocation(475,151);
        elephant.setLocation(462,141);
        elephant.setLocation(453,120);
        Label label = new Label("Use \u2190 and \u2192 to move", 40);
        addObject(label,283,274);
        Label label2 = new Label("Press <space> to start", 40);
        addObject(label2,270,343);
    }
}
