package backpack;

public class Folder implements PlaneKind {
    @Override
    public void putPlaneKind(){
        System.out.println("folder is put");
    }
    @Override
    public String toString(){
        return "backpack.Folder";
    }

    private String type;

    public Folder(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
