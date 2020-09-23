public class RunRoad implements Barrier {

    int length;

    public RunRoad(int length){
        this.length = length;
    }
    public boolean passBarrier(Participant participant){
        if(participant.run()>length){
            System.out.println(participant + " успешно пробежал дистанцию " + length);
            return true;
        } else {
            System.out.println(participant + " не пробежал дистанцию " + length);
            return false;

        }
    }
}
