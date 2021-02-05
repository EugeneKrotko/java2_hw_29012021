package hw1.participants;

public class Robot implements Participants{
    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robot(){this(5000, 5);}

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
            System.out.println("Робот перепрыгнул " + dist + "метра");
            return true;
        } else {
            System.out.println("Робот не перепрыгнул " + dist + "метра");
            return false;
        }

    }
}
