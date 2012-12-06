/**
 * Copyright IT.
 */
package sg.edu.astar.i2r.batc.common;

/**
 * This is a common HelloWorld code.
 * 
 * @author i.tay
 *
 */
public class HelloWorld{

	/**
	 * The entry function of Hello World.
	 * @param args
	 * 	Not used.
	 */
	public static void main(String[] args){
		System.out.println("Can there be a more boring Hello World?");
		if((args!=null) && (args.length>0)){
			System.out.println("Hello Again World");
		}
		else{
			System.out.println("Hello World");
		}
	}

}
