public class Main {

    public static void main(String[] args) {
	// Task4
        Bell bell = new Bell();


        Bill bill = new Bill();


        System.out.println("in the right pocket: ");
        RightPocket right = new RightPocket("right");
        right.setRingable(bell);
        right.print();

        System.out.println();
        System.out.println("In the left pocket: ");
        LeftPocket left = new LeftPocket("left");
        left.setPaperKind(bill);
        left.print();




    }
}
