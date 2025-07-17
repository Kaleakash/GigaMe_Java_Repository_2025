import java.util.Scanner;

public class EmployeeArrayValues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employee records do you want to store?");
        int size = sc.nextInt();

        int ids[] = new int[size];
        String names[] = new String[size];
        float salaries[] = new float[size];
        String desg[] = new String[size];
        String skillSet[][] = new String[size][];  // jagged array for skill sets
        //int num[][]=new int[3][];
        /*	{1,2}
         * 	{3,4}
         * 	{5,6}
         */
        // input 
        System.out.println("Please enter records one by one:");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the ID:");
            ids[i] = sc.nextInt();

            System.out.println("Enter the name:");
            names[i] = sc.next();

            System.out.println("Enter the salary:");
            salaries[i] = sc.nextFloat();

            System.out.println("Enter the designation:");
            desg[i] = sc.next();

            System.out.println("How many skills do you know?");
            int skillSetSize = sc.nextInt();
            skillSet[i] = new String[skillSetSize]; // initialize inner array

            for (int j = 0; j < skillSetSize; j++) {
                System.out.println("Enter the technology name " + (j + 1) + ":");
                skillSet[i][j] = sc.next();
            }
        }

        // business logic: apply bonus based on designation
        for (int i = 0; i < size; i++) {
            if (desg[i].equalsIgnoreCase("Manager")) {
                salaries[i] += salaries[i] * 0.20f; // 20% bonus
            } else if (desg[i].equalsIgnoreCase("Developer")) {
                salaries[i] += salaries[i] * 0.15f; // 15% bonus
            } else {
                salaries[i] += salaries[i] * 0.10f; // 10% bonus
            }
        }

        // output
        System.out.println("\n=== Employee Details ===");
        for (int i = 0; i < size; i++) {
            System.out.println("ID: " + ids[i] +
                               ", Name: " + names[i] +
                               ", Salary: " + salaries[i] +
                               ", Designation: " + desg[i]);

            System.out.print("Skills: ");
            for (int j = 0; j < skillSet[i].length; j++) {
                System.out.print(skillSet[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
