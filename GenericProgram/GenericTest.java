package GenericProgram;
import java.util.ArrayList;
public class GenericTest<T> {
	ArrayList<T> arrayList=new ArrayList<>();
public T addElement(T element)
{
	arrayList.add(element);
	return element;
	}
public T removeElement(T element)
{
	arrayList.remove(element);
	return element;
	}
public String toString()
{
	return arrayList.toString();
	}
public T get(int get) {
	
	return arrayList.get(get);
}
}
