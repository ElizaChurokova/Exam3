public class LeftPocket extends AbstractPocket {

    public LeftPocket(String side) {
        super(side);
    }

    private PaperKind paperKind;

    public void print(){
        System.out.println("PaperKind: " + paperKind);
    }

    public PaperKind getPaperKind() {
        return paperKind;
    }

    public void setPaperKind(PaperKind paperKind) {
        this.paperKind = paperKind;
    }
}
