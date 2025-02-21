import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tikus2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tikus2 extends Actor
{
    /**
     * Act - do whatever the Tikus2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("SoundScore.mp3");
            ((Level2) getWorld()).score += 1;
            getWorld().removeObject(this);
        }
        if(++timer >= 120){//2 detik
         getWorld().removeObject(this);
         return;
        }
    }
}
