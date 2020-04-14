public class WorkItem {
    private String itemId;
    private long workerID;
    private String message;

    public WorkItem(String itemId, long workerID, String message) {
        this.itemId = itemId;
        this.workerID = workerID;
        this.message = message;
    }
  
    public String getItemID() { 
    	return itemId; 
   	}
	public void setItemID(String itemID) { 
		this.itemId = itemID; 
	}
	
	public long getWorkerID() { 
		return workerID; 
	}
	
	public String getMessage() { 
		return message; 
	}

    }
    




