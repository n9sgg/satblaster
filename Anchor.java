import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Anchor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anchor extends Actor
{
    /**
     * Act - do whatever the Anchor wants to do. 
    */
    public void act()
    {
    
    // anchors move down
    setLocation(getX(), getY() + 5);
    
    // Check if we hit something
    Actor actorhit = getOneObjectAtOffset(0, 0, null);
    
    if( actorhit != null ) {
        if ( actorhit.getClass() !=  FishingBoat.class )
        {
            // Remove this anchor and whatever it hit
            if (actorhit != null ) {
                World world = getWorld();          
                world.removeObject(this);
                world.removeObject(actorhit);
                TotalCounter.add(5);
            }   
        }
    }    
    else if (isAtEdge() ) {
        // Remove it
        World world = getWorld();          
        world.removeObject(this);
    }
    }
}
