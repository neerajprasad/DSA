package interview.tree;

public class HeapSort {
    public static void main(String[] args) {
        int a[] ={3,9,4,7,1,};
        MyHeapSort(a);
        printArray(a);
    }

    private static void MyHeapSort(int[] a) {
        int n=a.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }
        for (int i=n-1; i>=0; i--)
        {
            int temp =a[0];
            a[0]=a[i];
            a[i]=temp;
            heapify(a,i,0);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    private static void heapify(int[] a, int n, int i) {
        int largest=i;
        int leftNode = 2*i+1;
        int rightNode = 2*i+2;

        if(leftNode<n && a[leftNode]>a[largest]){
            largest=leftNode;
        }
        if(rightNode < n && a[rightNode]>a[largest]){
            largest=rightNode;
        }

        if(largest!=i){
            int temp =a[i];
            a[i]=a[largest];
            a[largest]=temp;
            heapify(a,n,largest);
        }
    }
}
