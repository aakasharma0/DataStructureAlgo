public class WaveArray{

     public static void convertToWave(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i+=2){
            if(i+1!=n){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        // simple swap ajcacent elemnts
    }
    public static void main(String[] args) {
        
    }
}