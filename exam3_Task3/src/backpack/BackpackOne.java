package backpack;

import java.util.ArrayList;

public class BackpackOne extends AbstractBackpack {

    public BackpackOne() {
        super();
    }

    @Override
    public void put(){
        System.out.println("Backpack number one contains 20 apples, 1 book and 1 coke");
    }
    @Override
    public String toString(){
        return "Full";
    }
//    @Override
//    public void put(){
//        System.out.println("Apples move: 20 apples are put");
//    }
//    @Override
//    public void putPlaneKind(){
//        System.out.println("a book is put");
//    }
//    @Override
//    public void putCylindricKind(){
//        System.out.println("one Cola is put");
//    }


    public BackpackOne(CircleKind circleKind, PlaneKind planeKind, CylindricKind cylindricKind) {
        super(circleKind, planeKind, cylindricKind);
    }
}



