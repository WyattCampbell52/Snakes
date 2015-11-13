/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes;

import environment.Environment;
import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author WyattCampbell
 */
class Jungle extends Environment {

    Grid grid;
    Point point;
    Point snake;
    int x;
    int y;
    
    public Jungle() {
        
        grid = new Grid(32, 20, 25, 25, new Point(50,50), Color.black);
        
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
            y = x - 1;
            System.out.println("Up");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y = x + 1;
            System.out.println("Down");
        }  
        System.out.println(x);
        System.out.println(y);
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            System.out.println("Released Up");
        }else if (e.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("Released Left");
        }else if (e.getKeyCode() == KeyEvent.VK_S) {
            System.out.println("Released Down");
        }else if (e.getKeyCode() == KeyEvent.VK_D) {
            System.out.println("Released RIght");
        }
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        System.out.println("mouse clicked at " + e.getPoint());        
        System.out.println("In cell " + grid.getCellLocationFromSystemCoordinate( point = e.getPoint()));
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (grid != null) {
            grid.paintComponent(graphics);
        }
        
    }
    
}
