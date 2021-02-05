package backpack;

public class Book implements PlaneKind {
    @Override
    public void putPlaneKind(){
        System.out.println("a book is put");
    }
    @Override
    public String toString(){
        return "backpack.Book";
    }

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
