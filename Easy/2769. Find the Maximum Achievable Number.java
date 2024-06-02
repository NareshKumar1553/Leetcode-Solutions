class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int a = num+t;
        for(int i=a;i<1000;i++)
            if(i-t==a)
                return i;
        return -1;
    }
}