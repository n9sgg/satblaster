import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;  // List

/**
 * Write a description of class ColoredFish here.
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class ColoredFish extends Actor
{
    /**
     * Act - do whatever the ColoredFish wants to do.
     * 
     */
    public void act()
    {
        move(1);
                    
        if (getX() == 0 )
        {
            // A coloredfish  hit the left edge of the world so turn around
            setRotation(180-getRotation()); // Flip the image
                        
          
            
            // Set left facing side image    
            GreenfootImage current_image = new  GreenfootImage("coloredfish_right.png");           
            this.setImage(current_image);
        } 
        else if (getX() == getWorld().getWidth() - 1 ) 
        {  
            // A colored fish hit the right edge of the world so turn around
            setRotation( 180 - getRotation() ); // Flip the image
            
            // Set right facing side image
            GreenfootImage current_image = new  GreenfootImage("coloredfish_left.png");
            this.setImage(current_image);  
            
            // Check how many other coloredfish are in the world    
            List<ColoredFish> others = getWorld().getObjects(ColoredFish.class);
            
            // Limit the number of coloredfish in the world
            if ( others.size() < 4 ) {               
                // We are not over populated so add a new coloredfish into the world
                Actor newcoloredfish = new ColoredFish();
                getWorld().addObject( newcoloredfish, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(265) + 130 );
            }  
        }
    }
}    
