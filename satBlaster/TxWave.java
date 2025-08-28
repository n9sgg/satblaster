import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TxWave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TxWave extends Actor
{
    
    private static int r = 0;
    private static int launch = 0;

    /**
     * Act - do whatever the TxWave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {       
        // Calculate wave radius
        if ( r > 2200) {
            r = 0;
        }
        else {
            r = r + 20; 
        }
        
        GreenfootImage image = new  GreenfootImage(r + 200 ,r + 200);
        image.setColor(Color.WHITE);
        // image.drawRect(0,0,r + 199,r + 199 );
        image.drawOval(0,0,r + 199,r + 199 );
        this.setImage(image);
        
    
    }
}    



