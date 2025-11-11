import java.util.HashMap;
import java.util.Map;

public class Station {

                private String stationName;
                private Map<String, BusTerminal> busTerminals;
                private Map<String, TrainTerminal> trainTerminals;

                public Station(String stationName) {
                        this.stationName = stationName;
                        this.busTerminals = new HashMap<>();
                        this.trainTerminals = new HashMap<>();
                }

                public void addTerminalPair(String terminalId) {
                        BusTerminal busTerminal = new BusTerminal("Bus-" + terminalId);
                        TrainTerminal trainTerminal = new TrainTerminal("Train-" + terminalId);

                        busTerminal.setTrainTerminal(trainTerminal);

                        busTerminals.put(terminalId, busTerminal);
                        trainTerminals.put(terminalId, trainTerminal);

                        System.out.println("Created terminal pair: " + terminalId);
                }

                public BusTerminal getBusTerminal(String terminalId) {
                        return busTerminals.get(terminalId);
                }

                public TrainTerminal getTrainTerminal(String terminalId) {
                        return trainTerminals.get(terminalId);
                }






        }



