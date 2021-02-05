package backpack;

public class BackpackThree extends AbstractBackpack {
    public BackpackThree(CircleKind circleKind, PlaneKind planeKind, CylindricKind cylindricKind) {
        super(circleKind, planeKind, cylindricKind);
    }

    public BackpackThree() {

    }

    @Override
    public void put() {
        System.out.println("Backpack number three contains 10 apples, 3 tennis ball, a folder and a bottle of coke");
    }

    @Override
    public String toString() {
        return "Full";


//    @Override
//    public void putCircleKind(){
//        System.out.println("10 apples and 3 tennis balls are put");
//    }
//    @Override
//    public void putPlaneKind(){
//        System.out.println("a folder is put");
//    }
//    @Override
//    public void putCylindricKind(){
//        System.out.println("one Cola is put");
//    }
//
//    public BackpackThree(String owner, String color) {
//        super(owner, color);
//    }
    }
}
