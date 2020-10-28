package com.estio.recap;

public class Student
{
    private String studentName;
    private int studentAge;

    static String headTeacher = "Mrs Nichols";

    public Student(String studentName, int studentAge)
    {
        this.studentAge = studentAge;
        this.studentName = studentName;
    }

    public static String getHeadTeacher()
    {
        return headTeacher;
    }

    public static void setHeadTeachersName(String newName)
    {
        headTeacher = newName;
    }

    /**
     * Output a message that will state the Students name and year group
     */
    public void describeStudent()
    {
        // to evaluate studentsAge and give an suitable year group
        if(studentAge >= 5 && studentAge <=8)
        {
            System.out.println(studentName + " is in Reception 1 + 2 ");
        }
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

    /******************************/

    public String getStudentsName()
    {
        return this.studentName;
    }

    public int getStudentAge()
    {
        return  this.studentAge;
    }

    public void setStudentAge(int newStudentAge)
    {
        if(newStudentAge > 3)
        {
            this.studentAge = newStudentAge;
        }
        else
        {
            this.studentAge = 4;
            System.out.println("A Student must be above 4 years old.");
        }
    }

}
