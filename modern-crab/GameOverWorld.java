// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld()
    {
        super(860, 860, 1);
        showTextWithBigRedFont("Game Over !!! ", 280, 450);
    }

    /**
     * 
     */
    public void showTextWithBigRedFont(String message, int x, int y)
    {
        GreenfootImage gov = getBackground();
        Font font =  new  Font(50);
        gov.setFont(font);
        gov.setColor(Color.RED);
        gov.drawString(message, x, y);
    }
}
