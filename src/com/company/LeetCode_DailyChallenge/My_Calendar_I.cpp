class MyCalendar {
    private:

    //729. My Calendar I
    //https://leetcode.com/problems/my-calendar-i/
    //https://www.youtube.com/watch?v=lUROQC6YCNQ&ab_channel=CodewithAlisha
    //https://www.youtube.com/watch?v=qGctf-bNDkg&ab_channel=AyushiSharma

    //we use the ordered map it stored elements sorted by their keys can use TreeMap in java
    map<int, int> m;
public:
    MyCalendar() {

    }


    // for every start of the event we add one and for every end of the event we subtract one, so if 1 event starts and before it ends another event starts we will get sum==2...since its a colliding event we remove it from our map

    bool book(int start, int end) {

        m[start]++;
        m[end]--;

        int sum=0;
        for( auto i= m.begin(); i!=m.end(); i++){

            sum+=i->second;
            if( sum>1){

                // remove the
                m[ start]--;
                m[ end]++;
                return false;
            }
        }

        return true;
    }
};
