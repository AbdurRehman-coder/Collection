package app;

import java.util.ArrayList;

class Container<E> {
    E number;
    
    public void show(){
        System.out.println("Type of number = " + number.getClass().getName());
         System.out.println("number = " + number);
    }
    public void demo(ArrayList<Integer> arr ){
        arr.add(35);
        arr.add(56);
       System.out.println("list values: " + arr);

    }
	public E getNumber() {
		return number;
	}
	public void setNumber(E number) {
		this.number = number;
	}
}