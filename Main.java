import java.util.*;
import java.lang.*;
interface utility{
    public void get_details();
    public void set_details();
}
public class Main {
    static void main_menu() {
        System.out.println();
        System.out.println("========== ***** WELCOME TO SHOWROOM MANAGEMENT SYSTEM **** ============");
        System.out.println();
        System.out.println("====== ENTER YOUR CHOICE ======");
        System.out.println();
        System.out.println("1.) ADD SHOWROOM \t\t\t 2.) ADD EMPLOYEES \t\t\t 3.) ADD CARS");
        System.out.println();
        System.out.println("4.) GET SHOWROOM \t\t\t 5.) GET EMPLOYEES \t\t\t 6.) GET CARS ");
        System.out.println();
        System.out.println("===== ***** ENTER TO EXIT ***** ======");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Showroom[] showroom = new Showroom[5];
        Employees[] employees = new Employees[5];
        Cars[] car = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;
        while (choice != 0) {
            main_menu();
            choice = in.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1.)ADD SHOWROOM:");
                        System.out.println("9.)GO BACK TO MENU:");
                        choice = in.nextInt();
                        break;
                    case 2:
                        employees[employees_counter] = new Employees();
                        employees[employees_counter].set_details();
                        System.out.println("2.) ADD EMPLOYEE");
                        System.out.println("9.)GO BACK TO MENU");
                        choice = in.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new Cars();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("3.)ADD NEW CAR");
                        System.out.println("9.)GO BACK TO MAIN MENU");
                        choice = in.nextInt();
                        break;

                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.)GO BACK TO MAIN MENU");
                        System.out.println("0.)EXIT");
                        choice = in.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employees_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.)GO BACK TO MAIN MENU");
                        System.out.println("0.)EXIT");
                        choice = in.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.)GO BACK TO MAIN MENU");
                        System.out.println("0.)EXIT");
                        choice = in.nextInt();
                        break;


                }
            }


        }
    }
}