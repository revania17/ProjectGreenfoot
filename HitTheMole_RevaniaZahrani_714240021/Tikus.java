import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tikus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tikus extends Actor
{
    /**
     * Act - do whatever the Tikus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("SoundScore.mp3");
            ((Level1) getWorld()).score += 1;
            getWorld().removeObject(this);
        }
        if(++timer >= 180){//3 detik
        getWorld().removeObject(this);
        return;
        }
    }
}
