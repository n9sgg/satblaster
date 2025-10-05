import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AnchorCounter here.
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class AnchorCounter extends Actor
{
 private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private static int target;
    private String prefix;
    
    public AnchorCounter()
    {
        this(new String());
    }

    /**
     * Create a new counter, initialised to 0.
     */
    public AnchorCounter(String prefix)
    {
        background = getImage();  // get image from class
        value = 0;
        target = 0;
        this.prefix = prefix;
        updateImage();
    }
    
    /**
     * Act - do whatever the TxCounter wants to do. 
     */
    public void act()
    {
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }  
    }
    /**
     * Add a new score to the current counter value.  This will animate
     * the counter over consecutive frames until it reaches the new value.
     */
    public static void add(int score)
    {
        target += score;
    }

    /**
     * Return the current counter value.
     */
    public static int getValue()
    {
        return target;
    }

    /**
     * Set a new counter value.  This will not animate the counter.
     */
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }
    
    /**
     * Sets a text prefix that should be displayed before
     * the counter value (e.g. "Score: ").
     */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    /**
     * Update the image on screen to show the current value.
     */
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
