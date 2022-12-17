package LiKou.Enumerate;

/**
 * 枚举算法
 *
 * @author QIA
 * @create 2022-11-06-11:45
 */
public class demo05 {
    //力扣1534  统计三元数组
    //https://leetcode.cn/problems/count-good-triplets/
    public int countGoodTriplets(int[] arr,int a,int b,int c){
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length - 1;j++){
                if(Math.abs(arr[i] - arr[j]) > a){
                    continue;
                }
                for(int k = j +1;k < arr.length;k++){
                    if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[j]) <= c){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public void main(String[] args) {
        int arr[] = {4,9,9,8,9,5,3,7};
        int a = 7,b = 2,c = 3;
        System.out.println(countGoodTriplets(arr,a,b,c));
    }

}
