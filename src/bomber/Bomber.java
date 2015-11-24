/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomber;

import environment.ApplicationStarter;

/**
 *
 * @author WyattCampbell
 */
public class Bomber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run("Bomber!", new Jungle());
    }
    
}
