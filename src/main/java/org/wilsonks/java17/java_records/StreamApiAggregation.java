/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : StreamApiAggregation.java
 *  * Created On : 2026-06-03 11:43
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
 *   * - Given a list of transaction records, find the unique sum of amounts processed per currency type.
 *  * Notes:
 *  * -
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.java17.java_records;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiAggregation {

    record Transaction(
            String type,
            double amount
    ) {
    };

    public static void main(String[] args) {
        System.out.println("""
            DESCRIPTION:
            
            This class demonstrates the use of Java Streams API for aggregation operations. 
            The Streams API provides a powerful and expressive way to perform various operations on collections of data, such as filtering, mapping, and reducing. 
            In this example, we will show how to use the Streams API to perform aggregation operations like sum, average, count, and grouping on a collection of data. 
            This allows us to easily process and analyze data in a functional programming style, making our code more concise and readable.
        """);

        List<Transaction> transactions = List.of(
                new Transaction("USD", 500.0),
                new Transaction("USD", 150.0),
                new Transaction("EUR", 200.0),
                new Transaction("EUR", 250.0),
                new Transaction("JPY", 300.0)
        );

        Map<String, Double> collect = transactions.stream()
                .collect(Collectors.groupingBy(
                        tx -> tx.type,//Select the Key
                        TreeMap::new,//To store in TreeMap in auto sorted by key
                        Collectors.reducing(0.0, tx -> tx.amount, (amt1, amt2) -> amt1 + amt2) //Value Reduce
                ));

        //How do you sort a Map
        Map<String, Double> sorted = collect.entrySet()
                .stream()
                .sorted(new Comparator<Map.Entry<String, Double>>() {
                    @Override
                    public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                })
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // In case of key collision, keep the old value (though there shouldn't be any in this case)
                        LinkedHashMap::new // To maintain the sorted order in the resulting map
                ));

        collect.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("Sorted:");
        sorted.forEach((k, v) -> System.out.println(k + ": " + v));
    }


}
