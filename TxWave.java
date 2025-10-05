import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class TxWave extends Actor
{
    
    private int r = 0; // Wave radius

    /**
     * Act - do whatever the TxWave wants to do.
     */
    public void act()
    {       
        r = r + 5;
        
        GreenfootImage image = new  GreenfootImage(r + 1,r + 1);
        
        image.setColor(Color.WHITE);
        
        image.drawOval(0,0,r,r);
        
        setImage(image);
    }
}    



