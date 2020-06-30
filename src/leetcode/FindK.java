package leetcode;

/**
 * 找出一个数据中第K大的元素
 */
public class FindK {

    public static void main(String[] args) {
        int arr[] = new int[]{3,2,1,5,6,4};
        //[3,2,1,5,6,4]
        //2
//        int k = findK(arr,2-1 , 0, arr.length - 1);
        int k1 = findK1(arr,0,arr.length-1,2);
//        System.out.println(k);
        System.out.println(k1);
    }

    public static int findK(int[] arr,int k,int left,int right){
        int index = arr[left];
        int l = left,r = right;
        while (r > l){
            while (arr[r]>=index && r>l) r--;
            if(arr[r]<index){
                arr[l++] = arr[r];
                arr[r] = index;
            }
            while (arr[l]<index && r>l) l++;
            if(arr[l]>=index){
                arr[r--] = arr[l];
                arr[l] = index;
            }
        }
        if(l>k){
            return findK(arr,k,left,l);
        }else if(l<k){
           return findK(arr,k,l+1,right);
        }else {
            return arr[k];
        }

    }


    public static int findK1(int[] nums,int left,int right,int a){
        int l=left,r=right;
        int k = nums[left];
        while(l<r){
            while(nums[r]<=k && l<r){
                r--;
            }
            if(nums[r]>k && l<r){
                nums[l++]=nums[r];
                nums[r] = k;
            }
            while(nums[l]>k && l<r){
                l++;
            }
            if(nums[l]<k && l<r){
                nums[r--] = nums[l];
                nums[l] = k;
            }
        }

        if(l==a-1){
            return nums[l];
        }else if(l<a-1){
            return findK1(nums,l+1,right,a);
        }else{
            return findK1(nums,left,l-1,a);
        }

    }
}
