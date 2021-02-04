package backpack;

public class TennisBalls implements CircleKind {
    @Override
    public void putCircleKind(){
        System.out.println("tennis balls are put");
    }

    @Override
    public String toString(){
        return "Tennis balls";
    }
}
