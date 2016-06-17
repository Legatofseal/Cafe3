package example.Meat;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Legat on 6/13/2016.
 */
public class Task {
    private int ID;
    private Service service;
    private Employee employee;
    private Dish dish;
    private long startTime;
    private long endTime;
    private Timer timer;
    private boolean finished = false;

    public int getID() {
        return ID;
    }

    public Dish getDish() {
        return dish;

    }

    public Task(Service service, Employee employee, Dish dish, int ID) {
        this.service = service;
        this.employee = employee;

        this.dish = dish;
        this.ID = ID;

        startTime = System.currentTimeMillis();
        endTime = startTime + dish.getComplexity();



    }

    public void setFinished(boolean b) {
        this.finished = finished;
    }
    public void stopTask (){
        setFinished(true);
        service.getTaskQueue().poll();
       }



    public long getTimeToEndTask() {
    return endTime-System.currentTimeMillis();
    }

    //private Tim
}
