package gasStation;

public class Pump {
    int pumpNo;
    int fuelCount;
    FuelTypes selectedFuel;

    public Pump(int pumpNo, int fuelCount, FuelTypes selectedFuel) {
        this.pumpNo = pumpNo;
        this.fuelCount = fuelCount;
        this.selectedFuel = selectedFuel;
    }

    public Pump(){

    }

    public int getPumpNo() {
        return pumpNo;
    }

    public void setPumpNo(int pumpNo) {
        this.pumpNo = pumpNo;
    }

    public int getFuelCount() {
        return fuelCount;
    }

    public void setFuelCount(int fuelCount) {
        this.fuelCount = fuelCount;
    }

    public FuelTypes getSelectedFuel() {
        return selectedFuel;
    }

    public void setSelectedFuel(FuelTypes selectedFuel) {
        this.selectedFuel = selectedFuel;
    }

    @Override
    public String toString() {
        return "Pump{" +
                "pumpNo=" + pumpNo +
                ", fuelCount=" + fuelCount +
                ", selectedFuel=" + selectedFuel +
                '}';
    }
}
