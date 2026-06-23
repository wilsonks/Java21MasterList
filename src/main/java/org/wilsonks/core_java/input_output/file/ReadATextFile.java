/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ReadATextFile.java
 *  * Created On : 2026-06-23 12:20
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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadATextFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("wilsonksam.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split("\\s");
                String caps = Arrays.stream(split)
                        .map(String::strip)
                        .map(s -> s.toUpperCase())
                        .collect(Collectors.joining(" "));

                System.out.println(caps);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
