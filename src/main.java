import java.util.Random;

public class main {

    public static void main(String[] args) {

        Competition competition = prepare();
        competition.start();

        for (Participant winner : competition.getLastWinners()){
            System.out.println(winner);
        }

    }

    private static Competition prepare(){

        Participant cat = new Cat("Barsik",20,200);
        Participant human = new Human("Jack",10,150);
        Participant robot = new Robot("R2D2",5,1500);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(20));
        RunRoad road = new RunRoad(random.nextInt(1500));

        Competition competition = new Competition("Great");
        competition.setParticipants(human, cat, robot);
        competition.setBarriers(wall,road);

        return competition;



    }
}
