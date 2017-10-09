public class User extends Person{
    protected boolean isAdmin;

    public User(String firstName, String lastName, Boolean isAdmin) {
        super(firstName, lastName);
    }

//    public boolean isAdmin(){
//        if(Person != isAdmin){
//            System.out.println("not an Admin");
//        }else {
//            System.out.println("user is an Admin");
//        }
//            return true;
//    }

}
