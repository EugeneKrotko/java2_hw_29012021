package hw1.participants;

public class Human implements Participants {
    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Human() {this(5000, 2);}

    @Override
    public boolean run(int dist){
        if (dist <= maxRun){
            System.out.println("Кот пробежал " + dist + "метров");
            return true;
        } else {
            System.out.println("Кот не пробежал " + dist + "метра");
            return false;
        }
    }

    @Override
    public boolean jump(int dist){
        if (dist <= maxJump) {
            System.out.println("Человек перепрыгнул " + dist + "метра");
            return true;
        } else {
            System.out.println("Человек не перепрыгнул " + dist + "метра");
            return false;
        }

    }
}
