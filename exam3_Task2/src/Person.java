public class Person {
    private String name;
    private String sirname;
    private String patronomicName;

    public Person(String name, String sirname, String patronomicName) {
        this.name = name;
        this.sirname = sirname;
        this.patronomicName = patronomicName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirname() {
        return sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    public String getPatronomicName() {
        return patronomicName;
    }

    public void setPatronomicName(String patronomicName) {
        this.patronomicName = patronomicName;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof Person){
            Person person = (Person)obj;
            return person.getName().equals(this.getName()) &&
                    person.getSirname().equals(this.getSirname()) &&
                    person.getPatronomicName().equals(this.getPatronomicName());
            }
        return false;
    }
}
