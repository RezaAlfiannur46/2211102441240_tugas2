import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Environments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Environments extends Props
{
    public void act()
    {
        int gravity = 10;
        int newY = this.getY()+2;
        this.setLocation(this.getX(), newY);
        
        if(newY >= this.getWorld().getHeight()-1){
            this.getWorld().removeObject(this);
        }
    }
}
