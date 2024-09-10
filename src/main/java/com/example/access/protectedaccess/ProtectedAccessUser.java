package com.example.access.protectedaccess;

public class ProtectedAccessUser {
    void someMethod() {
        ProtectedAccess protectedAccess = new ProtectedAccess();
        // cannot modify member because PrivateAccessUser is is private
        protectedAccess.member = "Default Access Demo";
    }

}
