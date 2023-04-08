public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arr = {1,2,3,4,5,6,6};
      int book = rmDuplicates(arr, 6);
      System.out.println(book);
      
        
    }
    static int rmDuplicates(int arr[],int size){
     
        if (size == 0 || size==1){
            return size;
       
        }
        int len = 0,i;
        for   (i=0;i<size-1;i++){
            if (arr[i] != arr[i+1]){
                arr[len++] = arr[i];
            } 
           arr[len++]=arr[size-1];
        }
        return i;
    }

}
