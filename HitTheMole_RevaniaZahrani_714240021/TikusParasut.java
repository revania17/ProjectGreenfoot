import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TikusParasut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TikusParasut extends Actor
{
    /**
     * Act - do whatever the TikusParasut wants to do. This method is called whenever
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
        if(++timer>= 90){//1,5 detik
            getWorld().removeObject(this);
            return;
        }
    }
}
