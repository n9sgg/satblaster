import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;  // List

/**
 * Write a description of class GirlFish here.
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class GirlFish extends Actor
{
    /**
     * Act - do whatever the GirlFish wants to do.
     */
    public void act()
    {
        move(1);
        
        if (getX() == 0 )
        {
            // A girlfish  hit the left edge of the world so turn around
            setRotation(180-getRotation()); // Flip the image
            
            // Set right facing side image
            GreenfootImage current_image = new  GreenfootImage("girlfish_right.png");
            this.setImage(current_image);  
        } 
        else if (getX() == getWorld().getWidth() - 1 ) 
        {  
            // A girlfish hit the right edge of the world so turn around
            setRotation( 180 - getRotation() ); // Flip the image
 
            // Set right facing side image
            GreenfootImage current_image = new  GreenfootImage("girlfish_left.png");
            this.setImage(current_image);  
            
            // Check how many other girlfish are in the world    
            List<GirlFish> others = getWorld().getObjects(GirlFish.class);
            
            // Limit the number of girlfish in the world
            if ( others.size() < 5 ) {               
                // We are not over populated so add a new girlfish into the world
                Actor newgirlfish = new GirlFish();
                getWorld().addObject( newgirlfish, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(265) + 130 );
            }
        }        
    }
}
