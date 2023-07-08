/*
Raegan Schofield
June 28, 2023

Description:
------------
A simple grade calculator, using the standard marking components of a UVic CSC course; assignments, labs, midterms, and a final.
The user will be prompted to input the number of each components, the relevant weights, and the marks they got for it.

Note: 
-If the user did not have some of the components for their course, 0 is an acceptable input.
-If, when being requested to enter an int, the user enters a double, the double will be rounded down and turned into an int
-Your course work must add up to a total weight of 100%; if not, program will exit
-The calculator has been standardized to have equal weights within each component.
	example: you have 5 assignments with the total weight being 35%; that means each assignment will have a weight of 7%
-Program is able to quit at anytime by typing 'q' when prompted for user input

resources:
----------
https://stackoverflow.com/questions/12233489/how-to-loop-a-try-catch-statement
https://stackoverflow.com/questions/47852298/how-to-keep-looping-with-try-and-catch-to-get-correct-input

*/

 import java.util.*;


 public class GradeCalc{

    /*
    Function: main()
    Brief: Entry point for the program
    */
    public static void main(String[] args){
        System.out.println("\nSimple Grade Calculator:\n------------------------");
        System.out.println("Please input # of Assignments, Labs, Midterms, and Final (if applicable)");
        System.out.println("(type 'q' to quit program)\n");
        
        Scanner input = new Scanner(System.in);
        gradeProcessing(input);
    }

    /*
    Function: gradeProcessing()
    Parameters: Scanner input
    Brief: Used to prompt and store user input for assignments, labs, midterms, and finals. Calls upon function
           checkInput() to actually gather user input, and check its validity. Will print out final grade at the end
    Returns: nothing
    */ 
    public static void gradeProcessing(Scanner input){
        System.out.println("***(Expecting integer inputs. Will be rounded down if not an int)***");

        System.out.print("Number of Assignments? ===> ");
        int assign_num = (int)checkInput(input);
        System.out.print("Weight of Assignment(s)? ===> ");
        int assign_weight= (int)checkInput(input);

        System.out.print("Number of Labs? ===> ");
        int lab_num= (int)checkInput(input);
        System.out.print("Weight of Lab(s)? ===> ");
        int lab_weight= (int)checkInput(input);

        System.out.print("Number of Midterms? ===> ");
        int midterm_num= (int)checkInput(input);
        System.out.print("Weight of Midterm(s)? ===> ");
        int midterm_weight= (int)checkInput(input);

        System.out.print("Weight of Final? ===> ");
        int final_weight = (int)checkInput(input);

        int overall_weight = assign_weight+lab_weight+midterm_weight+final_weight;
        if (overall_weight!=100){
            System.out.println("\nWhoops! The weight of all your course work adds to ==> "+overall_weight);
            System.out.println("Please restart program and try again");
            System.exit(1);
        }

        System.out.println();
        System.out.println("***(int and float values vaild inputs)***");
        double assignment_total = getPercentage(assign_num, assign_weight, input, "Assignment");
        double lab_total = getPercentage(lab_num, lab_weight, input, "Lab");
        double midterm_total = getPercentage(midterm_num, midterm_weight, input, "Midterm");
        double final_mark = getPercentage(1, final_weight, input, "Finals");

        double offical_grade = assignment_total+lab_total+midterm_total+final_mark;
        System.out.printf("--------------------------\nFinal grade is ===> %.2f%%\n\n", offical_grade);

    }

    /*
    Function: checkInput()
    Parameters: Scanner input - to get the user info
    Brief: takes user input, and checks to see if it is a number (type doesn't matter). If it is, function returns 
           it. If not, function tells the user that their input is invalid, and to try again. If input is 'q', program
           will quit.
    Returns: double valid_num
    */
    public static double checkInput(Scanner input){
        double valid_num=0;
        String token;
        boolean checker = false;

        while(!checker){
            try{
                valid_num = input.nextDouble();
                checker = true;
                if(valid_num>100 || valid_num<0){
                    System.out.print("Whoops, not a valid input. Try Again\n===> ");
                    checker=false;
                }
            }catch (Exception e){
                token = input.nextLine();
                if(token.equals("q")){
                    System.out.println("Quiting program. Bye!!\n");
                    System.exit(0);
                } 
                System.out.print("Whoops, not a valid input. Try Again\n===> ");
            }
        }
        return valid_num;
    }

    /*
    Function: getPercentage()
    Parameters: double number - number of assign/labs/midterms
                double weight - weight of the corresponding assign/lab/midterm/final
                Scanner input - to get the user info
                String type - tells what component you are dealing with, and will be used to prompt user
    Brief: Based on component type, user will be prompted to input the mark they got for each part in the component.
           The total weight percentage will then be calculated, and returned. This function will call upon checkInput() to
           check the validity of the user input.
    Returns: final_weight
    */
    public static double getPercentage(double number, double weight, Scanner input, String type){
        double sum = 0;
        double mark;
        for(int i=1;i<=number;i++){
            if(number==1){
                System.out.print(type+" mark was ==> ");
                mark = checkInput(input);
                sum += mark;
            }else{
                System.out.print(type+ " "+i+" mark was ==> ");
                mark = checkInput(input);
                sum += mark;
            }
        }
        double final_weight = ((sum/number)/100)*weight;
        return final_weight;
    }
 }