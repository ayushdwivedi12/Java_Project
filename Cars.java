import java.util.Scanner;
public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;
    @Override
    public void get_details(){
        System.out.println("NAME"+car_name);
        System.out.println("COLOR:"+car_color);
        System.out.println("Fuel type:"+car_fuel_type);
        System.out.println("Car Price:"+car_price);
        System.out.println("Car Type:"+car_type);
        System.out.println("Car Transmission:"+car_transmission);

    }
    @Override
    public void set_details(){
        Scanner in = new Scanner(System.in);
        System.out.println("==========ENTER CAR DETAILS========");
        System.out.println("CAR NAME:");
        car_name = in.nextLine();
        System.out.println("CAR COLOR");
        car_color = in.nextLine();
        System.out.println("CAR FUEL TYPE:");
        car_fuel_type = in.nextLine();
        System.out.println("CAR PRICE:");
        car_price = in.nextInt();
        System.out.println("CAR TYPE- SEDAN, SUV,NISSAN etc..");
        car_type = in.nextLine();
        System.out.println("CAR TRANSMISSION:");
        car_transmission = in.nextLine();
        total_cars_in_store++;

    }
}
