/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : FileClassMethod_readString.java
 *  * Created On : 2026-06-09 09:46
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


public class FileClassMethod_readString {

     public static void main(String[] args) {
         try {
             String content = java.nio.file.Files.readString(java.nio.file.Paths.get("example.txt"));
             java.util.stream.Stream<String> lines = content.lines();
             lines.forEach(System.out::println);
         } catch (java.io.IOException e) {
             e.printStackTrace();
         }
     }
}
