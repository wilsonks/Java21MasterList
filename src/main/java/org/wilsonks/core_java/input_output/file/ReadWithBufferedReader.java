/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ReadWithBufferedReader.java
 *  * Created On : 2026-06-23 12:45
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
 *   * -
 *  * Notes:
 *  * -
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.core_java.input_output.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadWithBufferedReader {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("wilsonksam.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        bufferedReader.lines()
                .forEach(System.out::println);

    }
}
