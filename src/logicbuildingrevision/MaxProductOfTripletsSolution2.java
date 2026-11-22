package logicbuildingrevision;

public class MaxProductOfTripletsSolution2 {
    public static void main(String[] args){
        int[] a = {7,5,3,2,-10,-20};
        int n = a.length;
        if(n<3){
            System.err.println("Minimum number of elements should be 3");
            System.exit(0);
        }
        //No Sorting - Most efficient solution
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        //if we have negative numbers - we need to find smallest and second smallest number
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int result1;
        int result2;
        for(int num : a){
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max3=max2;
                max2=num;
            }
            else if(num > max3){
                max3=num;
            }
            else if(num < min1){
                min2 = min1;
                min1 = num;
            }
            else if(num < min2){
                min2 = num;
            }
        }
        result1=max1*max2*max3;
        result2=min1*min2*max1;
        if(result1>result2){
            System.out.println("Max Product : "+result1);
        }
        else{
            System.out.println("Max Product : "+result2);
        }
    }
}
