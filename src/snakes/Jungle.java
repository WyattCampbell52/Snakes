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
    
    
    public Jungle() {
        
        grid = new Grid(1000, 1000, 10, 10, new Point(0,50), Color.black);
        
    }

    @Override
    public void initializeEnvironment() {
        
    }

    @Override
    public void timerTaskHandler() {
        
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        
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
    }
    
}
