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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        new Wall(kw, 1, 0, Direction. WEST);
        new Wall(kw, 2, 0, Direction. WEST);
        new Wall(kw, 3, 0, Direction. WEST);
        new Wall(kw, 4, 0, Direction. WEST);
        new Wall(kw, 5, 0, Direction. WEST);
        new Wall(kw, 6, 0, Direction. WEST);
        new Wall(kw, 7, 0, Direction. WEST);
        new Wall(kw, 8, 0, Direction. WEST);
        new Wall(kw, 9, 0, Direction. WEST);
        new Wall(kw, 0, 0, Direction. WEST);
        
        new Wall(kw, 1, 1, Direction. EAST);
        new Wall(kw, 2, 1, Direction. EAST);
        new Wall(kw, 3, 1, Direction. EAST);
        new Wall(kw, 4, 1, Direction. EAST);
        new Wall(kw, 5, 1, Direction. EAST);
        new Wall(kw, 6, 1, Direction. EAST);
        new Wall(kw, 7, 1, Direction. EAST);
        new Wall(kw, 8, 1, Direction. EAST);
        new Wall(kw, 9, 1, Direction. EAST);
        new Wall(kw, 0, 1, Direction. EAST);
        
        new Wall(kw, 0, 2, Direction. EAST);
        new Wall(kw, 1, 3, Direction. NORTH);
        new Wall(kw, 1, 4, Direction. NORTH);
        new Wall(kw, 1, 5, Direction. NORTH);
        new Wall(kw, 1, 6, Direction. NORTH);
        new Wall(kw, 1, 6, Direction. EAST);
        new Wall(kw, 2, 6, Direction. EAST);
        new Wall(kw, 2, 3, Direction. SOUTH);
        new Wall(kw, 2, 4, Direction. SOUTH);
        new Wall(kw, 2, 5, Direction. SOUTH);
        new Wall(kw, 2, 6, Direction. SOUTH);
        new Wall(kw, 3, 2, Direction. EAST);
        new Wall(kw, 4, 3, Direction. SOUTH);
        new Wall(kw, 4, 4, Direction. SOUTH);
        new Wall(kw, 4, 5, Direction. SOUTH);
        new Wall(kw, 4, 5, Direction. EAST);
        new Wall(kw, 4, 3, Direction. NORTH);
        new Wall(kw, 4, 4, Direction. NORTH);
        new Wall(kw, 4, 5, Direction. NORTH);
        new Wall(kw, 5, 2, Direction. EAST);
        new Wall(kw, 6, 2, Direction. EAST);
        new Wall(kw, 7, 3, Direction. NORTH);
        new Wall(kw, 7, 4, Direction. NORTH);
        new Wall(kw, 7, 5, Direction. NORTH);
        new Wall(kw, 7, 6, Direction. NORTH);
        new Wall(kw, 7, 7, Direction. NORTH);
        new Wall(kw, 7, 7, Direction. EAST);
        new Wall(kw, 8, 3, Direction. SOUTH);
        new Wall(kw, 8, 4, Direction. SOUTH);
        new Wall(kw, 8, 5, Direction. SOUTH);
        new Wall(kw, 8, 6, Direction. SOUTH);
        new Wall(kw, 8, 7, Direction. SOUTH);
        new Wall(kw, 8, 7, Direction. EAST);
        
        new Wall(kw, 9, 2, Direction. EAST);
        new Wall(kw, 9, 2, Direction. SOUTH);
        
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 6);
        new Thing(kw, 4, 2);
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 4);
        new Thing(kw, 7, 2);
        new Thing(kw, 7, 3);
        new Thing(kw, 8, 3);  //1.want him to pick thing that isn't on street
        new Thing(kw, 8, 4);   //2.search for opening in driveway
                                //turn left, move until wall, turn right, move until wall, turn right, move until wall,turn left back to south on street
        new Thing(kw, 8, 6);   //3. search driveway for snow, bring it back to sidewalk
        new Thing(kw, 7, 7);   //4. tina pulls snow from sidewalk to end of sidewalk
        
        Robot karel = new Robot(kw, 0, 2, Direction. SOUTH);
        Robot tina = new Robot(kw, 0, 2, Direction. SOUTH);
       
                while(true){
                if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
                if(karel.frontIsClear() && karel.getAvenue()==2 && karel.getDirection()==Direction.SOUTH){ //while front is clear and on street,
                   //DRIVEWAY FINDER 
                  karel.move();
                  karel.turnLeft();
                  }
                //if driveway not clear
                if (!karel.frontIsClear() && karel.getAvenue()==2 && karel.getDirection()==Direction.EAST){
                    //turn back
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                }
                  if (karel.frontIsClear() && karel.getDirection()==Direction.EAST){
                      if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
                      karel.move();
                      if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
                  }else if (!karel.frontIsClear() && karel.getDirection()==Direction.EAST && karel.getAvenue()==2 == false){
                  if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
                  karel.turnLeft();  //1ST TURN: TURN RIGHT
                  karel.turnLeft();
                  karel.turnLeft();
                  if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
                  }
                if (karel.frontIsClear() && karel.getDirection()==Direction.SOUTH && karel.getAvenue()==2 == false){
                      if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
                    karel.move();
                    if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
                }else if (!karel.frontIsClear() && karel.getDirection()==Direction.SOUTH && karel.getAvenue()==2 == false){
                 if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
    
                  karel.turnLeft();  //2ND TURN: TURN RIGHT
                  karel.turnLeft();
                  karel.turnLeft();   
                  if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
                }
                
                if (karel.frontIsClear() && karel.getDirection()==Direction.WEST && karel.getAvenue()==2 == false){
                    if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
                    karel.move();
                    if (karel.canPickThing() && karel.getAvenue()==2==false ){ //asks if karel can pick thing not on sidewalk
                    karel.pickThing();
                }
                  }else if (!karel.frontIsClear() && karel.getDirection()==Direction.WEST ){
                   
                 karel.turnLeft(); //3RD TURN: TURN LEFT BACK ONTO STREET
                 karel.putThing();
                  }
                while (!karel.frontIsClear() && karel.getDirection()==Direction.SOUTH && karel.getAvenue()==2){
                if (tina.frontIsClear()){
                    
                     if (tina.canPickThing()){
                         tina.pickThing();
                     }    
                     tina.move();
                     if (tina.canPickThing()){
                         tina.pickThing();
                     }
                     }
                       if (!tina.frontIsClear() && tina.countThingsInBackpack()>0 ){
                   tina.putThing(); 
                   break;
                     }
                 
                           
                  
              }
                 }
    }
}
    


