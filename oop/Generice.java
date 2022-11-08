package oop;

public class Generice {
		   public static <T> void print(T[] elements){
		        for (T ele : elements)
		            System.out.println(ele);
		    }

		    public static void main(String[] args) {
		        Integer a[] = {1,2,3,4,5};
		        String b[] = {"raju","dev","daj"};
		        print(b);
		    }
	}


