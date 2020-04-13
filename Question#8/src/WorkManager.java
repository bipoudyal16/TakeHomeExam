
import java.util.ArrayList;

public class WorkManager implements Subject {

    private ArrayList<Worker> workersList = new ArrayList<Worker>();


    public void notify(WorkItem workItem) {
        

            for (Worker worker : workersList) {
                WorkItem result = worker.notify(workItem);
                if (result != null) {
                    System.out.println("worker "+worker.getWorkerID() + " work is all done: " + workItem.getItemId());
                }
            }
        
    }

    public void registerObserver(Worker observer) {
        workersList.add(observer);
    }
}