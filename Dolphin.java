import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;  // List

/**
 * Write a description of class Dolphin here.
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class Dolphin extends Actor
{
    /**
     * Act - do whatever the Dolphin wants to do. 
    */
    public void act()
    {
        move(1); 
        
        if (getX() == 0 )
        {      
            // A dolphin hit the left edge of the world so turn around
            setRotation(180 - getRotation()); // Flip the image
            
            // Set right facing side image
            GreenfootImage current_image = new  GreenfootImage("dolphin_right.png");
            this.setImage(current_image);
            
            // Check how many other dolphins are in the world    
            List<Dolphin> others = getWorld().getObjects(Dolphin.class);
            
            // Limit the number of dolphins in the world
            if ( others.size() < 6 ) {            
            // We are not over populated so add a new dolhin into the world
            Actor dolphin = new Dolphin();
            getWorld().addObject( dolphin, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(265) + 130 );            
            }
        } 
        else if (getX() == getWorld().getWidth() - 1 ) 
        {  
            // A dolphin hit the right edge of the world so turn around
            setRotation( 180 - getRotation() ); // Flip the image           

            // Set left facing side image    
            GreenfootImage current_image = new  GreenfootImage("dolphin_left.png");           
            this.setImage(current_image);
        } 
    }
}
