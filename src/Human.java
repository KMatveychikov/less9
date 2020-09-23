public class Human implements Participant {

    private String name;
    private int maxJumpHeight;
    private int maxRunRange;

    public Human(String name,int maxJumpHeight,int maxRunRange){
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunRange = maxRunRange;
    }

    @Override
    public int jump(){
        System.out.println("Человек "+ name + " прыгнул " + "на высоту " + maxJumpHeight);
        return maxJumpHeight;
    }
    @Override
    public int run(){
        System.out.println("Человек "+ name + " побежал " + "на расстояние " + maxRunRange);
        return maxJumpHeight;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "Человек " + name;
    }
}
