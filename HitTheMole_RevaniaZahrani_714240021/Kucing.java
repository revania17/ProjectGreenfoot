import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kucing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kucing extends Actor
{
    /**
     * Act - do whatever the Kucing wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    public void act()
    {
        if (isTouching(Tikus2.class)){
            removeTouching(Tikus2.class);
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("SoundKucing.mp3");
            ((Level2) getWorld()).kehilanganNyawa();
            getWorld().addObject(new KucingNangis(),getX(),getY());
            getWorld().removeObject(this);
        }
        if(++timer >= 150){//2.5 detik
            getWorld().removeObject(this);
            return;
        }
    }
}
