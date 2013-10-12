package algorithms;

import tools.Print;

/**
 * @author yangwr1
 * 排序算法父类，提供基本构造函数，已整数型数组为标准数组。将数组中的整数按照升序排序，其中升序函数sortAscending由子类自己实现。
 *
 */
public abstract class Sort {
	protected int size;
	protected int[] array;
	
	public Sort(){
		this.size = 0;
		this.array = new int[0];
	}
	
	protected void setArray(int[] array){
		if(null != array){
			this.array = array;
			this.size = array.length;
		}
	}
	
	protected int[] getArray(){
		return this.array;
	}
	
	protected void printArray(int[] array){
		Print print = new Print();
		print.printIntArray(array);
	}
	
	abstract void sortAscending();
}
