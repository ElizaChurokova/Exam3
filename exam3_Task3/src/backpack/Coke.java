package backpack;

public class Coke implements CylindricKind {
    @Override
    public void putCylindricKind(){
        System.out.println("coke is put");
    }
    @Override
    public String toString(){
        return "Coke";
    }

    private String type;

    public Coke(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
