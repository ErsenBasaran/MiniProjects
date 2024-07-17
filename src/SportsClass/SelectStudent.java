/*
Proje: Let us code a program which chooses students for a sports class.

Lesson requirements:
    - Boys  :  Above 1.60 m height  , 70-90 kg
    - Girls :  Above 1.60 m height  , 50-70 kg

    The user will be asked to enter candidate number, names , heights and weights.
 */

package SportsClass;

import java.util.Scanner;

public class SelectStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, please fill in the form : ");
        System.out.print("Enter the candidate number : ");
        int numStd = scan.nextInt();

        String[] students = new String[numStd];
        String[] gender = new String[numStd];
        double[] height = new double[numStd];
        double[] weight = new double[numStd];

        boolean isSuccess = true;
        do {
            isSuccess=true;
            for (int i = 0; i < numStd; i++) {
                System.out.print("Name : ");
                students[i]=scan.next();

                System.out.print("Gender : ");
                String gen = scan.next().toUpperCase().substring(0,1);
                if (gen.equals("F") || gen.equals("M")){
                    gender[i] = gen;
                } else {
                    System.out.println("Incorrect entry...");
                    isSuccess=false;
                    break;
                }

                System.out.print("Height : ");
                height[i] = scan.nextDouble();

                System.out.print("Weight : ");
                weight[i] = scan.nextDouble();

            }
        }while (!isSuccess);

        int counter=0;
        System.out.println("*** List of Eligible Candidates ***");
        for (int i = 0; i < numStd; i++) {
            if (gender[i].equals("F")  && height[i]>1.50 && weight[i]>=50 && weight[i]<=70){
                System.out.println("Name : " + students[i] + " Gender :"+gender[i]+" Height :" + height[i] + " Weight : "+weight[i] );
                counter++;
            }else if (gender[i].equals("M")  && height[i]>1.60 && weight[i]>=70 && weight[i]<=90){
                System.out.println("Name : " + students[i] + " Gender :"+gender[i]+" Height :" + height[i] + " Weight : "+weight[i] );
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Unfotunately no students has requirements for the class...");
        }


    }
}
