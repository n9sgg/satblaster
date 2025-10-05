import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishingBoat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishingBoat extends Actor
{
    /**
     * Act - do whatever the FishingBoat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         // Check for drop anchor command
         
        //if (Greenfoot.isKeyDown("space") ) {
        if (Greenfoot.mousePressed(null) ) {
        
            // Drop an anchor
            World world = getWorld();   
            Anchor anchor = new Anchor();
            world.addObject(anchor,getX(), getY());
                             
            AnchorCounter.add(1);  
                        
            // Update the Rating - rx Count / Orbit count
            int anchors = AnchorCounter.getValue();
            int score = TotalCounter.getValue() * 5; // Why divide by 5? For each hit the score goes up by 5, so ...
             
            if ( anchors > 0  && score > 0) {
                Rating.setTo( score / anchors );   
            } else Rating.setTo(0);
            
            Greenfoot.playSound("water_splash.wav");
            
            // Wait awhile for wave to propagate
            // and waste some key presses too :)
            sleepFor(45);

        } 
    }
}
