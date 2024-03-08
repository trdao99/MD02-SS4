package watch;

public class StopWatch {
    private  long startTime;
    private  long endTime;
    public StopWatch() {
        this.startTime=System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start() {
        this.startTime=System.currentTimeMillis();
    }
    public void end() {
        this.endTime=System.currentTimeMillis();
    }
    public long  getElapsedTime() {
        long elapsedTime = endTime-startTime;
        return elapsedTime;
    }

}
