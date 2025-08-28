import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MySatWorld here.
 * 
 * @author n9sgg 
 * @version 0.99
 */
public class MySatWorld extends World
{

    /**
     * Constructor for objects of class MySatWorld.
     * 
     */
    public MySatWorld()
    {       
        super(1200, 800, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLUE);
        background.fill();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Satellite satellite = new Satellite();
        addObject(satellite,59,34);

        Rx rx = new Rx();
        addObject(rx,1150,750);

        Tx tx = new Tx();
        addObject(tx,50,750);

        TxWave txWave = new TxWave();
        addObject(txWave,50, 750);

        RxWave rxWave = new RxWave();
        addObject(rxWave,59,34);

    }
}
