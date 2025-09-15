package heap;

/**
 * @Author caoww
 * @Date 2025/9/12 09:19
 **/
public class BuildHeap {

    public static void main(String[] args) {
        int[] a = {0, 3, 4, 1, 5, 2};
        buildHeap(a,a.length-1);
        for(int i=1;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void buildHeap(int[] a,int n){
        for(int i=n/2;i>=1;i--){
            heapify(a,i,n);
        }
    }

    public static void heapify(int[] a,int i,int capacity){

        int maxPos = i;
        while(true){
            if(2*i<capacity && a[i]<=a[2*i]){
                maxPos = 2*i;
            }
            if(2*i+1<capacity && a[maxPos] <= a[2*i+1]){
                maxPos = 2*i + 1;
            }
            if(maxPos==i){
                break;
            }
            swap(a,i,maxPos);
            i=maxPos;
        }
    }


    public static void swap(int[] a,int o,int t ){
        int p = a[t];
        a[t] = a[o];
        a[o]=p;
    }
}
