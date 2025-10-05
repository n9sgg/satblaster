import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;  // List

/**
 * Write a description of class GreenFish here.
 * 
 * @author n9sggt 
 * @version 1.00
 */
public class GreenFish extends Actor
{
    /**
     * Act - do whatever the GreenFish wants to do. 
     * 
     */
    public void act()
    {
        move(1);
                    
        if (getX() == 0 )
        {
            // A greenfish  hit the left edge of the world so turn around
            setRotation(180-getRotation()); // Flip the image           
                        
           // Set right facing side image
            GreenfootImage current_image = new  GreenfootImage("greenfish_right.png");
            this.setImage(current_image); 
        } 
        else if (getX() == getWorld().getWidth() - 1 ) 
        {  
            // A greenfish hit the right edge of the world so turn around
            setRotation( 180 - getRotation() ); // Flip the image
                       
            // Set left facing side image
            GreenfootImage current_image = new  GreenfootImage("greenfish_left.png");
            this.setImage(current_image); 
            
            // Check how many other greenfish are in the world    
            List<GreenFish> others = getWorld().getObjects(GreenFish.class);
            
            // Limit the number of greenfish in the world
            if ( others.size() < 5 ) {               
                // We are not over populated so add a new greenfish into the world
                Actor newgreenfish = new GreenFish();
                getWorld().addObject( newgreenfish, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(265) + 130 );
            }
        }     
    }
}
