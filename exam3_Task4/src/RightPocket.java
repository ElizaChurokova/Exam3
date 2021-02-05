public class RightPocket extends AbstractPocket {

    public RightPocket(String side) {
        super(side);
    }
public void print(){
    System.out.println("Rings: " + ringable);
}

    private Ringable ringable;

    public Ringable getRingable() {
        return ringable;
    }

    public void setRingable(Ringable ringable) {
        this.ringable = ringable;
    }
}
