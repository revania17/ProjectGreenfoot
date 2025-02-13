import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public int level;
    public int score = 0;
    private int NewTikus2Timer;
    private int NewKucingTimer;
    private int numTikus2;
    private int numKucing;
    public int numNyawa = 3;
    public Nyawa nyawa1,nyawa2,nyawa3; 
    public Palu palu;
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        numNyawa = 3;
        Palu palu = new Palu();
        addObject(palu,500,150);
        nyawa1 = new Nyawa();
        addObject(nyawa1,170,36);
        nyawa2 = new Nyawa();
        addObject(nyawa2,110,36);
        nyawa3 = new Nyawa();
        addObject(nyawa3,50,36);
        Kupukupu2 kupukupu2 = new Kupukupu2();
        addObject(kupukupu2, 100, 200);
        KupukupuBalik2 kupukupubalik2 = new KupukupuBalik2();
        addObject(kupukupubalik2, 100, 150);
    }
    public void act()
    {
        runNewTikus2Timer();
        runNewKucingTimer();
        level = 2;
        showText("Hati-hati!",115,80);
        showText("Jangan terkena kucing!",115,100);
        if(score == 10){
            Greenfoot.setWorld (new Level3());
        }
        showText("Level"+level,115,120);
    }
    public void kehilanganNyawa(){
        if(numNyawa == 3){
            removeObject(nyawa1);
        }
        else if (numNyawa == 2) {
            removeObject(nyawa2);
        }
        else if (numNyawa == 1) {
            removeObject(nyawa3);
            Greenfoot.setWorld (new GameOver());
            Greenfoot.playSound("SoundGameOver.mp3");
        }
        if (numNyawa > 0) { // Pastikan numNyawa hanya berkurang jika masih ada nyawa
        numNyawa--; // Mengurangi jumlah nyawa setiap kali metode ini dipanggil
        }
        }  
    private void runNewTikus2Timer()
    {
        NewTikus2Timer = (NewTikus2Timer+1)%100;
        if(NewTikus2Timer == 0) 
        {
        newTikus2();
        }   
    }
    private void runNewKucingTimer()
    {
        NewKucingTimer = (NewKucingTimer+1)%200;
        if(NewKucingTimer == 0) 
        {
        newKucing();
        }
    }
    private void newTikus2(){
        int randNum = Greenfoot.getRandomNumber(9);
        if(randNum == 0){
            Tikus2 tikus = new Tikus2();
            addObject(new Tikus2(),78,290);
            numTikus2++;
        }
        else if (randNum == 1){
            Tikus2 tikus = new Tikus2();
            addObject(new Tikus2(),523,290);
            numTikus2++;
        }
        else if (randNum == 2){
            Tikus2 tikus = new Tikus2();
            addObject(new Tikus2(),223,290);
            numTikus2++;
        }
        else if (randNum == 3){
            Tikus2 tikus = new Tikus2();
            addObject(new Tikus2(),385,290);
            numTikus2++;
        }
        else if (randNum == 4){
            Tikus2 tikus = new Tikus2();
            addObject(new Tikus2(),295,355);
            numTikus2++;
        }
        else if (randNum == 5){
            Tikus2 tikus = new Tikus2();
            addObject(new Tikus2(),130,355);
            numTikus2++;
        }
        else if (randNum == 6){
            Tikus2 tikus = new Tikus2();
            addObject(new Tikus2(),450,355);
            numTikus2++;
        }
        else if (randNum == 7){
            Tikus2 tikus = new Tikus2();
            addObject(new Tikus2(),135,220);
            numTikus2++;
        }
        else if (randNum == 8){
            Tikus2 tikus = new Tikus2();
            addObject(new Tikus2(),500,220);
            numTikus2++;
        }
        showText("Score :"+score,115,140);
        }
    private void newKucing(){
        int randNum = Greenfoot.getRandomNumber(9);
        if(randNum == 0){
            addObject(new Kucing(),78,290);
            numKucing++;
        }
        else if (randNum == 1){
            addObject(new Kucing(),523,290);
            numKucing++;
        }
        else if (randNum == 2){
            addObject(new Kucing(),223,290);
            numKucing++;
        }
        else if (randNum == 3){
            addObject(new Kucing(),385,290);
            numKucing++;
        }
        else if (randNum == 4){
            addObject(new Kucing(),295,355);
            numKucing++;
        }
        else if (randNum == 5){
            addObject(new Kucing(),130,355);
            numKucing++;
        }
        else if (randNum == 6){
            addObject(new Kucing(),450,355);
            numKucing++;
        }
        else if (randNum == 7){
            addObject(new Kucing(),135,220);
            numKucing++;
        }
        else if (randNum == 8){
            addObject(new Kucing(),500,220);
            numKucing++;
        }
    }
}
