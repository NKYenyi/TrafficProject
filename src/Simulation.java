//
// The Simulation class manages the simulation data and runs the simuilation.
// It has a verbose output mode, turned ON by default, to track what is happening.

public class Simulation {

    // SIMULATION DATA
    Station station;
    int currentTime = 0;

    // SIMULATION PARAMETERS
    int intervalLength = 10;
    int duration = 100;
    boolean verbose = true;    // verbose output mode

    // TODO: data collected during simulation


    // In verbose mode, outputs to System.out.
    // File output could be provided by modifying this method.
    private void output(String str ) {
        if (verbose) {
            System.out.println( str );
        }
    }
    // Sets up all the simulation data, specifically the station and its lines.
    // May want names of data files to be parameters
    public void setup() {
        // for now, a temporary version for testing.
        output("Setting up the simulation");
        station = new Station("central");

        // add bus/terminal pairs to station

        // any other initializations

    }

    // set the interval, in simulated time units, that the simulation advances at each step
    public void setIntervalLength( int len ) {
       intervalLength = len;
    }

    public void setDuration( int dur ) {
        duration = dur;
    }

    public void setVerbose( boolean ver ) {
        verbose = ver;
    }
    public void run() {

        output("Starting simulation");

        while (currentTime <= duration) {
            output( String.format("Current time: %d", currentTime ));

            // UPDATE THE STATE OF THE SIMULATION


            // COLLECT ANY STATISTICS


            currentTime += intervalLength;
        }

        output(String.format("Simulation complete at simulated time %d", currentTime));

    }

    // Process the simulation data and output results
    public void process() {
        output("Processing results");

    }
}
