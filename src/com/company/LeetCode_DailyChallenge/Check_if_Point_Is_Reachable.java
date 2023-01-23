package com.company.LeetCode_DailyChallenge;

import java.math.BigInteger;

public class Check_if_Point_Is_Reachable {

    //2543. Check if Point Is Reachable
    //https://leetcode.com/problems/check-if-point-is-reachable/description/
    //https://leetcode.com/problems/check-if-point-is-reachable/solutions/3082073/java-c-python-1-line-gcd-solution/


    public boolean isReachable(int x, int y) {

        /*
lee:

        Assume x and y have a common divisor v bigger than 2,
Since
(x + y) % v == 0
(x / 2) % v == 0 if x is even
(y / 2) % v == 0 if y is even
The new value always can be divided by v

No matter what operation we use,
we can't reach (1,1)

To go from (x,y) to (1,1),
we have the necessary condition :
gcd(x,y) = 2 ^ k


SunnyvaleCA:

Suppose x and y both have a common prime factor of 3. That means x = 3a and y = 3b for some integers a and b. No matter what the a and b are, you can't divide either one by 2 often enough to end up with 1 because the 3 always gets in the way. Maybe apply (x,y) --> (x+y, y) rule to change the first value to something we can divide later? Can we divide x+y by 2 enough times to get 1? The answer is always no! x+y = 3a+3b = 3*(a+b). So your x+y also has 3 as a prime factor. Basically, if x and y both have a prime factor of 3, then any number of addition or division operations performed in any order will leave both numbers with a common factor of 3.

But using 3 is just an example. Any common prime factor other than 2 will cause the same problem. We could find prime factorization of both x and y and then check that the only common factor is 2. But the easier way to do this is determining that the GCD is a power of 2. If the GCD is, for example 12, you know that both numbers have 223 as some of their factors... and there's that nasty 3 again!

So, taking all of the above, you can see that having no common factors other than powers of 2 is a necessary condition. Now on to the other half, which proves that having only powers of 2 in common always lets you solve.
        */


        int gcd = BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue();

        while( gcd%2==0){
            gcd/=2;
        }

        return gcd==1;
    }

}
