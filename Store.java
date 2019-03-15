// I worked on the homework assignment alone, using only course materials.
/**
* This class represents a Store class that implements the StoreOrganizer class.
* @author Johnathan Radcliff
* @version 1.0
*/
public class Store implements StoreOrganizer {

    private Animal[] pets;
    private int count = 0;
    /**
    * This constructor creates a Store
    * @param numPets an integer representing the number of pets
    */
    public Store(int numPets) {
        pets = new Animal[numPets];
    }

    /**
     * This method when implemented will return all of the animals in the store
     * @return all of the pets in the store
     */
    public Animal[] getPets() {
        return this.pets;
    }

    /**
     * This method should allow a user to add an animal to their store inventory
     * @param a the animal to be added to the inventory
     */
    public void add(Animal a) {
        if (count < pets.length) {
            pets[count] = a;
            count++;
        }
    }

    /**
     * This method should sort through the pets using bubble sort
     */
    public void sort() {
        int len = pets.length;
        boolean swapped = false;
        do {
            swapped = false;
            // sets the unsorted boundaries
            for (int i = 0; i < len - 1; i++) {
                // actually looks at the values
                for (int s = 0; s < len - 1 - i; s++) {
                    // if the left is greater than the right
                    if (pets[s].compareTo(pets[s + 1]) > 0) {
                        // swap
                        Animal t = pets[s];
                        pets[s] = pets[s + 1];
                        pets[s + 1] = t;
                        // set swapped to true
                        swapped = true;
                    }
                }
            }
        } while (swapped);
    }

    /**
     * This method should search through the pets to look for a specific
     * animal. This should use the binary search method
     * @param a the animal to search through the list
     * @return the index the animal is found or -1 if the animal is not found
     */
    public int binarySearch(Animal a) {
        int end = getPets().length;
        int start = 0;
        while (start <= end) {
            int middle = (start + end) / 2;

            if (pets[middle] == a) {
                return middle;
            } else if (a.compareTo(pets[middle]) > 0) {
                start = middle + 1;
            } else if (a.compareTo(pets[middle]) < 0) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * This method should search through the pets to look for a specific
     * animal. This method should use the linear search method
     * @param a the animal to look for
     * @return the index the animal is found or -1 if the animal is not found
     */
    public int linearSearch(Animal a) {
        int len = getPets().length;

        for (int c = 0; c < len; c++) {
            if (pets[c] == a) {
                return c;
            }
        }

        return -1;
    }
}