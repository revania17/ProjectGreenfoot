import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KupukupuBalik2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KupukupuBalik2 extends Actor
{   
    private int speed = 2; // Kecepatan terbang kupu-kupu
    
    /**
     * Act - do whatever the Kupukupu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Gerakkan kupu-kupu secara horizontal ke arah kiri
        move(-speed);
        
        // Jika mencapai tepi kiri layar, pindahkan ke tepi kanan
        if (getX() <= 0) {
            setLocation(getWorld().getWidth() - 2, getY());
        }
        
        // Jika mencapai tepi kanan layar, pindahkan ke tepi kiri
        if (getX() >= getWorld().getWidth() - 1) {
            setLocation(1, getY());
        }
    }
}
