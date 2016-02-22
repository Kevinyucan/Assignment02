

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot victor = new Robot(kw, 0,0,Direction. EAST);
        new Wall(kw, 1, 1, Direction. NORTH);
        new Wall(kw, 1, 1, Direction. EAST);
        new Wall(kw, 1, 1, Direction. SOUTH);
        new Wall(kw, 1, 1, Direction. WEST);
        
        new Wall(kw, 1, 4, Direction. NORTH);
        new Wall(kw, 1, 4, Direction. EAST);
        new Wall(kw, 1, 4, Direction. SOUTH);
        new Wall(kw, 1, 4, Direction. WEST);
        
        new Wall(kw, 4, 1, Direction. NORTH);
        new Wall(kw, 4, 1, Direction. EAST);
        new Wall(kw, 4, 1, Direction. SOUTH);
        new Wall(kw, 4, 1, Direction. WEST);
        
        new Wall(kw, 4, 4, Direction. NORTH);
        new Wall(kw, 4, 4, Direction. EAST);
        new Wall(kw, 4, 4, Direction. SOUTH);
        new Wall(kw, 4, 4, Direction. WEST);
        
        new Wall(kw, 2, 2, Direction. NORTH);
        new Wall(kw, 2, 2, Direction. WEST);
        new Wall(kw, 2, 3, Direction. NORTH);
        new Wall(kw, 2, 3, Direction. EAST);
        new Wall(kw, 3, 2, Direction. WEST);
        new Wall(kw, 3, 2, Direction. SOUTH);
        new Wall(kw, 3, 3, Direction. EAST);
        new Wall(kw, 3, 3, Direction. SOUTH);
        
        
        do{
             victor.move();    
        victor.move();   
        victor.turnLeft();
        victor.turnLeft();
        victor.turnLeft();
        victor.move();
        victor.turnLeft();
        victor.move();
        victor.turnLeft();
        victor.move();
        victor.turnLeft();
        victor.turnLeft();
        victor.turnLeft();
        victor.move();
        victor.move();
        victor.turnLeft();
        victor.turnLeft();
        victor.turnLeft();
        
        
        }
        while(true);
       
    
}
}
