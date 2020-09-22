package com.estio.oop;

public class Member
{
    private String memberName;

    public static int numberOfMembers = 1;


    private Member(String memberName)
    {
        this.memberName = memberName;
        numberOfMembers++;
    }

    public static Member makeMember(String newMemberName)
    {
        Member tempMember;
        if(numberOfMembers > 2)
        {
            tempMember = null;
            System.out.println("Too many members");
        }
        else
        {
            tempMember = new Member("newMemberName");
        }
        return tempMember;
    }

}
