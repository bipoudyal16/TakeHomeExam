public class Worker implements Observer_interface {

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
            System.out.println("Worker " + workerID + " working on WorkItem " + workItem.getItemID() + ". Message " + workItem.getMessage());
            int itemId = Integer.parseInt(workItem.getItemID()) +1;
            workItem.setItemID(Integer.toString(itemId));	
            
            return workItem;
        }
    }

}