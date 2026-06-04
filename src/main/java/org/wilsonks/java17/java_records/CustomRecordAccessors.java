/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CustomRecordAccessors.java
 *  * Created On : 2026-06-03 13:09
 *  * Author     : Wilson K Sam
 *  * Copyright  : (c) 2026 Wilson K Sam
 *  * =============================================================================
 *  *
 *  * Description:
 *  * This source file is part of a coding practice project created for learning,
 *  * experimentation, interview preparation, and demonstration of software
 *  * development concepts and best practices.
 *  *
 *   * Purpose:
 *   * -Create a Product record containing a name and price. If the name is accessed, it should always return in uppercase format, but the data must be securely verified upon instantiation.
 *  * Notes:
 *  * -
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.java17.java_records;

public class CustomRecordAccessors {

    public  record Product(String name, Double price) {
        @Override
        public String name() {
            return name.toUpperCase();
        }

    }

    public static void main(String[] args) {
        Product product = new Product("Wilson", 12.3);
        System.out.println(product.name());
    }
}
