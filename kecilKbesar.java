/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author janjan
 */
public class kecilKbesar {
    public static void main(String[] args) {
        int[] deret = new int[7];
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input = ");
        for (int i = 0; i < deret.length; i++) {
            deret[i] = input.nextInt();           
        }
        
        Arrays.sort(deret);
        for (int index:deret){
            System.out.print(" "+index);
        }
    }   
}
