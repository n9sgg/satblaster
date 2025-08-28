import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RxWave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RxWave extends Actor
{
    private static int r = 0;  // Wave radius
    
    /**
     * Act - do whatever the RxWave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
         
        if (isAtEdge() ) 
        {
            setLocation(59,34);
        } 
        
        if ( r > 2000) {
            r = 0;
        }
        else {
            r = r + 20;    
        }
         
        GreenfootImage image = new  GreenfootImage(r + 200,r + 200);
        image.setColor(Color.WHITE);
        // image.drawRect(0,0,r + 199,r + 199 );
        image.drawOval(0,0,r + 199,r + 199 );
        this.setImage(image);
    }
}
