import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label label;
    int level = 1;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        label = new Label(0, 80);
        addObject(label, 30, 35);
        
        createFood();
    }
    
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore(int value){
        score += value;
        label.setValue(score);
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    public void createFood(){
        Food food;
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            food = new Apple();
        }
        else {
            food = new Banana();
        }
        food.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(food, x, y);
    }
}
