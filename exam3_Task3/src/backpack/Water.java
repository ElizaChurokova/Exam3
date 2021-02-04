package backpack;

public class Water implements CylindricKind {
 @Override
 public void putCylindricKind(){
     System.out.println("a bottle of water is put");
 }
 @Override
    public String toString(){
     return "Water";
 }
private String brand;

    public Water(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
