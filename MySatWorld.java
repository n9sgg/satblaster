import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author n9sgg 
 * @version 1.00
 */
public class MySatWorld extends World
{

    /**
     * Constructor for objects of class MySatWorld.
     * 
     */
    public MySatWorld()
    {       
        super(600, 400, 1);
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
        addObject(rx,560,350);

        Tx tx = new Tx();
        addObject(tx,60,350);

        TxCounter txCounter = new TxCounter("Score: ");
        addObject(txCounter,445,350);

        OrbitCounter orbitCounter = new OrbitCounter("Orbit: ");
        addObject(orbitCounter,175,350);

        TotalCounter total = new TotalCounter("Rating: ");
        addObject(total,310,380);

    }
}
