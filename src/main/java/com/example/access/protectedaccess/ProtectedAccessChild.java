package com.example.access.protectedaccess;

public class ProtectedAccessChild extends ProtectedAccess {
    protected String childMember = "Default Access Demo";

    void someMethod(){
       super.member = "Default Access Demo";
    }
}
