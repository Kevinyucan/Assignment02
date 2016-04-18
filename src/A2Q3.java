/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author yuk4142
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot victor = new Robot(kw, 8, 10, Direction.EAST);

        while (victor.getDirection() == Direction.NORTH == false && victor.getStreet() > 0) {

            victor.turnLeft();
        }
        while (victor.getDirection() == Direction.NORTH && victor.getStreet() > 0) {
            victor.move();
        }

        while (victor.getDirection() == Direction.WEST == false && victor.getAvenue() > 0) {
            victor.turnLeft();
        }
        while (victor.getDirection() == Direction.WEST && victor.getAvenue() > 0) {
            victor.move();
        }

    }
}
