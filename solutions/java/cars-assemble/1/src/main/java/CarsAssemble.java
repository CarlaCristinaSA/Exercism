public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double taxa = speed * 221.0;
        if(speed  >= 1 && speed <= 4) {
                return taxa * 1.0;
        }
        else if (speed >= 5 && speed <= 8) {
            return taxa * 0.90;
        }
        else if (speed == 9) {
            return taxa * 0.80;
        } else {
            return taxa * 0.77;
        }
        
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed)/60);
    }
}
