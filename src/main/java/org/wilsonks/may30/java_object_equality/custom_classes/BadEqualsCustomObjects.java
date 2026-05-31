package org.wilsonks.may30.java_object_equality.custom_classes;

import java.io.Serializable;

public class BadEqualsCustomObjects {
    public static void main(String[] args) {
        BadEmployee e1 = new BadEmployee("John", "Doe");

        System.out.println(e1 == e1);
        System.out.println(e1.equals(e1));

    }
}

class BadEmployee {
    private String firstName;
    private String lastName;
    public BadEmployee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }


}