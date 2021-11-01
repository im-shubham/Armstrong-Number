package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n,z,count=0,digit,product,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        n=sc.nextInt();


        z=n;
        while(z>0){
            count+=1;
            z=z/10;

        }
        z=n;

        while(z>0){
            digit=z%10;
            product=1;
            
            for(int i=1;i<=count;i++){
                product=product*digit;
            }
            sum=sum+product;
            z=z/10;

        }
        if(sum == n){
            System.out.println("This number is Armstrong number!!");

        }
        else{
            System.out.println("This number is not a Armstrong Number!!");
        }



    }
}
