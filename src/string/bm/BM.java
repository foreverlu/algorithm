package string.bm;

public class BM {

    private static int SIZE =256;

    public static void main(String[] args) {



    }

    public static int bm(char[] a,int n,int m,char[] b){
        int[] bc = new int[SIZE];
        int[] suffix = new int[m];
        boolean[] prefix = new boolean[m];
        generateBC(b,m,bc);
        int i=0;//表示主串与模式串对齐的第一个字符
        while (i<n-m){
            int j;
            for(j=m-1;j>=0;j--){//模式串从后往前匹配
                if(a[i+j]!=b[j]) break; //坏字符对应模式串中的下标是j
            }
            if(j<0){
                return i;
            }

            int x = j-bc[a[i+j]];
            int y =0;
            if(j<m-1){
                y = moveByGS(j,m,suffix,prefix);
            }

            //等同于将模式串往后滑动j-bc[a[i+j]]位
            i = i + Math.max(x,y);

        }

        return -1;

    }

    private static int moveByGS(int j, int m, int[] suffix, boolean[] prefix) {
        int k = m -j-1;
        if(suffix[k]!=-1) return j-suffix[k]+1;

        for(int r=j+2;r<=m-1;++r){
            if(prefix[m-r]==true){
                return r;
            }
        }
        return m;
    }


    //b表示模式串.m表示长度,suffix,prefix数组事先申请好
    private static void generateGS(int[] b,int m,int[] suffix,boolean[] prefix){
        for(int i=0;i<m;i++){
            suffix[i] = -1;
            prefix[i] = false;
        }


        //从0到m-1开始吧
        for(int i=0;i<m-1;i++){
            int j=i;
            int k=0;
            while (j>=0 &&b[j]==b[m-k-1]){
                j--;
                k++;
                suffix[k] = j+1;
            }
            if(j==-1) prefix[k] =true;
        }
    }




    //bc中记录字符在a中出现的位置
    public static void generateBC(char[] a,int m,int[] bc){
        for(int i=0;i<bc.length;i++){
            bc[i] = -1;
        }

        for(int i=0;i<a.length;i++){
            int ascii = a[i];
            bc[ascii] = i;
        }



    }



}

