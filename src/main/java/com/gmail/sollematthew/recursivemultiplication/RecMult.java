package com.gmail.sollematthew.recursivemultiplication;

/**
 *
 * @author Matt
 */
public class RecMult {
    
    /**
     * 
     * @param x integer multiplicand
     * @param y integer multiplier
     * @return  integer product
     */
    public int recMult(int x, int y) {
        if(y == 0 || x == 0) return 0; 
        else return recMult(x, y-1) + x;
    }
}
