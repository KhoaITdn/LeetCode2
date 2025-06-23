public class minindex {
public static void main(String[] args) {
    int arr[] = {100,5,8,11,2,7,9};
    int index = minValue(arr);
    System.out.println("SO NHO NHAT LA : " + arr[index]);
}


public static int minValue (int[] arr){
    int minIndex = 0;
    for (int i = 1 ; i < arr.length; i++){
        if(arr[i] < arr[minIndex]){
            minIndex = i;
        }
        
    }
    return minIndex;
}

}