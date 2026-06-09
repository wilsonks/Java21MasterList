/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : FilesClassMethod_writeString.java
 *  * Created On : 2026-06-09 09:43
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

package org.wilsonks.java11_2018.new_Files_class_methods;

public class FilesClassMethod_writeString {

     public static void main(String[] args) {
         String content = "This is a sample text to be written to the file.";
         java.nio.file.Path filePath = java.nio.file.Paths.get("output.txt");

         try {
             java.nio.file.Files.writeString(filePath, content);
             System.out.println("Content written to file successfully.");
         } catch (java.io.IOException e) {
             System.err.println("An error occurred while writing to the file: " + e.getMessage());
         }
     }
}
