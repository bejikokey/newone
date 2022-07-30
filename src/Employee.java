public class Employee {
    private String fullName;
    private int department;
    public int salary;
    private int id;

    private static int counter = 1;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary + salary;
    }

    public void setDepartment(int department) {
        this.department = department + department;
    }

    public String toString() {
        return "Ф.И.О " + this.fullName + "," + " Номер отдела: " + this.department + ","
                + " Размер заработной платы: " + this.salary + "," + " Порядковый номер: " + this.id;

    }



}

