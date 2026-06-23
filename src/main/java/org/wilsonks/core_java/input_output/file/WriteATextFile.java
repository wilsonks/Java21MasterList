/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : WriteATextFile.java
 *  * Created On : 2026-06-23 12:31
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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args) throws IOException {

        final String fileName = "wilsonksam_1.txt";

        try(FileWriter fileWriter = new FileWriter(fileName, false)) {
            String sb = """
                    Wilson K Sam
                    #1203, A Block,
                    Sattva Laurel Heights, Hesaraghatta Main Road,
                    Near UCO Bank, Rangappa Layout,Mallasandra,
                    Jalahalli West, Bengaluru, Karnataka 56005
                    """;
            fileWriter.write(sb);

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
