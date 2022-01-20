public class Chat {
    public static void main(String args[]) {
        User a = new User("Nick");
        User b = new User("Arpan");
        User c = new User("German");
        // create our users
        a.addObserver(b);
        a.addObserver(c);

        b.addObserver(a);
        b.addObserver(c);

        c.addObserver(a);
        c.addObserver(b);
        // make sure every user is Observing every other user

    }
}
