/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : WriteWithABufferedWriter.java
 *  * Created On : 2026-06-23 13:04
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

import java.io.*;

public class WriteWithABufferedWriter {
    public static final String fileName = "wilsonksam_2.txt";

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, false))) {
            bufferedWriter.newLine();
            bufferedWriter.write(new String("""
                    Rashmi Wilson
                    #1203, A Block, Sattva Laurel Heights Apartment, MallSandra, PIN: 560057
                    """));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));) {
            bufferedReader.lines()
                    .forEach(System.out::println);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}