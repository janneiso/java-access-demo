package com.example.access.defaultchild;

import com.example.access.defaultaccess.DefaultAccess;

public class DefaultAccessChild extends DefaultAccess {
    String childMember = "Default Access Child Demo";

    void sometMethod() {
        super.member = "Default Access Child Demo";
    }
}
