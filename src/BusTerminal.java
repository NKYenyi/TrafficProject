public class BusTerminal {
    private String terminalId;
    private Queue<Commuter> waitingCommuters;
    private TrainTerminal connectedTrainTerminal;

    public BusTerminal(String terminalId) {
        this.terminalId = terminalId;
        this.waitingCommuters = new Queue<Commuter>();
    }

    public void setTrainTerminal(TrainTerminal trainTerminal) {
        this.connectedTrainTerminal = trainTerminal;
    }

    public Queue<Commuter> commuterList() {
        return waitingCommuters;
    }

    public TrainTerminal getTrainTerminal() {
        return connectedTrainTerminal;
    }

}
