import java.util.LinkedList;
import java.util.List;

public class Competition {

    private Barrier[] barriers;
    private Participant[] participants;
    private String title;

    private List<Participant> lastWinners = new LinkedList<>();

    public Competition(String title){
        this.title = title;
    }

    public void setBarriers(Barrier... barriers) {
        this.barriers = barriers;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public void start(){
        System.out.println("Мы начинаем " + title);
        lastWinners.clear();

        for (Participant participant:participants) {
            boolean success = passAllBarriers(participant);
            if(!success){
                System.out.println(participant + " сошел с дистанции");
            } else {
                lastWinners.add(participant);
            }

        }
    }
            public List<Participant> getLastWinners(){
                return lastWinners;
    }
    private boolean passAllBarriers(Participant participant){
        for (Barrier barrier : barriers) {
            if(!barrier.passBarrier(participant)){
                return false;
            }
            System.out.println();
        }
        return true;
    }

}
