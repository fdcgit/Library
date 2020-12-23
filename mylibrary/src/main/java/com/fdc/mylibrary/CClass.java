package com.fdc.mylibrary;

import android.util.Log;

import java.util.Map;

public class CClass {

    public static String methodFirst(String instrInputData) {
        return "FuncFirst => " + instrInputData;
    }

    public static String methodSecond(String instrInputData) {
        return "FuncSecond => " + instrInputData;
    }

    public static String methodThird(String instrInputData) {
        return "FuncThird => " + instrInputData;
    }

    public static String methodFourth(String instrInputData) {
        return "FuncFourth => " + instrInputData;
    }

    public static int computeWithRespectToMapObjects(
            Map<String, Integer> inMapComputeOne, String instrKeyOne,
            Map<String, Integer> inMapComputeTwo, String instrKeyTwo,
            int in_nValueOne,
            int in_nValueTwo
    ) {

        int nResult = 0;

        inMapComputeOne.put(instrKeyOne, in_nValueOne);
        inMapComputeTwo.put(instrKeyTwo, in_nValueTwo);

        nResult = inMapComputeOne.get(instrKeyOne) + inMapComputeTwo.get(instrKeyTwo);

        return nResult;
    }

}
