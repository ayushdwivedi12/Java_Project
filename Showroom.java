import java.util.Scanner;
public class Showroom implements utility{
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_store = 0;
    String manager_name;

    @Override
public void get_details(){
        System.out.println("Showroom name"+ showroom_name);
        System.out.println("Showroom address"+showroom_address);
        System.out.println("Manager name"+manager_name);
        System.out.println("Total Employees"+total_employees);
        System.out.println("Total Cars in Stock"+total_cars_in_store);

}
@Override
public void set_details(){
        Scanner in = new Scanner(System.in);
    System.out.println("==========ENTER SHOWROOM DETAILS========");
    System.out.println("Enter Showroom Details");
    System.out.println("Showroom name");
    showroom_name = in.nextLine();
    System.out.println("Showroom address");
    showroom_address = in.nextLine();
    System.out.println("Manager name");
    manager_name = in.nextLine();
    System.out.println("Total Employees");
    total_employees = in.nextInt();
    System.out.println("Total Cars in Stock");
    total_cars_in_store = in.nextInt();


}
}
