import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

import org.apache.commons.collections4.ListUtils;

interface addition
{
	void add(int a , int b);
}

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");

//listsort();


Integer [] numbers = {1,2,3,4,5,6};
List<Integer> list = Arrays.asList(numbers);
Integer search[] = {2,3,4,5,8,9,0};
List<Integer> list1 = Arrays.asList(search);

list1.forEach((e) -> {
	if(!list1.contains(e))
	System.out.println("not matching :"+e);	
});


for(int a:list1)
{
	if(!list.contains(a))
	System.out.println(a);
}
for(int a:list)
{
	if(!list1.contains(a))
	System.out.println(a);
}
String str1="";

for(int str : numbers)
{
	str1=str1+String.valueOf(str);
}

for(int n : search)
{
	if(str1.contains(String.valueOf(n)))
	{
		System.out.println("matching "+n);
	}
		
}

int[] arr = {-1,-2,-3,-4,-5};


	



	
	}
	
	static void listsort() {
		List<String> lt = new ArrayList<>();

		lt.add("anil");
		lt.add("sunil");
		lt.add("benil");
		lt.add("akhil");
		lt.add("check");
		lt.add("devaki");
		System.out.println("ltttt  :"+lt);
		List<String>lt1 = new ArrayList<>(lt);
		Collections.sort(lt);
		String[] arr = lt.toArray(new String[0]);
		lt1.replaceAll(str -> str.toUpperCase());
		System.out.println("lt1 upper "+lt1);
		for(String str :arr)
			
		System.out.println(str);

		String[] arr1 = lt1.toArray(new String[0]);

		if(lt1.equals(lt))
			System.out.println("same");
		else
			System.out.println("not same");

		if(arr.equals(arr1))

			System.out.println("same");
		else
			System.out.println("not same");



		System.out.println(lt);


			


			addition ad = (int a, int b)->{
			System.out.println("calling lambda" + Math.max(a,b));
			};
			
			ad.add(10,20);
	}
}
	
