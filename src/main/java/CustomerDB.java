import com.github.javafaker.Faker;

public class CustomerDB {
    private final String id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private final int sSNumber;
    private Double balance;

    public CustomerDB(String id, String firstName, String lastName, String address, String phoneNumber,
                      int sSNumber, Double balance) {
        this.id = RandomGenerator.generateRandomId();
        this.firstName = RandomGenerator.generateRandomFirstName();
        this.lastName = RandomGenerator.generateRandomLastName();
        this.address = RandomGenerator.generateRandomAddress();
        this.phoneNumber = RandomGenerator.generateRandomPhone();
        this.sSNumber = sSNumber;
        this.balance = RandomGenerator.generateRandomBalance();
    }// end of constructor

    //getters & setters
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getsSNumber() {
        return sSNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }//end of getters & setters

    @Override
    public String toString() {
        return "Customer Data Base " +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", sSNumber=" + sSNumber +
                ", balance=" + balance +
                '}';
    }//end of toString()
}// end of class CustomerDB

class RandomGenerator{

    static Faker faker = new Faker();
    public static String generateRandomId(){
        String str = "abcdefghjklmnopqrstuvwxyz0123456789";
        String result = "";
        for (int i = 0; i < 8; i++) {
            int random = (int) (Math.random() * (str.length()) + 0);
            result += str.charAt(random);
        }
        return result.toUpperCase();

    }

    public static double generateRandomBalance(){
        return Math.random() * (1000 - 500) + 500;
    }

    public static String generateRandomFirstName(){
        return faker.name().firstName();
    }
    public static String generateRandomLastName(){
        return faker.name().lastName();
    }
    public static String generateRandomAddress(){
        return faker.address().fullAddress();
    }
    public static String generateRandomPhone(){
         return faker.phoneNumber().cellPhone();
    }


}//end of RandomGenerator class
