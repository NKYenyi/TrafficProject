public class RoboBus {


    private static int maxcommuters = 50;
    private Commuter[] commuters = new Commuter[maxcommuters];

    private void loadCommuters(BusTerminal terminal){

        //go through max commuters on the bus
        for(int i = 0; i < maxcommuters; i++){
            //if someone is in the queue
            if (terminal.commuterList().next() != null) {
                //if there is not a commuter in that spot, add them to the bus
                if (commuters[i] == null) {
                    commuters[i] = terminal.commuterList().dequeue();
                }
            }
            //if there is nobody else waiting, end process
            else {return;}
        }
    }

    private void unloadCommuters(BusTerminal terminal, double currentTime){
        for(int i = 0; i < maxcommuters; i++){
            //if specific commuter gets off at this stop, unload them
            if (commuters[i] != null) {
                if (commuters[i].getDestination().equals(terminal)) {
                    terminal.commuterList().enqueue(commuters[i]);
                    commuters[i].endService(currentTime);
                    commuters[i] = null;
                }
            }
            //if no one else is on the bus, end process to save some time instead of checking empty seats
            else {return;}
        }
    }


}
