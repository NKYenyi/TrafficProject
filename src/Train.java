public class Train {
    private String trainId;
    private int capacity;
    private TrainTerminal currentTerminal;

    public Train(String trainId, int capacity) {
            this.trainId = trainId;
            this.capacity = capacity;
        }

        public String getTrainId() {
            return trainId;
        }

        public int getCapacity() {
            return capacity;
        }

        public TrainTerminal getCurrentTerminal() {
            return currentTerminal;
        }

        public void setCurrentTerminal(TrainTerminal terminal) {
            this.currentTerminal = terminal;
        }

        @Override
        public String toString() {
            return "Train ID: " + trainId + ", Capacity: " + capacity;
        }
    }


