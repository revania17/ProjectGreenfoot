import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurungNangis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurungNangis extends Actor
{
    /**
     * Act - do whatever the BurungNangis wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer;
    public void act()
    {
        if (++timer >= 30){//berada 0.5 detik dalam layar
            getWorld().removeObject(this);
            return;
        }
    }
}
