import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tikus3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tikus3 extends Actor
{
    /**
     * Act - do whatever the Tikus3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("SoundScore.mp3");
            ((Level3) getWorld()).score += 1;
            getWorld().removeObject(this);
        }
        if(++timer >= 120){//2 detik
        getWorld().removeObject(this);
        return;
        }
    }
}
