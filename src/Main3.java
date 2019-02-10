import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {
        HashMap<User, Profile> usersProfiles = new HashMap<>();

        User user1 = new User("Adam", "Adam", 10, 1);
        User user2 = new User("Michał", "Michał", 20, 2);
        Profile profile1 = new Profile(5000, 123);
        Profile profile2 = new Profile(6000, 124);

        usersProfiles.put(user1, profile1);
        usersProfiles.put(user2, profile2);
        User testUser = new User("Adam", "Adam", 10, 1);
        if (usersProfiles.containsKey(testUser)) {
            System.out.println("DZIAŁA!");
        } else {
            System.out.println("NIE DZIAŁA!");
        }

    }
}
