import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class right here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class right extends Actor
{
    /**
     * Act - do whatever the right wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkKeys() ;
    }    
    private void checkKeys() {
        //if(getOneIntersectingObject(grey.class) != null){
        if(Greenfoot.isKeyDown("left")){
            if(getObjectsAtOffset(-1, 0, grey.class).isEmpty()){
                setLocation(getX()-1,getY());Greenfoot.delay(5);
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getObjectsAtOffset(1, 0, grey.class).isEmpty()){
                setLocation(getX()+1,getY());Greenfoot.delay(5);
            }
        }
        if(Greenfoot.isKeyDown("up")){
            if(getObjectsAtOffset(0, -1, grey.class).isEmpty()){
                setLocation(getX(),getY()-1);Greenfoot.delay(5);
            }
        }
        if(Greenfoot.isKeyDown("down")){
            if(getObjectsAtOffset(0, 1, grey.class).isEmpty()){
                setLocation(getX(),getY()+1);Greenfoot.delay(5);
            }
        }
    }
        
    public right() 
    {
        GreenfootImage image = getImage();
        image.scale(15, 15);
        setImage(image);
        //removeTouching(Crab.class);
    }
}
