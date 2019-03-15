// I worked on the homework assignment alone, using only course materials.
/**
* This class represents a Cat class that extends the Animal class.
* @author Johnathan Radcliff
* @version 1.0
*/
public class Cat extends Animal {
    private int miceCaught;
    private boolean likesLasagna;

    /**
    * This constructor creates a Cat
    * @param name the name of the Cat
    * @param price the price of the Cat
    * @param mc an int amount of the mice caught
    * @param ll a boolean representing if the Cat likes lasagna
    */
    public Cat(String name, double price, int mc, boolean ll) {
        super(200, name, price);
        miceCaught = mc;
        likesLasagna = ll;
    }

    /**
    * This overloaded constructor creates a Cat from the other constructor
    * @param mc an int amount of the mice caught
    * @param ll a boolean representing if the Cat likes lasagna
    */
    public Cat(int mc, boolean ll) {
        this("none", 30.0, mc, ll);
    }

    /**
    * This method returns an int representing the comparative value of one Cat to another
    * @param o an Animal to be compared
    * @return an int, positive/negtive/zero, representing larger than/smaller than/equal to
    */
    public int compareTo(Animal o) {
        // if the animal is a cat
        if (o.getStoreID() == 200) {
            Cat c = (Cat) o;
            // if they are equal according to the Animal compare
            if (super.compareTo(c) == 0) {
                // compare mice caught
                if (this.miceCaught > c.getMiceCaught()) {
                    return 1;
                } else if (this.miceCaught < c.getMiceCaught()) {
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
    * This method returns the miceCaught of the Cat
    * @return the miceCaught of the Dog
    */
    public int getMiceCaught() {
        return miceCaught;
    }

    /**
    * This method returns the likesLasagna of the Cat
    * @return the likesLasagna of the Cat
    */
    public boolean getLikesLasagna() {
        return likesLasagna;
    }

    /**
    * This method sets the miceCaught of the Cat
    * @param mc the miceCaught of the Cat
    */
    public void setMiceCaught(int mc) {
        miceCaught = mc;
    }

    /**
    * This method sets the likesLasagna of the Cat
    * @param ll the likesLasagna of the Cat
    */
    public void setLikesLasagna(boolean ll) {
        likesLasagna = ll;
    }

    /**
    * This method returns a String representing the Cat
    * @return A String representing the Cat
    */
    public String toString() {
        return super.toString() + ", likesLasagna: " + likesLasagna + ", miceCaught: " + miceCaught;
    }
}