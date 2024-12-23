public class Main {
    public static void main(String[] args) {
        User user = new User("Miusov M.V.");
        Address address = new Address("Ukraine", "Odessa", "Didrichsona", "8");
        user.setAddress(address);

        //user.setAddress("Ukraine", "Odessa", "Didrichsona", "8"); //using overloaded method

        System.out.println("User: " + user.getName());
        System.out.println("Address: " + user.getAddress());
    }
}
