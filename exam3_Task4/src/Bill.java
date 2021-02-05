public class Bill implements PaperKind{

    @Override
    public void likePaper(){
        System.out.println("no voice, its paper");
    }
    @Override
    public String toString(){
        return "Bill keeps silent";
    }
}
