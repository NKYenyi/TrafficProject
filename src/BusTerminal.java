public class BusTerminal {
    private String terminalId;
    private Queue<Commuter> waitingCommuters;
    private TrainTerminal connectedTrainTerminal;

    public BusTerminal(String terminalId) {
        this.terminalId = terminalId;
        this.waitingCommuters = new Queue<Commuter>();
    }

    public void setTrainTerminal(TrainTerminal trainTerminal) {

    }

}
