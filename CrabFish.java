import greenfoot.*;     // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;  // List

/**
 * Write a description of class CrabFish here.
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class CrabFish extends Actor
{
    /**
     * Act - do whatever the CrabFish wants to do. 
    */
    public void act()
    {
        move(1);      
        
        if (getX() == 0 )
        {
            // A crab hit the left edge of the world so turn around
            setRotation(180-getRotation()); // Flip the image
        } 
        else if (getX() == getWorld().getWidth() - 1 ) 
        {  
            // A crab hit the right edge of the world so turn around
            setRotation( 180 - getRotation() ); // Flip the image
            
            // Check how many other crabs are in the world    
            List<CrabFish> others = getWorld().getObjects(CrabFish.class);
            
            // Limit the number of crabs in the world
            if ( others.size() < 10 ) {            
                // We are not over populated so add a new crab into the world
                Actor newcrab = new CrabFish();
                getWorld().addObject( newcrab, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(265) + 130 );
            }
        }  
    }
}
