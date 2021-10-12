package com.corso.java.orange.OtherProjects.Tombola;

import java.util.List;

public class Utility {

    /**
     * calcola un numero random in base ad un range che non é presente
     * nella lista exclusions.     *
     * @param min
     * @param max
     * @param exclusions
     * @return
     */
    public static int calcRandomByRange(int min, int max, List<Integer> exclusions){
        int result;
        do {
            result = (int) ((Math.random() * (max - min)) + min);
        } while(exclusions.contains(result));
        return result;
    }
}
