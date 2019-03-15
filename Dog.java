// I worked on the homework assignment alone, using only course materials.
/**
* This class represents a Dog class that extends the Animal class.
* @author Johnathan Radcliff
* @version 1.0
*/
public class Dog extends Animal {
    private boolean curlyTail;
    private int droolRate;

    /**
    * This constructor creates a Dog
    * @param name the name of the Dog
    * @param price the price of the Dog
    * @param curlyTail a boolean representing if the Dog has a curly tail
    * @param droolRate the rate at which the Dog drools.
    */
    public Dog(String name, double price, boolean curlyTail, int droolRate) {
        super(100, name, price);
        this.curlyTail = curlyTail;
        this.droolRate = droolRate;
    }

    /**
    * This overloaded constructor creates a Dog from the other constructor
    * @param curlyTail a boolean representing if the Dog has a curly tail
    * @param droolRate the rate at which the Dog drools.
    */
    public Dog(boolean curlyTail, int droolRate) {
        this("none", 50.0, curlyTail, droolRate);
    }

    /**
    * This method returns the droolRate of the Dog
    * @return the droolRate of the Dog
    */
    public int getDroolRate() {
        return droolRate;
    }

    /**
    * This method sets the droolRate of the Dog
    * @param dr the droolRate of the Dog
    */
    public void setDroolRate(int dr) {
        droolRate = dr;
    }

    /**
    * This method returns the boolean curlyTail of the Dog
    * @return the boolean curlyTail of the Dog
    */
    public boolean getCurlyTail() {
        return curlyTail;
    }

    /**
    * This method sets the boolean curlyTail of the Dog
    * @param ct the boolean curlyTail of the Dog
    */
    public void setCurlyTail(boolean ct) {
        curlyTail = ct;
    }

    /**
    * This method returns an int representing the comparative value of one Dog to another
    * @param o an Animal to be compared
    * @return an int, positive/negtive/zero, representing larger than/smaller than/equal to
    */
    public int compareTo(Animal o) {
        // if the Animal is a Dog
        if (o.getStoreId() == 100) {
            Dog d = (Dog) o;
            // if they are equal according to the Animal compare
            if (super.compareTo(d) == 0) {
                // compare drool rates
                if (this.droolRate > d.getDroolRate()) {
                    return 1;
                } else if (this.droolRate < d.getDroolRate()) {
                    return -1;
                } else {
                    return 0;
                }
            // if they're not equal, reuse Animal compareTo
            } else {
                return super.compareTo(o);
            }
        } else {
            return super.compareTo(o);
        }
    }

    /**
    * This method returns a String representing the Dog
    * @return A String representing the Dog
    */
    public String toString() {
        return super.toString() + ", Curly Tail: " + curlyTail + ", Drool Rate: " + droolRate;
    }
}