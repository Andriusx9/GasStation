package gasStation;

public class FuelTypes {
    String fuelType;
    double fuelPrice;

    public FuelTypes(String fuelType, double fuelPrice) {
        this.fuelType = fuelType;
        this.fuelPrice = fuelPrice;
    }

    public FuelTypes(){}

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    @Override
    public String toString() {
        return "FuelTypes{" +
                "fuelType='" + fuelType + '\'' +
                ", fuelPrice=" + fuelPrice +
                '}';
    }
}
