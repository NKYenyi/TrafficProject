import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StationTest {

    @Test
    void getStationName() {
        Station st = new Station("downtown");
        assertTrue( st.getStationName().equals("downtown") );
    }

    @Test
    void addTerminalPair() {
        Station st = new Station("downtown");
        BusTerminal bt = new BusTerminal("bus");
        TrainTerminal tt = new TrainTerminal("bus");
        st.addTerminalPair( bt, tt );
        assertTrue( st.getTerminalsCount() == 1 );
    }

    @Test
    void iteration() {
        Station st = new Station("downtown");
        BusTerminal bt = new BusTerminal("bus");
        TrainTerminal tt = new TrainTerminal("bus");
        st.addTerminalPair( bt, tt );
        st.initIteration();
        Station.TerminalPair pair = st.next();
        assertTrue( pair.bus == bt && pair.train == tt );
    }
}