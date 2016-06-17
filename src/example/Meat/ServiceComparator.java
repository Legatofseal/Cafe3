package example.Meat;

import java.util.Comparator;

/**
 * Created by Legat on 6/14/2016.
 */
public class ServiceComparator implements Comparator<Service> {
    @Override
    public int compare(Service o1, Service o2) {
        if (o1.getBusyTime()<o2.getBusyTime()){
            return 1;
        }
        else if (o1.getBusyTime()>o2.getBusyTime()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
