public class Wall implements Barrier {
    int height;

    public Wall(int height){
        this.height = height;
    }
    public boolean passBarrier(Participant participant){
        if(participant.jump()>height){
            System.out.println(participant + " успешно прыгнул на высоту " + height);
            return true;
        } else {
            System.out.println(participant + " не перепрыгнул стенку " + height);
            return false;

        }
    }
}
