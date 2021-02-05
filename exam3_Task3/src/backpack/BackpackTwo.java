package backpack;

public class BackpackTwo extends AbstractBackpack {

    public BackpackTwo() {

    }

    @Override
    public void put() {
        System.out.println("Backpack umber two contains 50 tennis balls, one folder and one bottle of water");
    }

    public BackpackTwo(CircleKind circleKind, PlaneKind planeKind, CylindricKind cylindricKind) {
        super(circleKind, planeKind, cylindricKind);
    }

    @Override
    public String toString() {
        return "Full";



//    @Override
//    public void putCircleKind(){
//        System.out.println("50 tennis balls are put");
//    }
//    @Override
//    public void putPlaneKind(){
//        System.out.println("a folder is put");
//    }
//    @Override
//    public void putCylindricKind(){
//        System.out.println("a battle of water is put");
//    }
//
//    public BackpackTwo(String owner, String color) {
//        super(owner, color);
    }
}
