
package interview;


public class avarageWithoutMaxMin {
    
    public static void main(String[] args) {
    
    int[] arr={3, 5, 6, 8, 1, 7, 9};
    int max = arr[0];
    int min = arr[arr.length-1];
    int sum = 0;
     
    
        for(int i = 1; i<arr.length; i++){

                if(max<arr[i]){
                    max=arr[i];
                }
                if(min>arr[i]){
                    min=arr[i];
                }

            }
            for(int j=0; j<arr.length; j++){
                if(max != arr[j] && min !=arr[j]){
                    sum = sum + arr[j];

                System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
            System.out.println("The max number is "+max);
            System.out.println("The min number is "+min);
            System.out.println("The sum number is "+sum);
             float avg = sum % (arr.length-2);
             System.out.println("The avarage is "+avg);
        
    }
    
   
    
}
