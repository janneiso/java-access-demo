package com.example.access.privateaccess;

public class PrivateAccessUser {
    void someMethod() {
        PrivateAccess privateAccess = new PrivateAccess();
        // cannot modify member because PrivateAccessUser is is private
        privateAccess.member = "Default Access Demo";
    }

}
