package com.estio.oop;

public class StaticTest
{
    public static void main(String[] args)
    {
        Member member1 = Member.makeMember("Adam");
        Member member2 = Member.makeMember("Shelly");
        Member member3 = Member.makeMember("Tyler");

        System.out.println(member1.numberOfMembers);
        System.out.println(member2.numberOfMembers);
        System.out.println(member3.numberOfMembers);

    }
}
