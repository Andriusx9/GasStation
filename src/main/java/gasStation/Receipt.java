package gasStation;

public class Receipt {
    FuelTypes fuelTypesFill = new FuelTypes();
    int fuelCount;

    public Receipt(FuelTypes fuelTypesFill, int fuelCount) {
        this.fuelTypesFill = fuelTypesFill;
        this.fuelCount = fuelCount;
    }

    public Receipt(){

    }

    public FuelTypes getFuelTypesFill() {
        return fuelTypesFill;
    }

    public void setFuelTypesFill(FuelTypes fuelTypesFill) {
        this.fuelTypesFill = fuelTypesFill;
    }

    public int getFuelCount() {
        return fuelCount;
    }

    public void setFuelCount(int fuelCount) {
        this.fuelCount = fuelCount;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "fuelTypesFill=" + fuelTypesFill +
                ", fuelCount=" + fuelCount +
                '}';
    }
}
