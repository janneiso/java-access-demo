package com.example.access.defaultaccess;

public class DefaultAccessChild extends DefaultAccess {
    String childMember = "Default Access Child Demo";

    void sometMethod() {
        super.member = "Default Access Child Demo";
    }
}
