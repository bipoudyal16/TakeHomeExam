public class Worker implements Observer {

    private long workerID;

    public Worker(long workerID) {
        this.workerID = workerID;
    }

    public long getWorkerID() {
        return workerID;
    }

    public void setWorkerID(long workerID) {
        this.workerID = workerID;
    }

    
    public WorkItem notify(WorkItem workItem) {
        if (workItem.getWorkerID() != workerID) {
            return null;
        } 
        else {
            System.out.println("Worker " + workerID + " working on WorkItem " + workItem.getItemId() + ". Message " + workItem.getMessage());
            workItem.setItemId(workItem.getItemId() + 1);
            return workItem;
        }
    }

}