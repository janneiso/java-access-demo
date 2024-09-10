package com.example.access.protectedchild;

import com.example.access.protectedaccess.ProtectedAccess;

public class ProtectedAccessChild extends ProtectedAccess {
    protected String childMember = "Default Access Demo";

    void someMethod(){
       super.member = "Default Access Demo";
    }
}
