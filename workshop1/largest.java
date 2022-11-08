package workshop1;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[] {25,11,07,75,55};
int max =arr[0];
for (int i=0; i<arr.length; i++)
{
	//arr[0]=25>25
	if (arr[i]>max)
		max=arr[i];
	
}
System.out.println("largest element present in given array");
	}

}
