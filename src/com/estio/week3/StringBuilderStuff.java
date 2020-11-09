package com.estio.week3;

import com.estio.recap.Student;

public class StringBuilderStuff
{
    public static void main(String[] args)
    {
        insertExamples();

    }


    public static void appeanExamples()
    {
        // With a string object
        String myString = new String("start");

        // explain why this does not effect the String
        myString.concat("+middle");
        myString.concat("+end");

        System.out.println("String:"+myString);

        // String Builder object
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");

        StringBuilder same = sb.append("+end");
        sb.append(">");
        same.append("<-|");

        System.out.println(sb);
        System.out.println(same);

        Student s1 = new Student("Josh", 31);
        Student s2 = s1;

        s2.setStudentAge(45);

        int x = 4;
        int y = x;
        y = 8;

        System.out.println("x="+x + " y =:"+y);

        System.out.println(s2.getStudentsName() == s1.getStudentsName());
    }

    public static void insertExamples()
    {
        StringBuilder sb = new StringBuilder("animals");

        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");

        System.out.println(sb);

        StringBuilder sbr = new StringBuilder("ABCDEF");
        sbr.delete(1, 3);
        // sbr.deleteCharAt(5);

        Object obj = new Object().toString();

        System.out.println(obj);

        String x = "hello";
        String y = "Hello".toLowerCase();

        System.out.println(x == y);


    }

    @Override
    public String toString()
    {
        return this.toString();
    }
}
