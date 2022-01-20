import java.util.*;

public class Observable2 {

	// https://docs.oracle.com/javase/7/docs/api/java/util/Observable.html

    ArrayList<Observer2> observers = new ArrayList<Observer2>();
    // the ArrayList observers contains all of the Users currently observing this User
    
    public void addObserver(Observer2 observer){
        this.observers.add(observer);
        // this just adds an observer to our ArrayList
    }
    public void setChanged(){}; // used to indicate when changes start
    public void clearChanged(){}; // used to indicate when changes are done
    public void notifyObservers(Object message){
        for(Observer2 observer : this.observers){
            observer.update(this, message);
            // for each observer in the ArrayList, update them
        }
    }
}
