import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class Rx extends Actor
{
    /**
     * Act - do whatever the Rx wants to do. 
     */
    public void act()
    {
        Actor rxWave = getOneIntersectingObject(RxWave.class);
        
        if (rxWave != null) {  
            // We have been hit by a RxWave
              
            // Remove the wave from the world
            World world = getWorld();          
            world.removeObject(rxWave);          

            //Add to the Tx counter
            TxCounter.add(5);
            
            // Beep 
            Greenfoot.playSound("beep.wav");

            
        }
    }
}
