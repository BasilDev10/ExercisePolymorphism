public class Truck implements Vehicle{

    private String type;
    private int week;
    private final double weeklyRate = 500;

    public Truck(){

    }
    public Truck(String type, int week){
        this.type = type;
        this.week = week;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getWeek() {
        return week;
    }
    public void setWeek(int week) {
        this.week = week;
    }
    @Override
    public double calculateRentalCost() {
        return this.week * this.weeklyRate;
    }

    @Override
    public void displayDetails() {

        System.out.println("Truck type: "+type +"\nWeekly rate: $"+weeklyRate+"\nRental cost: $"+calculateRentalCost());
    }
}
