/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm;

/**
 *
 * @author congh
 */
public class Error404 extends Exception{
    public String error;
 
    public Error404 (String error) {
        this.error = error;
    }
 
 
    
}
