package hw1.participants;

public class Cat implements Participants {
    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Cat(){this(300, 3);}

    @Override
    public boolean run(int dist){
        if (dist <= maxRun){
            System.out.println("Кот пробежал " + dist + "метров");
            return true;
        } else {
            System.out.println("Кот не пробежал " + dist + "метров");
            return false;
        }
    }

    @Override
    public boolean jump(int dist){
        if (dist <= maxJump) {
            System.out.println("Кот перепрыгнул " + dist + "метра");
        } else {
            System.out.println("Кот не перепрыгнул " + dist + "метра");
            return false;
        }
        return false;
    }
}
