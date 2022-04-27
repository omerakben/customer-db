
import com.github.javafaker.Faker;

public class CustomerDB {
    private final String id;
    private String firstName;
    private String lastName;
    private String address;
    private Double balance;
    public Faker faker = new Faker();

    public CustomerDB(String firstName, String lastName, String address){
        for (int i = 0; i < 50; i++) {
            firstName = faker.name().firstName();
            lastName = faker.name().lastName();
        }//end faker Full name
        this.id = RandomGenerator.generateId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.balance = RandomGenerator.generateBalance();


    }//end ctor

    // getters & setters
    public String getId(){
        return id;
    }
    public String getFirstName(){
         return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAddress (String address){
        this.address = address;
    }
    public Double getBalance(){
        return balance;
    }
    public void setBalance (Double balance){
        this.balance = balance;
    }//end getters & setters


}//end CustomerDB class

class RandomGenerator{
    public static String generateId() {
        String str = "abcdefghjklmnopqrstuvwxyz0123456789";
        String result = "";
        for (int i = 0; i < 8; i++) {
            int random = (int) (Math.random() * (str.length()) + 0);
            result += str.charAt(random);
        }
        return result.toUpperCase();
    }
    public static double generateBalance(){
        return (Math.random() * (1000 - 500) + 500);
    }

}//end RandomGenerator class
