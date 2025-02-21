import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kucing2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kucing2 extends Actor
{
    /**
     * Act - do whatever the Kucing2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    public void act()
    {
        if (isTouching(Tikus3.class)){
            removeTouching(Tikus3.class);
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("SoundKucing.mp3");
            ((Level3) getWorld()).kehilanganNyawa2();
            getWorld().addObject(new KucingNangis(),getX(),getY());
            getWorld().removeObject(this);
        }
        if(++timer >= 90){//1,5 detik
            getWorld().removeObject(this);
            return;
        }
    }
}
