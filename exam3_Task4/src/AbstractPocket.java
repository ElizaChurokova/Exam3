public abstract class AbstractPocket {
    private String side;

    public AbstractPocket(String side) {
        this.side = side;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}
