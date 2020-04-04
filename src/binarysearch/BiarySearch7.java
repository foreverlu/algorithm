package binarysearch;

/**
 * 递归版的二分查找
 */
public class BiarySearch7 {

    public int binarySearch(int[] arr,int key,int left,int right){
        if(left > right){
            return -1;
        }
        int mid = left + ((right-left)>>>1);
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            return binarySearch(arr,key,left,mid-1);
        }
        else{
            return binarySearch(arr,key,mid+1,right);
        }

    }

}
