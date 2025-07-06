package Assignment.Assignment3;

public class Marathon {

    static void bestRunners(String names[], int times[]) {

        String bestrunner = names[0];
        int minTime = times[0];

        String secondbestRunner = names[0];
        int secondMinTime = times[0];

        int maxIndex = 1;
        int secondIndex = 1;

        for (maxIndex = 1; maxIndex < times.length; maxIndex++) {
            if (times[maxIndex] < minTime) {
                minTime = times[maxIndex];
                bestrunner = names[maxIndex];
            }
        }

        for (secondIndex = 1; secondIndex < times.length; secondIndex++) {
            if (secondIndex == maxIndex)
                continue;

            if (times[secondIndex] < minTime) {
                minTime = times[secondIndex];
                bestrunner = names[secondIndex];
            }
        }

        System.out.println("The best-runner is:" + bestrunner + " the mintime is:" + minTime);
        System.out.println("The secondbest-runner is:" + secondbestRunner + " the mintime is:" + secondMinTime);
    }

    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        bestRunners(names, times);
    }

}
