import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burung extends Actor
{
    /**
     * Act - do whatever the Burung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    public void act()
    {
        if (isTouching(TikusParasut.class)){
            removeTouching(TikusParasut.class);
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("SoundBurung.mp3");
            ((Level3) getWorld()).kehilanganNyawa2();
            getWorld().addObject(new BurungNangis(),getX(),getY());
            getWorld().removeObject(this);
        }
        if(++timer >= 90){//1,5 detik
            getWorld().removeObject(this);
            return;
        }
    }
}
