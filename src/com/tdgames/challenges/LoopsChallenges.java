package com.tdgames.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopsChallenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
        	int aux = 1;
            int res=0;
        	
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            List<Integer> x=new ArrayList<Integer>();  
            //x.clear();
            for(int j=0;j<n;j++){
                
                int resultado = a + (aux * b) + res;
                a=0;
                res=resultado;
                aux=aux*2;
                x.add(resultado);
                //System.out.println(resultado);
                //System.out.println("res: "+res);
                //System.out.println("aux: "+aux);
            }
            System.out.println(x.toString().replace("[", "").replace("]", "").replace(",", ""));
            
            //x.forEach(nb -> System.out.print(nb + " "));
            
        }
        in.close();
    }
	}
