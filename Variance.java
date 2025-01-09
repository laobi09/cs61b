public class Variance {
    /**
     * Calculate the variance of the input array
     * @param input Array of double values
     * @return Variance of the input array
     */
    public static double calculateVariance(double[] input) {
        double mean = calculateMean(input);
        double sumSquaredDiff = 0;

        for (double value : input) {
            sumSquaredDiff += Math.pow(value - mean, 2);
        }

        return sumSquaredDiff / input.length;
    }

    /**
     * Calculate the mean of the input array
     * @param input Array of double values
     * @return Mean of the input array
     */
    public static double calculateMean(double[] input) {
        double sum = 0;
        for (double value : input) {
            sum += value;
        }
        return sum / input.length;
    }
}
