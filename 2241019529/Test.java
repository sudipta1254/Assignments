import java.util.*;
class Date {
    int day, month, year;
    void setDate(int day, int month, int year) {
        this.day = day;
        this.month =month;
        this.year = year;
    }
}
class Address extends Date {
    String address;
    void setAddress(String address) {
        // super(d, m, y);
        this.address = address;
    }
}
class Employe extends Address {
    String name, jobPosition, contactNumeber, address;
    int empId;
    double salary;
    int day, month, year;
    void setData(String name, String jobPosition, String contactNumber, int empId, double salary) {
        // super(a, d, m, y);
        this.name = name;
        this.jobPosition = jobPosition;
        this.contactNumeber = contactNumber;
        this.empId = empId;
        this.salary = salary;
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employe[] e = new Employe[2];
        for (int i = 0; i < e.length; i++) {
            System.out.println("Enter details");
            e[i] = new Employe();
            e[i].setAddress("Bhubaneshwar");
            e[i].setDate(i+1, i+2, i+2000);
            e[i].setData("A", "Manager", "912586974265", 1256+i, 57000+i);
        } sc.close();
        /*public static void arrangeEmployeeBySalary(Employe[] e) {
            
        }
        public static void getEmployeeByJobPosition(Employe[] e) {
            
        }
        public static void getEmployeeByHireDate(Employe[] e) {
            
        }
        public static void foreignEmployeeCount(Employe[] e) {
            
        }
        public static void getEmployeeBySalary(Employe[] e) {
            
        }*/
    }
}
