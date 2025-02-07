import java.util.Scanner;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number:");
        int n= input.nextInt();
        int a,b;
                int sum=0;
                if(n>0)
                {
                    while(n%10!=1)
                    {
                        a=n%10;
                        b=n/10;
                        sum= (a*a)+(b*b);
                        System.out.println(a+" "+b);
                        n=sum;
                    }

                System.out.println("Happy number");

            }
        }
    }

