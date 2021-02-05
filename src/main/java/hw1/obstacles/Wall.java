package hw1.obstacles;

import hw1.participants.Participants;

public class Wall implements Obstacles {
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;

    }
    @Override
    public boolean doThat(Participants p) {
        return p.jump(heigth);
    }
}
