package hw1.obstacles;

import hw1.participants.Participants;

public class Road implements Obstacle{
    private int dist;

    public Road(int dist) {
        this.dist = dist;

    }
    @Override
    public boolean doThat(Participants p) {
        return p.run(dist);
    }
}
