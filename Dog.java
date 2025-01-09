/**
 * @author wubiyu
 * @version 1.1
 */
public class Dog {
    /**
     * Dog's weight in pounds.
     */
    public int weightInPounds;

    /**
     * Dog's name.
     */
    public String name;

    /**
     * Constructor to initialize dog's weight.
     * @param startingWeight Dog's initial weight.
     */
    public Dog(int startingWeight) {
        weightInPounds = startingWeight;
    }

    /**
     * Makes different noises based on dog's weight.
     */
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woof!");
        }
    }

    /**
     * Compares two dogs' weights and returns the heavier one.
     * @param d1 First dog.
     * @param d2 Second dog.
     * @return The heavier dog.
     */
    public static Dog maxDog(Dog d1, Dog d2) {
        return d1.weightInPounds > d2.weightInPounds ? d1 : d2;
    }

    /**
     * Finds dogs heavier than all four of their neighbors.
     * @param dogs Array of dogs.
     * @return Array of dogs that meet the condition.
     */
    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        Dog[] returnDogs = new Dog[dogs.length];
        int count = 0;
        for (int i = 0; i < dogs.length; i++) {
            boolean reject = false;

            // Check left neighbors
            if ((i > 0 && dogs[i].weightInPounds <= dogs[i-1].weightInPounds) ||
                (i > 1 && dogs[i].weightInPounds <= dogs[i-2].weightInPounds)) {
                reject = true;
            }

            // Check right neighbors
            if ((i < dogs.length - 1 && dogs[i].weightInPounds <= dogs[i+1].weightInPounds) ||
                (i < dogs.length - 2 && dogs[i].weightInPounds <= dogs[i+2].weightInPounds)) {
                reject = true;
            }

            // If at least two neighbors are checked and most neighbors are lighter, then select
            if (!reject) {
                returnDogs[count++] = dogs[i];
            }
        }
        return returnDogs;
    }
}
