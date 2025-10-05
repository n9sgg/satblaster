import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;  // List

/**
 * Write a description of class SeaHorse here.
 * 
 * @author n9sg 
 * @version 1.00
 */
public class SeaHorse extends Actor
{
    /**
     * Act - do whatever the SeaHorse wants to do. 
     * 
     */
    public void act()
    {
        move(1);
                
        if (getX() == 0 )
        {
            // A seahorse hit the left edge of the world so turn around
            setRotation(180-getRotation()); // Flip the image
            
            // Set right facing side image
            GreenfootImage current_image = new  GreenfootImage("seahorse_right.png");
            this.setImage(current_image);  
            
            // Check how many other seahorse are in the world    
            List<SeaHorse> others = getWorld().getObjects(SeaHorse.class);
            
            // Limit the number of seahorse in the world
            if ( others.size() < 4 ) {            
            // We are not over populated so add a new seahorse into the world
            Actor newseahorse = new SeaHorse();
            getWorld().addObject( newseahorse, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(265) + 130 );            
            }
        } 
        else if (getX() == getWorld().getWidth() - 1 ) 
        {  
            // A dolphin hit the right edge of the world so turn around
            setRotation( 180 - getRotation() ); // Flip the image 
                        
            // Set left facing side image
            GreenfootImage current_image = new  GreenfootImage("seahorse_left.png");
            this.setImage(current_image);
        }      
    }
}
