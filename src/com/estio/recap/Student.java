package com.estio.recap;

public class Student
{
    private String studentName;
    private int studentAge;

    public Student(String studentName, int studentAge)
    {
        this.studentAge = studentAge;
        this.studentName = studentName;
    }

    /**
     * Output a message that will state the Students name and year group
     */
    public void describeStudent()
    {
        // to evaluate studentsAge and give an suitable year group
        if(studentAge > 6 && studentAge <=8)
        {
            System.out.println(studentName + " is in Reception 1 + 2 ");
        }
/*        else if()
        {

        }*/

    }


    public void setStudentName(String studentName)
    {
        // make sure a valid name has been given
        if(studentName == "")
        {
            studentName = "Unnamed";
            System.out.println("You must enter a valid name");
        }
        else
        {
            this.studentName = studentName;
        }
    }

}
