package Arrays.logicbuilding;

public class PairSum {
    public static int pairSum(int arr[],int target){
        int paircount=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    paircount++;
                }
            }
        }
        return paircount;
    }

    public static int tripleSum(int arr[],int target){
        int triplecount=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        triplecount++;
                    }
                }
            }
        }
        return triplecount;
    }

    public static void main(String[]args){
        int nums[]={1,2,3,4,5,6,7,8,9};
        int target=9;
        System.out.println(pairSum(nums,target));
        System.out.println(tripleSum(nums,target));
    }
}
