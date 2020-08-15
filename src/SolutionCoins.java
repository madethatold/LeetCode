import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author colorful
 * @date 2020/8/7
 **/
public class SolutionCoins {
    public static void main(String[] args) {
        int []coins={1,2,5};
        System.out.println(dp(11,coins));
    }

    public static int recursion(int target,int []coins){
        if (target == 0) {
            return 0;
        }

        if (target < 0) {
            return -1;
        }

        int result = Integer.MAX_VALUE;
        for (int i=0;i<coins.length;i++){
            int temp=recursion(target-coins[i],coins);
            if (temp==-1) continue;
            result=Math.min(temp+1,result);
        }
        if (result== Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }

    public static int dp(int target,int []coins){
        int []dp=new int[target+1];
        for (int i=0;i<dp.length;i++){
            dp[i]=target+1;
        }
        dp[0]=0;
        for (int i=1;i<dp.length;i++){
            for (int j=0;j<coins.length;j++){
                if (i>=coins[j]){
                    dp[i]=Math.min(dp[i-coins[j]],dp[i])+1;
                }
            }
        }
        if (dp[target]==target+1){
            return -1;
        }
        return dp[target];
    }

}
