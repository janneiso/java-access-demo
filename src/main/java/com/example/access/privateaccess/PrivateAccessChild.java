package com.example.access.privateaccess;

public class PrivateAccessChild extends PrivateAccess{
    private String childMember = "Default Access Demo";

    void someMethod(){
        // cannot access super.member because it is private
       super.member = "Default Access Demo";
    }
}
