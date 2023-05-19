public class RewardValue {
    private final double input;
    public static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.input = cashValue;
    }

    public RewardValue(int mileValue) {
        this.input = convertToCash(mileValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / conversionRate);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * conversionRate;
    }

    public double getCashValue() {
        return input;
    }

    public int getMilesValue() {
        return convertToMiles(this.input);
    }
}