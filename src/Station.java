import java.util.HashMap;
import java.util.Map;
//
// The Station has a list of bus and train terminals each matched up one for one with one another.
// It provides an iterator to iterate through teh list of pairings.
public class Station {
    private String stationName;
    private Queue<TerminalPair> terminals;

    public class TerminalPair {
        public BusTerminal bus;
        public TrainTerminal train;

        public TerminalPair( BusTerminal bt , TrainTerminal tt ) {
            bus = bt; train = tt;
        }
    }
    public Station( String name ) {
        stationName = name;
        terminals = new Queue<TerminalPair>();
    }

    public String getStationName() {
        return stationName;
    }

    public void addTerminalPair( BusTerminal bt, TrainTerminal tt ) {
        terminals.enqueue( new TerminalPair(bt,tt) );
    }

    public int getTerminalsCount() {
        return terminals.getLength();
    }
    public void initIteration() {
        terminals.initIteration();
    }

    public TerminalPair next() {
        return terminals.next();
    }
}



