public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {11, 9, 7, 15, 6, 10, 5, 17};

        for(int i=1;i<a.length;i++){
            int key = a[i];
            int j = i-1;

            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        for(int i:a){
            System.out.print(i+" ");
        }
    }
    
}
