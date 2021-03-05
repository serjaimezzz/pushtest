package day02_Integer;
import java.util.*;

/**
 * 整数翻转--LeetCode
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * notice:假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2的31次方,  2的31次方 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * @author zhangchi
 *
 */
class Test{
	public static void main(String[] args) {
		Solution s = new Solution();
		int a = 51;
		int b = s.reverse(a);
		System.out.println("b:" + b);
	}
}
class Solution{		
	public static int reverse(int x){
		int sum = 0;
		while(x != 0){
			int pop = x % 10 ; //接收个位上的数
			if(sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE / 10 && pop > 7 ))
				return 0;
			if(sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE / 10 && pop < -8 ))
				return 0;
			sum = sum * 10 + pop;
			x /= 10;
		}
		return sum;
	}
	
    public static int myReverse(int x) {
        int index = 0;
        int n = x;
        int sum = 0;
        while( n > 0){  //求位数
            n /= 10;
            index++; 
        }

        int[] arr = new int[index];
        int b= 0;
        for(int i = 0;i< arr.length; i++){
            b = x % 10;    //取个位
            arr[i] = b;
            x /= 10;            
        }
        for(int i = 0;i < arr.length;i++){
            sum += arr[i] * Math.pow(10,--index);
        }

        if(x<= Integer.MAX_VALUE & x>= Integer.MIN_VALUE)
            return sum;
        else
            return 0;
    }
}