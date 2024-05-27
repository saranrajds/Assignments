<<<<<<< HEAD
package stackandqueue;

public class Job {
	
    private String name;
    private int processingTime;
    private int waitingTime;
    private int turnaroundTime;

    public Job(String name, int processingTime) {
        this.name = name;
        this.processingTime = processingTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }
    
    public String getName() {
        return name;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }
}
=======
package stackandqueue;

public class Job {
	
    private String name;
    private int processingTime;
    private int waitingTime;
    private int turnaroundTime;

    public Job(String name, int processingTime) {
        this.name = name;
        this.processingTime = processingTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }
    
    public String getName() {
        return name;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }
}
>>>>>>> 3610e59443eaa8a9a7e03cf305c60ba9ba85572f
