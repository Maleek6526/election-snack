package CompoundInterstApp;

public class App {
    public static double calculateCompoundInterest(double principal, double rate, double time, int frequency) {
        if (time == 0) {
            return principal;
        }
        rate = rate / 100;
        return principal * Math.pow(1 + (rate / frequency), frequency * time);
    }
}
