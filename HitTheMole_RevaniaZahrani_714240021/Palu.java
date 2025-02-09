import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Palu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palu extends Actor
{
    /**
     * Act - do whatever the Palu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(null)) {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        setLocation(mouse.getX(), mouse.getY());
        }
    }
}
