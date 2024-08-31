/*
https://codingbat.com/prob/p148972
Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, 
it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
 */
public class loneSum {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 3;

        int sum = 0;

        if ((a==b) && (b==c)) sum=0;
        else if (a==b && b!=c) sum = c;
        else if (b==c && c!=a) sum = a;
        else if (c==a && a!=b) sum = b;
        else if (a!=b && b!=c) sum = a+b+c;

        System.out.println(sum);
        }


    }

