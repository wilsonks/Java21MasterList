/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ReadWriteUsingFiles.java
 *  * Created On : 2026-06-23 13:26
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

package org.wilsonks.core_java.input_output.file_Files;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesAndPathExample {
    public static final String fileName = "example.txt";

    public static void main(String[] args) {
        Path path = Path.of(fileName);
        if (Files.exists(path)) {
            try {
                var content = Files.readAllLines(path);
                content.forEach(System.out::println);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                Files.writeString(path, """ 
                        Hello, World!
                        This is an example of writing to a file using Files.write.
                        Line Number 3
                        Line Number 4
                        """);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
