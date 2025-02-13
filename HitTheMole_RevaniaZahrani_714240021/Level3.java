import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public int level;
    public int score = 0;
    private int NewTikus3Timer;
    private int NewTikusParasutTimer;
    private int NewKucing2Timer;
    private int NewBurungTimer;
    private int numTikus3;
    private int numTikusParasut;
    private int numKucing2;
    private int numBurung;
    public int numNyawa2 = 3;
    public Nyawa2 nyawa1,nyawa2,nyawa3; 
    public Palu palu;
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        numNyawa2 = 3;
        Palu palu = new Palu();
        addObject(palu,300,200);
        nyawa1 = new Nyawa2();
        addObject(nyawa1,170,36);
        nyawa2 = new Nyawa2();
        addObject(nyawa2,110,36);
        nyawa3 = new Nyawa2();
        addObject(nyawa3,50,36);
        Kupukupu3 kupukupu3 = new Kupukupu3();
        addObject(kupukupu3, 100, 200);
        KupukupuBalik3 kupukupubalik3 = new KupukupuBalik3();
        addObject(kupukupubalik3, 100, 150);
    }
    public void act()
    {
        runNewTikus3Timer();
        runNewTikusParasutTimer();
        runNewKucing2Timer();
        runNewBurungTimer();
        level = 3;
        showText("Hati-hati!",115,80);
        showText("Jangan terkena kucing",115,100);
        showText("dan juga burung!",115,120);
        if(score == 15){
            Greenfoot.playSound("SoundWin.mp3");
            Greenfoot.setWorld (new WinnerGame());
        }
        showText("Level"+level,115,140);
    }
    public void kehilanganNyawa2(){
        if(numNyawa2 == 3){
            removeObject(nyawa1);
        }
        else if (numNyawa2 == 2) {
            removeObject(nyawa2);
        }
        else if (numNyawa2 == 1) {
            removeObject(nyawa3);
            Greenfoot.setWorld (new GameOver());
            Greenfoot.playSound("SoundGameOver.mp3");
        }
        if (numNyawa2 > 0) { // numNyawa hanya berkurang jika masih ada nyawa
        numNyawa2--; // Mengurangi jumlah nyawa setiap kali metode ini dipanggil
        }
        }  
    private void runNewTikus3Timer()
    {
        NewTikus3Timer = (NewTikus3Timer+1)%100;
        if(NewTikus3Timer == 0) 
        {
        newTikus3();
        }   
    }
    private void runNewTikusParasutTimer()
    {
        NewTikusParasutTimer = (NewTikusParasutTimer+1)%100;
        if(NewTikusParasutTimer == 0) 
        {
        newTikusParasut();
        }   
    }
    private void runNewKucing2Timer()
    {
        NewKucing2Timer = (NewKucing2Timer+1)%200;
        if(NewKucing2Timer == 0) 
        {
        newKucing2();
        }
    }
    private void runNewBurungTimer()
    {
        NewBurungTimer = (NewBurungTimer+1)%200;
        if(NewBurungTimer == 0) 
        {
        newBurung();
        }
    }
    private void newTikus3(){
        int randNum = Greenfoot.getRandomNumber(7);
        if(randNum == 0){
            Tikus3 tikus = new Tikus3();
            addObject(new Tikus3(),78,290);
            numTikus3++;
        }
        else if (randNum == 1){
            Tikus3 tikus = new Tikus3();
            addObject(new Tikus3(),523,290);
            numTikus3++;
        }
        else if (randNum == 2){
            Tikus3 tikus = new Tikus3();
            addObject(new Tikus3(),223,290);
            numTikus3++;
        }
        else if (randNum == 3){
            Tikus3 tikus = new Tikus3();
            addObject(new Tikus3(),385,290);
            numTikus3++;
        }
        else if (randNum == 4){
            Tikus3 tikus = new Tikus3();
            addObject(new Tikus3(),295,355);
            numTikus3++;
        }
        else if (randNum == 5){
            Tikus3 tikus = new Tikus3();
            addObject(new Tikus3(),130,355);
            numTikus3++;
        }
        else if (randNum == 6){
            Tikus3 tikus = new Tikus3();
            addObject(new Tikus3(),450,355);
            numTikus3++;
        }
        showText("Score :"+score,115,160);
        }
    private void newTikusParasut(){
        int randNum = Greenfoot.getRandomNumber(5);
        if(randNum == 0){
            TikusParasut tikus = new TikusParasut();
            addObject(new TikusParasut(),350,80);
            numTikusParasut++;
        }
        else if (randNum == 1){
            TikusParasut tikus = new TikusParasut();
            addObject(new TikusParasut(),500,80);
            numTikusParasut++;
        }
        else if (randNum == 2){
            TikusParasut tikus = new TikusParasut();
            addObject(new TikusParasut(),270,180);
            numTikusParasut++;
        }
        else if (randNum == 3){
            TikusParasut tikus = new TikusParasut();
            addObject(new TikusParasut(),500,180);
            numTikusParasut++;
        }
        else if (randNum == 4){
            TikusParasut tikus = new TikusParasut();
            addObject(new TikusParasut(),360,180);
            numTikusParasut++;
        }
        showText("Score :"+score,115,160);
        }
    private void newKucing2(){
        int randNum = Greenfoot.getRandomNumber(7);
        if(randNum == 0){
            addObject(new Kucing2(),78,290);
            numKucing2++;
        }
        else if (randNum == 1){
            addObject(new Kucing2(),523,290);
            numKucing2++;
        }
        else if (randNum == 2){
            addObject(new Kucing2(),223,290);
            numKucing2++;
        }
        else if (randNum == 3){
            addObject(new Kucing2(),385,290);
            numKucing2++;
        }
        else if (randNum == 4){
            addObject(new Kucing2(),295,355);
            numKucing2++;
        }
        else if (randNum == 5){
            addObject(new Kucing2(),130,355);
            numKucing2++;
        }
        else if (randNum == 6){
            addObject(new Kucing2(),450,355);
            numKucing2++;
        }
    }
    private void newBurung(){
        int randNum = Greenfoot.getRandomNumber(5);
        if(randNum == 0){
            addObject(new Burung(),350,80);
            numBurung++;
        }
        else if (randNum == 1){
            addObject(new Burung(),500,80);
            numBurung++;
        }
        else if (randNum == 2){
            addObject(new Burung(),270,180);
            numBurung++;
        }
        else if (randNum == 3){
            addObject(new Burung(),500,180);
            numBurung++;
        }
        else if (randNum == 4){
            addObject(new Burung(),360,180);
            numBurung++;
        }
    }
}
