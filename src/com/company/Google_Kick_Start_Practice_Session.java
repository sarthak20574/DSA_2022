package com.company;

import java.util.PriorityQueue;

public class Google_Kick_Start_Practice_Session {


    // incomplete

    //Q1 Centauri Prime(done easily)
    private static String getRuler(String kingdom) {

        // use hash set for storing the vowels as then O(1) time complexity
        String ruler = "";
        int length=kingdom.length();
        String vowels="aeiouAEIOU";

        char lastChar=kingdom.charAt(length-1);

        if(lastChar=='y' || lastChar=='Y' )
            ruler="Nobody";
        else if (vowels.contains(""+lastChar)){
            ruler="Alice";
        }
        else {
            ruler="Bob";
        }
        return ruler;

    }


/*
    Q2 H-index
    Jorge is a physicist who has published many research papers and wants to know how much impact they have had
     in the academic community. To measure impact, he has developed a metric, H-index, to score each of his papers
     based on the number of times it has been cited by other papers. Specifically, the H-index score of a
     researcher is the largest integer H such that the researcher has H papers with at least H citations each.

    Jorge has written N papers in his lifetime. The i-th paper has Ci citations. Each paper was written
     sequentially in the order provided, and the number of citations that each paper has will never change.
     Please help Jorge determine his H-index score after each paper he wrote.

    Input
    The first line of the input gives the number of test cases, T. T test cases follow. Each test case begins
     with a line containing N, the number of papers Jorge wrote. The second line contains N integers. The i-th
     integer is Ci, the number of citations that the i-th paper has.

    Output
    For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1)
     and y is a space-separated list of N integers. The i-th integer is Jorge's H-index score after writing his
     i-th paper.

    Sample Input
    2
    3
    5 1 2
    6
    1 3 3 2 2 15

    Sample Output
    Case #1: 1 1 2
    Case #2: 1 1 2 2 2 3

    The input contains 2 test cases. In Sample Case #1, Jorge wrote N = 3 papers.

After the 1st paper, Jorge's H-index score is 1, since he has 1 paper with at least 1 citation.
After the 2nd paper, Jorge's H-index score is still 1.
After the 3rd paper, Jorge's H-index score is 2, since he has 2 papers with at least 2 citations (the 1st and 3rd papers).
In Sample Case #2, Jorge wrote N = 6 papers.

After the 1st paper, Jorge's H-index score is 1, since he has 1 paper with at least 1 citation.
After the 2nd paper, Jorge's H-index score is still 1.
After the 3rd paper, Jorge's H-index score is 2, since he has 2 papers with at least 2 citations (the 2nd and 3rd papers).
After the 4th paper, Jorge's H-index score is still 2.
After the 5th paper, Jorge's H-index score is still 2.
After the 6th paper, Jorge's H-index score is 3, since he has 3 papers with at least 3 citations (the 2nd, 3rd and 6th papers).

*/

    public static int[] getHIndexScore_in_O_n_square(int[] citationsPerPaper) {
        int[] hIndex = new int[citationsPerPaper.length];

        int ans=0,length=citationsPerPaper.length;

        for(int i=1; i<length+1; i++){
            int count=0;

            for( int j=1; j<= i; j++){
                if(citationsPerPaper[j-1]>=(ans+1)) count++;
            }
            if(count>=ans+1) ans++;
            hIndex[i-1]=ans;

        }

        return hIndex;
    }


    // need a ds that can store data is some order that we receive them and also that
    // allows us to remove the citations easily.....use minheap

    // store the citations in the heap only if its greater than cur hIndex( ans),
    // also remove all elements that are less than or equal than the present elements
    // the if length of the heap is heap is >= hIndex+1 then hIndex++

    // in O(n log n)
    public static int[] getHIndexScore(int[] citationsPerPaper){

        int length= citationsPerPaper.length;
        int[] ans= new int[length];

        // heap
        PriorityQueue<Integer> heap= new PriorityQueue<>();

        int hIndex=0;
        for( int i=0 ; i<length; i++){

            if( hIndex<citationsPerPaper[i]){
                heap.add(citationsPerPaper[i]);
            }
            while (!heap.isEmpty() && heap.peek()<= hIndex){
                heap.poll();
            }
            if( hIndex+1<= heap.size()){
                hIndex++;
            }
            ans[i]=hIndex;
        }

        return ans;
    }



    //Milk tea
    // to find the best T, take the most occuring T
    //1010 1001 1011........ for 1st its 1 as most occuring the 2nd one its 0, srd one its 1 and 4th one its
    // it may fall in the forbidden group and can't be trusted, but we conclude that each bit decision is
    // independent from each other, so given a binary bit of length L-1 we can generate Lth bit without
    // considering the Lth bit
    // size of the forbidden set id m so if we make M+1 tea atleast 1 is not in forbidden set

    // forbidden={1111, 0111, 1011, 1101}, preference={1110, 1101, 1011} size of forbidden set=m=4 so need 5 elements
    // in  S0="", S1="0, 1", S2="00, 01, 10, 11", S3={"000", "001", "011", "010", "100", "101", "110","111"},
    // got 8 elements in S3 but need just m+1 or elements so score all and choose the top 5, sam in S4

}
