import java.util.*;

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prd=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            prd*=d;
            n/=10;
        }
        return prd-sum;  
    }
}