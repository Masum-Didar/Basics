package interview;
public class avarageWithoutMaxMin {
    
    public static void main(String[] args) {
		int arr[] = {1, 25, 3,58,35,46,99};
		int max = arr[0], min=arr[arr.length-1];
		float sum=0, Average;
        
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) { 
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(max !=arr[j] && min != arr[j]) {
				sum = sum + arr[j];
				System.out.print(arr[j]+" ");
			}
		}
		Average = sum/(arr.length-2);
		System.out.println();
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+Average);
		System.out.println(min + " "+max);	
	}
}
