public class User {
    private String name;
    private Address address;

    public User(String name) {
        this.name = name;
        this.address = new Address();
    }

    public void setAddress(String country, String city, String street, String houseNumber){
        this.address = new Address(country, city, street, houseNumber);
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public String getAddress(){
        return address.toString();
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return String.format("User: %s | Address: %s", name, address);
    }
}
