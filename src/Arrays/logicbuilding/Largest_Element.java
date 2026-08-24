package Arrays.logicbuilding;

public class Largest_Element {
    public static int maxElement(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int secondMax(int arr[]) {
        int max = maxElement(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }

        }
        int secondMax = maxElement(arr);

        return secondMax;
    }
    public static void main(String[] args) {
        int arr[]={2,9,3,6,5,5};
        System.out.println("The max element is: "+maxElement(arr));
        System.out.println("The second max element is: "+secondMax(arr));
    }
}
