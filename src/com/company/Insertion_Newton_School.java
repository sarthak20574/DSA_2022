package com.company;

import java.util.Scanner;

public class Insertion_Newton_School {

    /*

    Insertion
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Two strings S and T are given. Determine whether S can be equal to T by performing the following operation a few (possibly zero) times.

Between two consecutive equal characters in S, insert a character equal to these characters.
Suppose if you can insert a character between i and i+1 position only if Si = Si+1 and the character inserted should be equal to Si.
Input
The first line of the input contains a single string S.
The second line of the input contains a single string T.

Constraints:
2<= |S|, |T| <=2x10^5
Each of S and T consisting of lowercase English letters.
Output
If it is possible to make S equal T, print Yes; otherwise, print No. Note that the judge is case- sensitive.
Example
Sample Input 1:
abbaac
abbbbaaac

Sample Output 1:
Yes

Explanation 1:
You can make S = abbaac equal T = abbbbaaac by the following three operations.
First, insert b between the 2- nd and 3- rd characters of S. Now, S = abbbaac.
Next, insert b again between the 2- nd and 3- rd characters of S. Now, S = abbbbaac.
Lastly, insert a between the 6- th and 7- th characters of S. Now, S = abbbbaaac.
Thus, Yes should be printed.

Sample Input 2:
xyzz
xyyzz

Sample Output 2:
No

Explanation 2:
No sequence of operations makes S= xyzz equal T= xyyzz. Thus, No should be printed
     */


    class Main {
        public static void main (String[] args) {

            Scanner sc=new Scanner(System.in);
            String x= sc.nextLine();

            String y= sc.nextLine();

            int i=0, j=0;
            boolean ans= true;

            // aa
            //b

            while( i<x.length() && j< y.length()){
                if( x.charAt(i)==y.charAt(j)){
                    i++;
                    j++;
                }
                else if( i-2>=0 && x.charAt(i)==x.charAt(i-1) &&
                        x.charAt(i)==x.charAt(i-2) ){
                    i++;
                }
                else if( j-2>=0 && y.charAt(j)==y.charAt(j-1) &&
                        y.charAt(j-1)==y.charAt(j-2)){
                    j++;
                }
                else{
                    // System.out.println("YIN");
                    ans= false;
                    break;
                }
            }

            while ( i-2>=0 && i<x.length() && x.charAt(i)==x.charAt(i-1) &&
                    x.charAt(i)==x.charAt(i-2) ){
                i++;
            }

            while( j-2>=0 && j<y.length()  && y.charAt(j)==y.charAt(j-1) &&
                    y.charAt(j-1)==y.charAt(j-2)){
                j++;
            }

            if( i==x.length() && j== y.length() && ans !=false){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            // == == then i++, j++;
            //else if i == i+1  i++
            // else if j == j+1 j++
            // else
        }
    }
}
