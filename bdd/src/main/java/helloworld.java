import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

interface addition
{
	void add(int a , int b);
}

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");



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
	/*@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}*/
