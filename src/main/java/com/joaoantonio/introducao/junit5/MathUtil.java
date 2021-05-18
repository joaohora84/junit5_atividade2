package com.joaoantonio.introducao.junit5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaoantoniodahora
 */
public class MathUtil {
    
    public static int mdc(int a, int b){
        
        a = Math.abs(a);
        b = Math.abs(b);
        
        //Propriedade6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //Propriedade1
        if(b > 0 && a % b == 0){
            
            return b;
            
        }
        
        //Propriedade3
        if(b == 0) {
            return Math.abs(a);
        }
         
        //Propriedade5
        if(a % b != 0) {
            return 1;
        }
        
        return -1;
        
    }
    
}
