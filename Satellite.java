import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class Satellite extends Actor
{
    /**
     * Act - do whatever the Satellite wants to do. 
     */
    public void act()
    {
        
        move(1);
         
        if (isAtEdge() ) 
        {
            // Go home
            setLocation(59,34); 
            
            //Add to the  orbit counter
            OrbitCounter.add(1);
            
            // Update the Rating - rx Count / Orbit count
            int orbits = OrbitCounter.getValue();
            int score = TxCounter.getValue();
            
            if ( orbits > 0  && score > 0) {
                TotalCounter.setTo( score / orbits );   
            } else TotalCounter.setTo(0);
        }
        
        // Check for a TxWave
        // Actor txWave = getOneObjectAtOffset(0, 0, TxWave.class);
        // OR 
            Actor txWave = getOneIntersectingObject(TxWave.class);
        
        if (txWave != null) {  
            // We have been hit by a TxWave
              
            // Remove the wave from the world
            World world = getWorld();          
            world.removeObject(txWave);
                         
            // Launch a Rx wave
            Actor rxWave = new RxWave();
            world.addObject(rxWave, getX(), getY());
            
        }
        
    }
}