package com.estio.week2;

import com.estio.recap.Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class School
{
    private static ArrayList<Student> formGroup = new ArrayList<Student>();;
    // different ways to create variables

    School()
    {
        formGroup.add(new Student("Louise", 16));
        formGroup.add(new Student("James", 14));
        formGroup.add(new Student("Adam", 12));
        formGroup.add(new Student("Shelly", 14));
        formGroup.add(new Student("Dominic", 15));

        menu();
    }

    public static void main(String[] args)
    {
        new School();
    }

    public static void menu()
    {
        boolean isProgramEnded = false;
        Scanner userInput = new Scanner(System.in);

        int choice = 0;

        System.out.println("" +
                "What would you like to do\n" +
                "\tPress 1 to add a Student\n"+
                "\tPress 2 to print all Students data\n"+
                "\tPress 3 delete a Student from the Form ...\n"+
                "\t123 to quit"+
                "");

        try
        {
            choice = userInput.nextInt();
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Error option selected");
        }

        if(choice == 123)
        {
            // quit application
            System.exit(0);
        }
        else
        {
            enterUserInput:while(!isProgramEnded)
            {
                if(choice == 1)
                {
                    try
                    {
                        addStudent();
                    }
                    catch(InputMismatchException ex)
                    {
                        ex.printStackTrace();
                        System.out.println("Error in input");
                    }
                }
                else if (choice == 2)
                {
                    System.out.println("Print out all students details");

                    displayAllLearnerDetails();

                    menu();
                }
                else if (choice == 3)
                {
                    System.out.println("Remove a learner");

                    try
                    {
                        removeAStudent();
                    }
                    catch(InputMismatchException ex)
                    {
                        System.out.println("Please choose a valid input");
                    }
                    catch (ArrayIndexOutOfBoundsException ex)
                    {
                        System.out.println("Please choose a valid index");
                    }
                    catch (Exception ex)
                    {
                        System.out.println("Error");
                        ex.printStackTrace();
                    }

                    menu();
                }
                else
                {
                    System.out.println("Enter a valid choice");
                    menu();
                }
            }
        }
    }

    public static void addStudent()
    {
        Scanner userInput = new Scanner(System.in);
        // do what 1 does
        System.out.println("Add new Student..");
        // Add a student over here.

        System.out.println("Enter new students name, press enter to confirm");
        String newStudnetsName = userInput.nextLine();

        System.out.println("Enter new students age, press enter to confirm");
        int newStudentsAge = userInput.nextInt();

        Student s1 = new Student(newStudnetsName, newStudentsAge);

        // add new student to formGroup array
        formGroup.add(s1);

        System.out.println("Would you like to enter another? Y for yes N for No");
        Scanner userIn = new Scanner(System.in);
        String answer = userIn.nextLine();

        if(answer.toLowerCase().startsWith("y"))
        {
            addStudent();
            // add another student.
        }
        else
        {
            menu();
        }
    }

    public static void displayAllLearnerDetails()
    {
        String headTeacher = Student.getHeadTeacher();

        System.out.println();
        // loop around the formGroup and get users details
        for(Student tempStudent: formGroup)
        {
            if(tempStudent.getHeadTeacher() == headTeacher)
            {
                System.out.println(headTeacher);
            }
            else
            {
                System.out.println(tempStudent.getHeadTeacher());
            }

            String name = tempStudent.getStudentsName();
            int age = tempStudent.getStudentAge();

            System.out.println( name+ " Aged: " +age );
        }
    }

    public static void removeAStudent()
    {
        // display learner with an index.
        int index = 0;
        for (Student tempStudent: formGroup)
        {
            System.out.println(index++ + " : " +tempStudent.getStudentsName());
        }

        Scanner userChoice = new Scanner(System.in);
        // ask for the index they want to remove
        System.out.println("Please select the student you would like to remove by iundex");
        int choice = userChoice.nextInt();
        formGroup.remove(choice);

        displayAllLearnerDetails();

    }


}
