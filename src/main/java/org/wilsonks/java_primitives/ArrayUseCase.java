/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ArrayUseCase.java
 *  * Created On : 2026-06-04 08:56
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

package org.wilsonks.java_primitives;

import java.util.Arrays;

public class ArrayUseCase {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        byte[] bytes = {1, 2, 3, 4, 5};
        char[] chars = {65, 66, 67, 68, 69, 70, 71, 72, 73 };
        short[] shorts = {1, 2, 3, 4, 5};
        float[] floats = {1, 2, 3, 4, 5};
        double[] doubles = {1, 2, 3, 4, 5};
        long[] longs = {1, 2, 3, 4, 5};
        boolean[] booleans = {true, false, true, true};

        Arrays.sort(ints);
        Arrays.sort(bytes);
        Arrays.sort(chars);
        Arrays.sort(shorts);
        Arrays.sort(floats);
        Arrays.sort(doubles);
        Arrays.sort(longs);

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(shorts));
        System.out.println(Arrays.toString(floats));
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(longs));
        System.out.println(Arrays.toString(booleans));

    }
}
