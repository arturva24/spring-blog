public class Person implements Greeter {
    protected String firstName;
    protected String lastName;

    public Person(String firstName,String lastName){
//        firstName = "Arturo";
//        lastName = "Valdez";

    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }


}
