
import java.util.ArrayList;

public class WorkManager implements users {

    private ArrayList<Worker> workersList = new ArrayList<Worker>();


    public void notify(WorkItem workItem) {
        

            for (Worker worker : workersList) {
                WorkItem result = worker.notify(workItem);
                if (result != null) {
                    System.out.println("worker "+worker.getWorkerID() + " work is all done: " + workItem.getItemID());
                }
            }
        
    }

    public void registerObserver(Worker Observer_interface) {
        workersList.add(Observer_interface);
    }
}