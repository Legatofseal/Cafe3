package example.Meat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Queue;
import java.util.Timer;

/**
 * Created by Legat on 6/13/2016.
 */
public class Service {
    private String name;
    private long busyTime = 0;
    private long endOfAllTasks;
    private Queue<Task> taskQueue;

    public Queue<Task> getTaskQueue() {
        return taskQueue;
    }

    private boolean inBusy;

    public void setEndOfAllTasks(long endOfAllTasks) {
        this.endOfAllTasks = endOfAllTasks;
    }

    public long getBusyTime() {

        return endOfAllTasks - System.currentTimeMillis();
    }

    public void stopCurrentTask (){
        taskQueue.element().stopTask();
        taskQueue.poll();
    }
    public void setBusyTime(long busyTime) {
        this.busyTime += busyTime;
    }

    public Service(String name) {
        this.name = name;
        this.inBusy = false;
    }

}
