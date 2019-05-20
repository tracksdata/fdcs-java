package com;

/*
 * 		Notes
 * 	   --------
 * 	1. packages
 * 			1. built in packages
 * 			2. user defined packages
 *
 * 	2. access modifiers
 * 			1. default
 * 			2. public
 * 			3. protected
 * 			4. private
 * 
 *    -> POJO class (Plain old java object) / Model / Entity / Bean
 *    
 *    java packaging executable file types
 *    -------------------------------------
 *    Three types
 *    	1. jar - Java archieve  (only .class files)
 *    	2. war - web archieve   ( .class files, html, js, css, images etc.. )
 *    	3. ear - enterprise archieve ( .class files, html, js, css, images etc.. )	
 *    
 *    
 *      Package
 *      ---------
 *      -> Organize java classes as per its type
 *      
 *     	2. access modifiers
 *     -------------------------
 *     
 *     1. defalt
 *     -----------
 *     	-> data is visible only with in the same package
 *     
 *     2. public 
 *     -----------
 *     -> data is visible to all the classes from the same package and different package
 *     
 *     3. protected
 *     -------------
 *     	-> data is visible only with in the same package
 *     	-> data is visible to  sub classes of other packages
 *     
 *     4. private
 *     -------------
 *     -> data is visible with in the same class.
 *     
 *     
 *      POJO
 *      -----
 *      1. Every property at class level should be private
 *      2. define all methods in the class as public 
 *      3. methods should  be setXXX and getXXX
 *      4. all setters will not have return type. But they have argument
 *      5. all getters will not have arguments, but they have return type
 *      
 * 
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
