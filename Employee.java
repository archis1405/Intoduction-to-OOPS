class Employee {
    private int salary; 
    // to store the salary of employee
    

    public String employeeName; 
    // to store the name of employee
    

    // Method to set the employee name as given input
    public void setName(String s) {
        employeeName = s;
    }
    
    // Method to set the salary as given input
    public void setSalary(int val) {
        salary = val;
    }
    
    // Method to get the salary of the employee
    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Archi");
        emp.setSalary(26000);
        
        System.out.println("Employee Name: " + emp.employeeName);
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
