package example.Meat;

import java.util.ArrayList;

/**
 * Created by Legat on 6/14/2016.
 */
public class Company {
    private String name;
    private ArrayList <Employee> employeeArrayList;

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }
}
