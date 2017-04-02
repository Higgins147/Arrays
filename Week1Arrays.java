import java.util.Arrays;
public class Week1Arrays{

public static void main(String[] args)
	{
		int [] num = {2, 3, 4, 9, 2};
		int total = 0;
		int count1 =0;
		int count2 =0;
		int arrayLength = num.length;
		int median = 0;

		
/* Find the mean */

		for(int i = 0; i < num.length; i++)
		{
			total = num[i] + total;	
		}		
		System.out.println(total/num.length);

/* Find the median */

		Arrays.sort(num);
		if(arrayLength % 2 == 0)
		{
			median = arrayLength / 2 - 1;
		}
		else
		{
			median = arrayLength / 2;
		}
		System.out.println(num[median]);


/* Find the mode */


		for(int z = 0; z < num.length; z++)
		{
			if (num[z] == num[z+1])
			{
				count1++;
			}
			
		}

		
	}
	
}
	

