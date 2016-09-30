import java.util.*;
public class StringStack{
	private String[] elements;
	private int count;
	private static final int DEFAULT_SIZE = 10;

	public StringStack(int n){
		if (n <= 0){
			throw new IllegalArgumentException("Invalid size");
		}
		else{
			elements = new String[n];
		}
	}

	public StringStack(){
		this(DEFAULT_SIZE);
	}

	public int size(){
		return count;
	}

	public void push (String item){
		if(count >= elements.length){
		String[] newElements = Arrays.copyOf(elements, elements.length + DEFAULT_SIZE);
		newElements[count++] = item;
		elements = newElements;
		}
		else{
			elements[count++] = item;
		}
	}

	public String pop(){
		if (count <= 0){
			throw new ArrayIndexOutOfBoundsException("e");
		}
		else{
			return elements[--count];
		}
	}

	public String peek(){
		return elements[count-1];
	}

	public String pop(int n){
		if (n <= 0){
			throw new IllegalArgumentException("e");
		}
		else{
			String res = "";
			for (int i = 0; i < n; i++){
				res = pop();
			}
			return res;
		}
	}

	public String toString(){
		if (count == 0){
			return "EMPTY";
		}
		else{
			String ret = "";
			for (int i = 0; i < count - 1; i++){
				ret += elements[i] + ", ";
			}
			return ret + elements[count - 1];
		}
	}
}