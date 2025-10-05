import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class RxWave extends Actor
{
    
    private int r = 0;  // Wave radius
    
    /**
     * Act - do whatever the RxWave wants to do. 
     */
    public void act()
    {
        
        move(1); 
         
        if ( isAtEdge() ) {
            setLocation(59,34);
        } 

        r = r + 5;
         
        GreenfootImage image = new  GreenfootImage(r + 1,r + 1);
        
        image.setColor(Color.BLACK);
        
        image.drawOval(0,0,r,r);
        
        setImage(image);
        
    }
}
