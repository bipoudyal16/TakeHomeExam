public class Main {

    public static void main(String[] args) {
       
        WorkManager publisher = new WorkManager();
        Worker subscribers1 = new Worker(1);
        Worker subscribers2 = new Worker(2);
        Worker subscribers3 = new Worker(3);
        Worker subscribers4 = new Worker(4);
        publisher.registerObserver(subscribers1);
        publisher.registerObserver(subscribers2);
        publisher.registerObserver(subscribers3);
        publisher.registerObserver(subscribers4);
        WorkItem item1 = new WorkItem("1", 1, "all done");
        publisher.notify(item1);
        WorkItem item3 = new WorkItem("2", 1, "this one is done");
        publisher.notify(item3);
        WorkItem item5 = new WorkItem("3", 3, "last numeber is done");
        publisher.notify(item5);

    }
}