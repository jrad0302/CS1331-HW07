// I worked on the homework assignment alone, using only course materials.
/**
* This class represents an Animal class, implementing the Comparable interface.
* @author Johnathan Radcliff
* @version 1.0
*/
public abstract class Animal implements Comparable<Animal> {

    private int storeId;
    private String name;
    private double price;

    /**
    * This constructor creates an Animal
    * @param si an int representing the storeId of the Animal
    * @param n the name of the Animal
    * @param p the price of the Animal
    */
    public Animal(int si, String n, double p) {
        storeId = si;
        name = n;
        price = p;
    }

    /**
    * This overloaded constructor calls the other
    * @param si an int representing the storeId of the Animal
    */
    public Animal(int si) {
        this(si, "Buzz", 222.00);
    }

    /**
    * This method returns the storeId of the Animal
    * @return the storeId of the Animal
    */
    public int getStoreId() {
        return storeId;
    }

    /**
    * This method returns the name of the Animal
    * @return the name of the Animal
    */
    public String getName() {
        return name;
    }

    /**
    * This method returns the price of the Animal
    * @return the price of the Animal
    */
    public double getPrice() {
        return price;
    }

    /**
    * This method sets the price of the Animal
    * @param p the price of the Animal
    */
    public void setPrice(int p) {
        price = p;
    }

    /**
    * This method sets the name of the Animal
    * @param n the name of the Animal
    */
    public void setName(String n) {
        name = n;
    }

    /**
    * This method sets the storeId of the Animal
    * @param si the storeId of the Animal
    */
    public void setStoreId(int si) {
        storeId = si;
    }

    /**
    * This method returns a String representing the Animal
    * @return A String representing the Animal
    */
    public String toString() {
        String pricef = String.format("%.2f", price);
        return "Store ID: " + storeId + ", Name: " + name + ", Price: " + pricef;
    }

    /**
    * This method returns an int representing the comparative value of one animal to another
    * @param o an Animal to be compared
    * @return an int, positive/negtive/zero, representing larger than/smaller than/equal to
    */
    public int compareTo(Animal o) {
        if (this.storeId > o.getStoreId()) {
            return 1;
        } else if (this.storeId < o.getStoreId()) {
            return -1;
        } else {
            // negative if this.name is alphabetically before, positive if after, zero if the same
            return this.name.compareTo(o.getName());
        }
    }
}