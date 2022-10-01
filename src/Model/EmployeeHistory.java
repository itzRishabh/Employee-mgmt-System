/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author 91983
 */
public class EmployeeHistory {
    private ArrayList<Employee> history;
    public EmployeeHistory(){
        this.history= new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    public Employee addNewEmployee(){
        Employee  newEmployee = new Employee();
        history.add(newEmployee);
        return newEmployee;
    }

    public void deleteEmployees(Employee emp) {
        history.remove(emp);
    }
    
}
