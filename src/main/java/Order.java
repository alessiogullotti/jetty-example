public class Order {
   private String firstname;
   private String lastname;
   private String pizza;
    private String mytime;

    public Order(String firstname, String lastname, String pizza, String mytime) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pizza = pizza;
        this.mytime = mytime;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPizza() {
        return pizza;
    }

    public String getMytime() {
        return mytime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", pizza='" + pizza + '\'' +
                ", mytime='" + mytime + '\'' +
                '}';
    }
}
