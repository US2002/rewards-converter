import java.lang.Math;

public class RewardValue {
    double input = 0;

    public RewardValue(double cashValue) {
        input = cashValue;
    }

    public RewardValue(int milevalue) {
        input = milevalue;
    }

    public double getCashValue() {
        double output = input * 0.0035;
        return output;
    }

    public int getMilesValue() {
        int output = (int) (input / 0.0035);
        return output;
    }
}
