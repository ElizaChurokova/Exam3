import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Task2
        List<Person> person = new LinkedList<>();
        person.add(new Person("Stepan", "Stepanov", "Stepanovich"));
        person.add(new Person("Maksim", "Maksimov", "Maksimovich"));
        person.add(new Person("Stepan", "Stepanov", "Stepanovich"));

        try {
            for (int i = 0; i < person.size(); i++) {
                for (int j = 0; j < person.size(); j++) {
                    if (person.get(i).equals(person.get(j))) ;
                    throw new MyException();
                }
            }
            //catch(MyException) {
            //          System.out.println(MyException.getMessage())
            //}


            // person.add (5, new Person("Stepan", "Stepanov", "Stepanovich"));
//static void person (Object o) throws Excepton{
            //  if(person == person);
            //throw new Exception();
            //  }
            //    try {
//for(int i = 0; i<person.size(); i++){
            //        for (person: new Person) {
//                if (person == person) ;
//            throw new MyException();
//            }
//        }
//        catch (MyException e) {
//            System.out.println(e.getMessage());
//        }

    /*better to use
        Iterator it = person.iterator();
        try {
            while (it.hasNext()) {
                if ((Person) it.next() == person) {

                }
            }
        }
        catch (MyException e){
                System.out.println(e.getMessage());
            }

     */
            // }
//class MyException extends Exception{
            //      public String MyException (String message){
            //        super(message);
            //      @Override
            //            public String toString(){
            //      return super.toString();
            //}
            //}


            //private static void MyException() {
            //  public MyException()


        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

