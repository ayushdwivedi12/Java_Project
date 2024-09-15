import java.util.Scanner;
import java.util.UUID;
public class Employees extends Showroom implements utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    @Override
    public void get_details(){
        System.out.println("ID:"+emp_id);
        System.out.println("Name:"+emp_name);
        System.out.println("Age:"+emp_age);
        System.out.println("Employee Department:"+emp_department);
        System.out.println("ShowroomName:"+showroom_name);

    }
    @Override
    public void set_details(){
        Scanner in = new Scanner(System.in);
        System.out.println("==========ENTER EMPLOYEE DETAILS========");
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("ENTER EMPLOYEE DETAILS:");
        System.out.println("Employee Name:");
        emp_name = in.nextLine();
        System.out.println("Employee age:");
        emp_age = in.nextInt();
        in.nextLine();
        System.out.println("Employee Department:");
        emp_department = in.nextLine();
        System.out.println("Showroom name:");
        showroom_name = in.nextLine();
        
    }
}
