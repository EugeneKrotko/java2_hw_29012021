package hw1;

import hw1.obstacles.Obstacle;
import hw1.obstacles.Road;
import hw1.obstacles.Wall;
import hw1.participants.Cat;
import hw1.participants.Human;
import hw1.participants.Participants;
import hw1.participants.Robot;

public class Main {
    public static void main(String[] args) {
        Participants[] participants = {
                new Cat(),
                new Human(),
                new Robot(),
                new Cat(300,5)
        };

        Obstacle[] obstacles = {
                new Road(500),
                new Wall(1)
        };

        for (Participants p: participants){
            for (Obstacle o: obstacles){
                if(!o.doThat(p)){
                    break;
                };
            }
        }

    }
}
