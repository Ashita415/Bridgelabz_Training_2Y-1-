package Strings.logicbuilding;

public class mostWaterContainer {
    public static int maxArea(int height[]){
        int n=height.length;
        int l=0;
        int r=n-1;
        int max=0;
        while(l<r){
            max=Math.max(max,(r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
    public static void main(String[]args){
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
