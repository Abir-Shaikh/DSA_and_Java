//nested switch

import java.util.Scanner;
public class nestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Abir Shaikh");
            case 2 -> System.out.println("Ayish Shaikh");
            case 3 -> {
                System.out.println("emp number 3 ");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department ");
                        break;
                    default:
                        System.out.println("No Department");
                }
            }
            default -> System.out.println("enter correct empID");
        }
    }
}
