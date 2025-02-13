import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public int level;
    public int score = 0;
    private int NewTikusTimer;
    private int numTikus;
    public int numNyawa;
    public Nyawa nyawa1,nyawa2,nyawa3; 
    public Palu palu;
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        numNyawa = 3;
        Palu palu = new Palu();
        addObject(palu,300,150);
        nyawa1 = new Nyawa();
        addObject(nyawa1,110,36);
        nyawa2 = new Nyawa();
        addObject(nyawa2,170,36);
        nyawa3 = new Nyawa();
        addObject(nyawa3,230,36);
        Kupukupu kupukupu = new Kupukupu();
        addObject(kupukupu, 100, 200);
        KupukupuBalik kupukupubalik = new KupukupuBalik();
        addObject(kupukupubalik, 100, 150);
        //setPaintOrder(Palu.class, Tikus.class);
    }
    public void act()
    {
        runNewTikusTimer();
        level = 1;
        if(score == 5){
            Greenfoot.setWorld (new Level2());
        }
        }
    private void runNewTikusTimer()
    {
        NewTikusTimer = (NewTikusTimer+1)%100;
        if(NewTikusTimer == 0) 
        {
        newTikus();
        }   
    }
    private void newTikus(){
        int randNum = Greenfoot.getRandomNumber(6);
        if(randNum == 0){
            Tikus tikus = new Tikus();
            addObject(new Tikus(),78,290);
            numTikus++;
        }
        else if (randNum == 1){
            Tikus tikus = new Tikus();
            addObject(new Tikus(),523,290);
            numTikus++;
        }
        else if (randNum == 2){
            Tikus tikus = new Tikus();
            addObject(new Tikus(),223,290);
            numTikus++;
        }
        else if (randNum == 3){
            Tikus tikus = new Tikus();
            addObject(new Tikus(),385,290);
            numTikus++;
        }
        else if (randNum == 4){
            Tikus tikus = new Tikus();
            addObject(new Tikus(),295,355);
            numTikus++;
        }
        else if (randNum == 5){
            Tikus tikus = new Tikus();
            addObject(new Tikus(),130,355);
            numTikus++;
        }
        else if (randNum == 6){
            Tikus tikus = new Tikus();
            addObject(new Tikus(),450,355);
            numTikus++;
        }
        showText("Score :"+score,200,120);
        }
}
