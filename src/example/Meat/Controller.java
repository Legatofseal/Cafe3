package example.Meat;

import java.util.*;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by Legat on 6/13/2016.
 */
public class Controller {
    ArrayList <Task> tasks;
    ArrayList <Service> services;
    Company company;
    private int ID=1;

    public Controller(ArrayList<Task> tasks, ArrayList<Service> services, Company company) {
        this.tasks = tasks;
        this.services = services;
        this.company = company;
    }

    public void setTaskForService (Employee employee, Dish dish){
        Task task = new Task(freeService(),employee,dish, ID);
        tasks.add(task);
        StopTask stopTask = new StopTask(ID);
        new Timer().schedule(stopTask,task.getDish().getComplexity());
        ID++;
    }
    public void stopTaskByID (int ID) {
        taskByID(ID).stopTask();
    }

    public Task taskByID (int ID){
        Task tempTask=null;
        for (int i=0; i<tasks.size(); i++){
            if (tasks.get(i).getID()==ID){
                tempTask=tasks.get(i);
            }
        }
        return tempTask;
    }

    public Service freeService (){
        Collections.sort(services,new ServiceComparator());
        return services.get(0);
    }//

    public class StopTask extends TimerTask {
        int ID;

        public StopTask(int ID) {
            this.ID = ID;
        }

        @Override
        public void run() {
            stopTaskByID(ID);

        }
    }
}
