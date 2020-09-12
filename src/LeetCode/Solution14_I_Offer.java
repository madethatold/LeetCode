package LeetCode;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLBoundFault;

import java.util.Map;

/**
 * @author colorful
 * @date 2020/9/8
 **/
//剑指 Offer 14- I. 剪绳子
public class Solution14_I_Offer {
    public static void main(String[] args) {
        System.out.println(cuttingRope(11));
    }
    public static int cuttingRope(int n) {
        if (n==1||n==2) return 1;
        if (n==3) return 2;
        int []dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for (int i=4;i<=n;i++){
            for (int j=1;j<i;j++){
                dp[i]=Math.max(dp[i],dp[j]*dp[i-j]);
            }
        }
        return dp[n];
    }
}
