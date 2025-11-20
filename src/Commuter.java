public class Commuter {


    private int id;
    private double arrivalTime;
    private double startServiceTime;
    private double endServiceTime;
    private String state;



    public Commuter(int id, double arrivalTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.state = "WAITING";
    }





    public void startService(double currentTime) {
        this.startServiceTime = currentTime;
        this.state = "RIDING";
    }


    public void endService(double currentTime) {
        this.endServiceTime = currentTime;
        this.state = "DONE";
    }


    public double getWaitTime() {
        return startServiceTime - arrivalTime;
    }


    public double getTotalTime() {
        return endServiceTime - arrivalTime;
    }

    public String getState() {
        return state;
    }


    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Commuter " + id +
                " - State: " + state +
                ", Wait: " + getWaitTime() +
                ", Total: " + getTotalTime();
    }
}
