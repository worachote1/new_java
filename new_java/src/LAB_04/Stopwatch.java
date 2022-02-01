package LAB_04;
import java.util.Calendar;
public class Stopwatch {
	
    private double startTime;
    private double endTime;
    
    Stopwatch(){
        this.startTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return Math.abs(endTime - startTime);
    }

    public double getStartTime(){
        return startTime;
    }

    public double getEndTime(){
        return endTime;
    }
}
