import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class Tx extends Actor
{   
    /**
     * Act - do whatever the Tx wants to do. 
    */
    public void act()
    {

            // Check for wave launch command
            // if (Greenfoot.isKeyDown("space") ) {
            if (Greenfoot.mousePressed(null) ) {

                // Launch a wave
                World world = getWorld();   
                TxWave txWaveNext = new TxWave();
                world.addObject(txWaveNext,59, 350);
                
                // Wait awhile for wave to propagate
                // and waste some key presses too :)
                sleepFor(10);
            }    
    }   
}