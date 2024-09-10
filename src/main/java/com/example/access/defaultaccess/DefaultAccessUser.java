package com.example.access.defaultaccess;

public class DefaultAccessUser {
    void someMethod() {
        DefaultAccess defaultAccess = new DefaultAccess();
        // can modify member because DefaultAccessUser is in the same package as DefaultAccess
        defaultAccess.member = "Default Access Demo";

    }

}
