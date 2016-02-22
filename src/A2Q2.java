/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author yuk4142
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot victor = new Robot(kw, 2, 1, Direction.EAST); 
        new Wall(kw, 2, 1, Direction. SOUTH);
        new Wall(kw, 2, 2, Direction. SOUTH);
        new Wall(kw, 2, 3, Direction. SOUTH);
        new Wall(kw, 2, 4, Direction. SOUTH);
        new Wall(kw, 2, 5, Direction. SOUTH);
        new Wall(kw, 2, 6, Direction. SOUTH);
        new Wall(kw, 2, 7, Direction. SOUTH);
        new Wall(kw, 2, 8, Direction. SOUTH);
        new Wall(kw, 2, 9, Direction. SOUTH);
        new Wall(kw, 2, 1,Direction. EAST);
        new Wall(kw, 2, 2,Direction. EAST);
        new Wall(kw, 2, 4,Direction. EAST);
        new Wall(kw, 2, 7,Direction. EAST);
        new Thing(kw,2,9);
        
       
        
        while (true){
            if (victor.canPickThing()){
                break;
            }
        if(victor.frontIsClear()){
                
            victor.move();
        }
        
        if (victor.frontIsClear()==false){
         victor.turnLeft();
         victor.move();
         victor.turnLeft();
         victor.turnLeft();
         victor.turnLeft();
         victor.move();
         victor.turnLeft();
         victor.turnLeft();
         victor.turnLeft();
         victor.move();
         victor.turnLeft();
       }
    }
    }
}

