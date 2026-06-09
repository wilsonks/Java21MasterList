/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : FilesClassMethod_isSameFile.java
 *  * Created On : 2026-06-09 09:51
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

public class FilesClassMethod_isSameFile {

    public static void main(String[] args) {
        try {
            java.nio.file.Path path1 = java.nio.file.Path.of("example1.txt");
            java.nio.file.Path path2 = java.nio.file.Path.of("example2.txt");

            boolean sameFile = java.nio.file.Files.isSameFile(path1, path2);
            System.out.println("Are the two paths referring to the same file? " + sameFile);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
