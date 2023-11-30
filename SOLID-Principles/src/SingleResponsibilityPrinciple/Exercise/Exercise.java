package SingleResponsibilityPrinciple.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// public class App {
//     public static final int THRESHOLD = 5;

//     public static void main(String[] args) {

//         System.out.println("Welcome to the Application!");

//         Scanner scanner = new Scanner(System.in);

//         List<Integer> nums = new ArrayList<>();

//         System.out.println("Enter 5 valid integers in the range [0, 10]");

//         while(nums.size() < THRESHOLD) {

//             String s = scanner.nextLine();

//             try {
//                 Integer.parseInt(s);
//             } catch (NumberFormatException nfe) {
//                 System.out.println("Invalid! Try again!");
//                 continue;
//             }

//             int num = Integer.parseInt(s);

//             if(num<0 || num > 10) {
//                 System.out.println("Invalid range! Try again!");
//                 continue;
//             }

//             nums.add(num);
//         }

//         scanner.close();

//         Collections.sort(nums);

//         for(int num : nums)
//             System.out.print(num+" ");
//     }
// }


public class Exercise {
    public static final int THRESHOLD = 5;

    public static void main(String[] args) {

        System.out.println("Welcome to the Application!");

        // we get the inputs
        List<Integer> nums = getInputFromUser();

        // sort
        sort(nums);

        // we have do show the result
        show(nums);

    }

    private static void show(List<Integer> nums) {
        for(int num : nums)
            System.out.print(num+" ");
    }

    private static void sort(List<Integer> nums) {
        Collections.sort(nums);
    }

    private static List<Integer> getInputFromUser() {
        
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while(nums.size() < THRESHOLD) {
            String s = scanner.nextLine();
            if (isVaild(s))
                continue;
            nums.add(Integer.valueOf(s));
        }

        scanner.close();
        return nums;
    }

    private static boolean isVaild(String input){
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }

        if (num<0 || num > 10)
            return false;

        return true;
    }
}
