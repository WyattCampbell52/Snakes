/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomber;

import environment.Environment;
import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author WyattCampbell
 */
class Jungle extends Environment {

    Grid grid;
    Image soldier;
    Point point;
    Point snake;
    int x;
    int y;
    
    public Jungle() {
        
        grid = new Grid(54, 34, 15, 15, point = new Point(50,50), Color.black);
        soldier = ResourceTools.loadImageFromResource("bomber/Soldier Head.png");
        
    }

    @Override
    public void initializeEnvironment() {
        
    }

    int counter;
    
    @Override
    public void timerTaskHandler() {
//        System.out.println("#" + ++counter);
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
//        System.out.println("Key Event " + e.getKeyChar());
//        System.out.println("Key Event " + e.getKeyCode());
      
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x = x + 1;
            System.out.println("Right");
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x = x - 1;
            System.out.println("Left");
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y = y - 1;
            System.out.println("Up");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y = y + 1;
            System.out.println("Down");
        }  
        System.out.println(x);
        System.out.println(y);
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Released Up");
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Released Left");
        }else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Released Down");
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Released RIght");
        }
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        System.out.println("mouse clicked at " + e.getPoint());        
        System.out.println("In cell " + grid.getCellLocationFromSystemCoordinate(e.getPoint()));
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (grid != null) {
            grid.paintComponent(graphics);
        }
        if (soldier != null) {
            graphics.drawImage(soldier, grid.getColumns(), grid.getRows() , this);
        }
        
    }
    
}
