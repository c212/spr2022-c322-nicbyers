
public class User extends Observable2 implements Observer2 {
	// we extend from Observable2 and implement the Observer2 interface we made
    Screen screen; // every user has a chat window
    String name; // every user has a name

    public String toString() {
        return this.name;
        // get name
    }

    public User(String name) {
        this.name = name;
        this.screen = new Screen(this);
        // Constructor
    }

    public void update(Observable2 thing, Object message) {
        //System.out.println(this.name + " hears " + thing.toString() + " saying " + message);
        screen.output.append(thing.toString() + ": " + message + "\n"); // updates with message
        screen.output.setCaretPosition(screen.output.getDocument().getLength());
        // This is what a User sees if a different User sends a message
    }
    public void broadcast(String message) {
        //System.out.println(this.name + " says: " + message);
        screen.output.append(name + "(You): " + message + "\n"); // updates current users chat
        screen.output.setCaretPosition(screen.output.getDocument().getLength());
        // This is what a User sees their our own message
        setChanged(); // alert observers that a change is occurring
        notifyObservers(message); // notify them of the message we sent
        clearChanged(); // clear any changes as we are now done
    }

}
