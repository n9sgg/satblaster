import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyFishWorld here.
 * 
 * @author n9sgg
 * @version 1.0
 */
public class MyFishWorld extends World
{

    /**
     * Constructor for objects of class MyFishWorld.
     * 
     */
    public MyFishWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ColoredFish coloredFish = new ColoredFish();
        addObject(coloredFish,130,147);

        FishingBoat fishingBoat = new FishingBoat();
        addObject(fishingBoat,305,76);

        CrabFish crabFish = new CrabFish();
        addObject(crabFish,33,305);

        Dolphin dolphin = new Dolphin();
        addObject(dolphin,497,177);

        GirlFish girlFish = new GirlFish();
        addObject(girlFish,408,303);

        GreenFish greenFish = new GreenFish();
        addObject(greenFish,312,171);

        SeaHorse seaHorse = new SeaHorse();
        addObject(seaHorse,178,259);

        StarFish starFish = new StarFish();
        addObject(starFish,57,363);

        StarFish starFish2 = new StarFish();
        addObject(starFish2,189,366);

        StarFish starFish3 = new StarFish();
        addObject(starFish3,346,369);

        StarFish starFish4 = new StarFish();
        addObject(starFish4,508,370);

        Dolphin dolphin2 = new Dolphin();
        addObject(dolphin2,509,171);

        TotalCounter total = new TotalCounter("SCORE: ");
        addObject(total,522,24);

        ColoredFish coloredFish2 = new ColoredFish();
        addObject(coloredFish2,136,183);

        AnchorCounter anchorCounter = new AnchorCounter("Anchors: ");
        addObject(anchorCounter,300,21);

        GirlFish girlFish2 = new GirlFish();
        addObject(girlFish2,440,263);

        SeaHorse seaHorse2 = new SeaHorse();
        addObject(seaHorse2,195,279);

        GreenFish greenFish2 = new GreenFish();
        addObject(greenFish2,340,205);

        Rating rating = new Rating("Rating: ");
        addObject(rating,72,21);

        Logo logo = new Logo();
        addObject(logo,175,38);

    }
}
