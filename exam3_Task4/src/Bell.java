public class Bell implements Ringable {
    @Override
    public void ring() {
        System.out.println("Bell is ringing");
    }

    @Override
    public String toString() {
        return "Bell - ding-dong";
    }
}
