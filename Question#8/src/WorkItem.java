public class WorkItem {
    private int itemId;
    private long workerID;
    private String message;

    public WorkItem(int itemId, long workerID, String message) {
        this.itemId = itemId;
        this.workerID = workerID;
        this.message = message;
    }

   

    public long getWorkerID() {
        return workerID;
    }

    public void setWorkerID(long workerID) {
        this.workerID = workerID;
    }

    public String getMessage() {
        return message;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}