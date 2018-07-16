public class HelloWorld {
	/** main function. 
	@prediction */
	public static void main(String[] args){
		System.out.println("hello world");	
	}
}

/* 1. In object-oriented programming, a class is an extensible program-code-template for creating objects,
 an object is an instance of a class
 providing initial values for state (member variables) and implementations of behavior (member functions or methods)
 2. HelloWorld is an class, create instance
 3. class has two opponents: attributes(fields) and methods 
 4. java: must have a main function: psvm(String[] args){}
 5. String[]: String Array
 6. overload: define two functions with the same function name, but different arguments 
 7. 如果自己不定义一个构造函数，java会自行定义一个（输出null）。但若自己定义了，就不会了
 8. this: 自身的引用， java里都是引用。 
 9. object就是一块内存，给内存起很多名字，这些名字都指向同一个对象。
 10. all code in java must be part of a class.
 11. we delimit the beginning and end of segments of code using { and }
 12. All statements in Java must end in a semi-colon
 13. for code to run we need public static void main(String[])*/


/*14. This is easy to understand if you look at an example. 
For example, suppose you have a class House. 
Your own house is an object and is an instance of class House. 
Your sister's house is another object (another instance of class House).
15. package 最好是唯一的，利用域名的唯一性保证唯一性
16. 构造函数constructor不需要返回类型, 且名字需要和class名一样*/

/*1. Before Java variables can be used, they must be declared.
2. Java variables must have a specific type
3. Java variable types can never change
4. Tyoes are verified before the code even runs!!!
5. python is not so-called staticallly typed languages and can create variables nilly
6. functions must be declared as part of a class in Java. a function that is  part of a class
is called method, all functions are methods.
7. To define a function in Java, we use 'public static', we will see alternate ways of defining functions later.
8. ALl paramerters of a function must have a declared type, and the return value of the function must have a declared type.
Functions in Java return only one value
*/

/*
1. Java is an obkect oriented language with strict requirments:
every java file must contain a class declaration.
all code lives inside a class, even helper functions, global constants
to run java program, you typically define a main method using psvm(String[] args)
2. interface
3. The compiler checks that all types in your program are compatible before the program ever runs!
not like python, where type checks are performed during execution
4. Java is statically typed:
Good: 
	catches certain types of error, making it easier on the programmer to debug their code
	Type errors can (almost) never occur on the end user's computer
	make easier to read and reason about code
	code can run more efficiently.
Bad: 
	code is more verbose
	code is less general
*/


/*object oriented:
1. inherent, interface 继承
2. Polymorphism 多态
3. encapsulation 封装*/	

