package com.estio.week3;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkingWithArrays
{
    public static void main(String[] args)
    {
        int[] myInts = new int[10];

        for(int i = 0 ; i < myInts.length ; i++ )
        {
            myInts[i] = 5 + i;
        }
        // complete this example and print off the values of the list

        int[] numbers = {54 ,25 , 11 ,10 ,5};
        // output original list

        // sort the list
//        Arrays.sort(numbers);
//        for(int i = 0; i<numbers.length ; i++)
//        {
//            System.out.print(numbers[i] + " ");
//        }
        // print out the reverse of the list.

//        int[][] twoD = new int[3][2];
//        System.out.println("\t - - - - - - - - - - -");
//        for(int x = 0; x < twoD.length ; x++)
//        {
//            for(int y = 0 ; y< twoD[x].length ; y++)
//            {
//                System.out.print("\t|" + x + " , " + y + "");
//            }
//            System.out.println();
//        }
//
        /**********************/
        // complete this table printing a table format

        arrayListActions();


    }

    public void arraysAtRuntime()
    {
        String[] names = {"Shelly"};
        Object[] objects = names;
        String[] namesAgain = (String[]) objects;
        System.out.println(namesAgain[0]);
        //objects[0] = new StringBuilder(); // This will create a runtime error.

        // Recreate this situation, fix this error and change Shelly
        // to Adam from namesagain Array and print out.

        Member[] members = new Member[1];
        members[0] = new Member("Will");

        System.out.println(members[0].getMembersName());

        Member newMember = new GoldMember("Billy");
    }


    public static void arrayListActions()
    {
        ArrayList<String> myNames = new ArrayList<>();
        if(myNames.remove("idris"))
        {

        }
        else
        {
            System.out.println("Name is not in the list");
        }

        myNames.add("Lou");

        System.out.println(myNames.size() + " and has got " + myNames);
        myNames.set(0, "Jordan");

        System.out.println(myNames.size() + " and has got " + myNames);
        myNames.add("Lou");

        // Checking to see if an item is the ArrayList
        System.out.println(myNames.contains("Lou"));
        System.out.println(myNames.contains("Matt"));

        String number1 = "500";
        Integer.parseInt(number1);

        ArrayList<Integer> nums = new ArrayList<Integer>();
    }
}



class Member
{
    private String MembersName;
    public Member(String MembersName)
    {
        this.MembersName = MembersName;
    }
    public String getMembersName()
    {
        return this.MembersName;
    }
}

class GoldMember extends Member
{
    public GoldMember(String membersName)
    {
        super(membersName);
    }
}

