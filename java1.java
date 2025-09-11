//there are 2 types functions and classes . classes is a collection of similar type of functions.objects are made from classes. to run the program it is necessary to create object of the classes.  but if i use static , i dont have to create object btw. static keyword is thus helpful. here public is access modifier. it says the class method can be accessed by anywhere.so use static-> dont have to be in any class. its now independent function .
// naming convension . classes -pascal convention. here the every word-.first letter->uppercase letter. used in classes.
//camel convension-camel case. first letter of first word is lowercase and first letter of next word is uppercase. used for functions
//like exAbcdEfgh
import java.util.Scanner;  //importing Scanner class from java.util package
import java.util.Random; //importing Random class from java.util packagebbnpublic class java1 {
   // public static void main(String[] args) {
        //now its time to create variables.
//they are of different types. int, float, double, char, boolean, string.
        //variable declaration rules->simialr as c++
        //int->default value is 0
        //char->2 bytes coz it supports unicode. it can store any character.
        //boolean->default value is false 
        //boolean->size depends on the JVM. it can be 1 bit or 8 bit or 16 bit.
        //string->it is a class. it is a collection of characters. it is immutable. it cannot be changed. it is not a primitive data type.
        //8 primitive data types in java->int, float, double, char, boolean, byte, short, long.
        //byte->8 bits. it can store values from -128 to 127.
        // System.out.println("Hello Apon");
        // int num1 = 10; //integer
        // int num2 = 20; //integer
        // int sum = num1 + num2; //addition
        // System.out.println(sum); //output the sum of num1 and num2
        // System.out.print("The sum of " + num1 + " and " + num2 + " is: " + sum); //output the sum with a message
        // //if i not use println, it will not go to next line.
        // System.out.println(); //to print a new line
        //lets go to java literals.
        //literals->a constant value which can be assigned to a variable.
        //there are 4 types of literals in java->integer literals, floating point literals, character literals, string literals.
        //integer literals->it can be decimal, octal, hexadecimal, binary.
        //int decimal = 10; //decimal literal
        //int octal = 012; //octal literal
        //int hexadecimal = 0xA; //hexadecimal literal
        //int binary = 0b1010; //binary literal
        //floating point literals->it can be float or double.
        //float floatNum = 10.5f; //float literal f is appended coz to identify it as a float literal
        //double doubleNum = 20.5; //double literal u can append d or not btw
        //character literals->it can be a single character or a unicode character.
       // char character = 'A'; //character literal
       // char unicodeCharacter = '\u0041'; //unicode character literal
       //string literals->it is a sequence of characters enclosed in double quotes.
       //String str = "Hello World"; //string literal
      // long num=1234567890L; //long literal, L is appended to identify it as a long literal
      //short num=12345; //short literal, no need to append anything
        //byte num=127; //byte literal, no need to append anything
        //boolean isTrue = true; //boolean literal, it can be true or false
        //now dive to user input
        //user input in java is done using Scanner class.
        //Scanner class is a part of java.util package. so we have to import it.
        // Scanner sc= new Scanner(System.in); //create a Scanner object
        // // System.in for any keyboard input
        // System.out.println("Enter first number: "); //prompt the user to enter their name
        // int firstNumber = sc.nextInt(); //read the first number from user input
        // System.out.println("Enter second number: "); //prompt the user to enter their name
        // int secondNumber = sc.nextInt(); //read the second number from user input
        // int sum1 = firstNumber + secondNumber; //calculate the sum
        // System.out.println("The sum is: " + sum1); //output the sum
        // char a=sc.next().charAt(0); //read a character from user input
        // System.out.println("The character is: " + a); //output the character
        // String str=sc.next(); //read a string from user input
        // String str = sc.nextLine(); //read a string from user input (nextLine reads the whole line)
        // System.out.println("The string is: " + str); //output the string
        // boolean isTrue = sc.nextBoolean(); //read a boolean from user input
        // System.out.println("The boolean is: " + isTrue); //output the boolean
        //float f=sc.nextFloat(); //read a float from user input
        //System.out.println("The float is: " + f); //output the float
        //double d=sc.nextDouble(); //read a double from user input
        //System.out.println("The double is: " + d); //output the double
        //byte b=sc.nextByte(); //read a byte from user input
        //System.out.println("The byte is: " + b); //output the byte
        //short s=sc.nextShort(); //read a short from user input
        //System.out.println("The short is: " + s); //output the short
        //long l=sc.nextLong(); //read a long from user input
        //System.out.println("The long is: " + l); //output the long
        // boolean istrue=sc.hasNextInt(); //check if there is a integer input
        // System.out.println("The integer input is: " + istrue); //output the integer input
        //java operators and expressions
        //operators are used to perform operations on variables and values.
        //there are 5 types of operators in java->arithmetic operators, relational operators, logical operators, bitwise operators, assignment operators.
        //arithmetic operators-> +, -, *, /, %, ++, --
        // int a = 10, b = 20;
        // int sum2 = a + b; //addition
        // System.out.println("The sum is: " + sum2); //output the sum
        // int difference = a - b; //subtraction
        // System.out.println("The difference is: " + difference); //output the difference
        // int product = a * b; //multiplication
        // System.out.println("The product is: " + product); //output the product
        // int quotient = a / b; //division
        // System.out.println("The quotient is: " + quotient); //output the quotient
        // int remainder = a % b; //modulus
        // System.out.println("The remainder is: " + remainder); //output the remainder
        // decimal modulo also tho not in c++
    //     double decimalNum = 10.5;
    //     double decimalRemainder = decimalNum % 3; //modulus with decimal number
    //     System.out.println("The decimal remainder is: " + decimalRemainder); //output the decimal remainder
    //     //increment and decrement operators
    //     int incrementNum = 5;
    //     incrementNum++; //increment operator
    //     System.out.println("The incremented number is: " + incrementNum); //output the incremented number
    //     int decrementNum = 10;
    //     decrementNum--; //decrement operator
    //     System.out.println("The decremented number is: " + decrementNum); //output the decremented number
    //     //relational operators-> ==, !=, >, <, >=, <=
    //    // int x = 10, y = 20;
    //    // boolean isEqual = (x == y); //equal to
    //     System.out.println("The result of 6==8 is: " + (6==8)); //output the result
        // boolean isNotEqual = (x != y); //not equal to
        // System.out.println("The result of 6!=8 is: " + isNotEqual); //output the result
        // boolean isGreater = (x > y); //greater than
        // System.out.println("The result of 6>8 is: " + isGreater); //output the result
        // boolean isLess = (x < y); //less than
        // System.out.println("The result of 6<8 is: " + isLess); //output the result
        // boolean isGreaterOrEqual = (x >= y); //greater than or equal to
        // System.out.println("The result of 6>=8 is: " + isGreaterOrEqual); //output the result
        // boolean isLessOrEqual = (x <= y); //less than or equal to
        // System.out.println("The result of 6<=8 is: " + isLessOrEqual); //output the result
        //logical operators-> &&, ||, !
        // boolean andCondition = (x > 5 && y < 30); //logical AND
        // System.out.println("The result of (x > 5 && y < 30) is: " + andCondition); //output the result
        // boolean orCondition = (x < 5 || y > 30); //logical OR
        // System.out.println("The result of (x < 5 || y > 30) is: " + orCondition); //output the result
        // boolean notCondition = !(x < y); //logical NOT
        // System.out.println("The result of !(x < y) is: " + notCondition); //output the result
        //bitwise operators-> &, |, ^, ~, <<, >>
        // int bitwiseAnd = x & y; //bitwise AND
        // System.out.println("The result of (x & y) is: " + bitwiseAnd); //output the result
        // int bitwiseOr = x | y; //bitwise OR
        // System.out.println("The result of (x | y) is: " + bitwiseOr); //output the result
        // int bitwiseXor = x ^ y; //bitwise XOR
        // System.out.println("The result of (x ^ y) is: " + bitwiseXor); //output the result
        // int bitwiseNot = ~x; //bitwise NOT
        // System.out.println("The result of (~x) is: " + bitwiseNot); //output the result
        // int leftShift = x << 2; //left shift
        // System.out.println("The result of (x << 2) is: " + leftShift); //output the result
        // int rightShift = x >> 2; //right shift
        // System.out.println("The result of (x >> 2) is: " + rightShift); //output the result
        //assignment operators-> =, +=, -=, *=, /=, %=
        // int assignNum = 10; //assignment
        // assignNum += 5; //addition assignment
        // System.out.println("The result of (assignNum += 5) is: " + assignNum); //output the result
        // assignNum -= 3; //subtraction assignment
        // System.out.println("The result of (assignNum -= 3) is: " + assignNum); //output the result
        // assignNum *= 2; //multiplication assignment
        // System.out.println("The result of (assignNum *= 2) is: " + assignNum); //output the result
        // assignNum /= 4; //division assignment
        // System.out.println("The result of (assignNum /= 4) is: " + assignNum); //output the result
        // assignNum %= 3; //modulus assignment
        // System.out.println("The result of (assignNum %= 3) is: " + assignNum); //output the result
        //now here it comes precendence of operators 
        //it works as similar like in c++ . so not going in details tho.
        //type casting in java
        //b+s=int s+i=int l+f=float d+f=double c+f=char b+f=byte s+f=short i+f=int c+i=int c+s=int f+d=double
        // String str= new String("Hello"); //creating a string object
        // System.out.printf("The string is: %s", str); //output the string using printf->most familiar in c++
        // System.out.println(); //to print a new line
        // System.out.format("The string is: %s", str); //output the string using format-> same as printf btw
        //now lets go to string methods
        //string methods->length(), charAt(), substring(), indexOf(), lastIndexOf(), toUpperCase(), toLowerCase(), trim(), replace(), split()
        // String str1= "Apon";
        // System.out.println("str1: " + str1.length()); //length of the string
        // System.out.println("str1: " + str1.charAt(0)); //character at index 0
        // System.out.println("str1: " + str1.substring(0, 2)); //substring from index 0 to 2
        // System.out.println("str1: " + str1.substring(2)); //substring from index 2 to end
        // System.out.println("str1: " + str1.indexOf('o')); //index of character 'o'
        // System.out.println("str1: " + str1.indexOf("po",3)); //index of substring "po" from index 3
        // System.out.println("str1: " + str1.lastIndexOf('o')); //last index of character 'o'
        // System.out.println("str1: " + str1.lastIndexOf("po", 3)); //last index of substring "po" from index 3 to the back
        // System.out.println("str1: " + str1.toUpperCase()); //convert to uppercase
        // System.out.println("str1: " + str1.toLowerCase()); //convert to lowercase
        // System.out.println("str1: " + str1.trim()); //remove leading and trailing spaces
        // System.out.println("str1: " + str1.replace('o', 'a')); //replace character 'o' with 'a'
        // System.out.println("str1: " + str1.replace("po","k")); //replace substring "po" with "k"
        // System.out.println(str1.endsWith("on"));
        // System.out.println(str1.startsWith("on"));
        // System.out.println(str1.contains("po")); //check if the string contains "po"
        // System.out.println(str1.isEmpty()); //check if the string is empty
        // System.out.println(str1.equals("Apon")); //check if the string is equal to "Apon"
        // System.out.println(str1.equalsIgnoreCase("apon")); //check if the string is equal to "apon" ignoring case
        //escape sequence characters in java
        //escape sequence characters-> \n, \t, \", \', \\ etc.
        // System.out.println("Hello\nApon"); //new line
        // System.out.println("Hello\tApon"); //tab space
        // System.out.println("Hello \"Apon\""); //double quotes
        // System.out.println("Hello \'Apon\'"); //single quotes
        // System.out.println("Hello \\Apon\\"); //backslash
        // //also for percent sign, we have to use double percent sign %%
        // System.out.println("Hello %%Apon%%"); //percent sign
        //switch case in java
        //it can be integer, string or character in java
        //switch case is used to execute one block of code among many blocks of code based on the value of a variable.
        //normal switch->similar to c++ but no need to use break statement in every case.
       //for enhanced switch case, we can use -> instead of : and no need to use break statement
        //switch (age) {
        //    case 18 -> {
        //        System.out.println("You are eligible to vote.");
        //        System.out.println("You can vote now.");
        //    }
        //    case 20 -> System.out.println("You are eligible to drive.");
        //    default -> System.out.println("You are not eligible for anything.");
        //}
        //now its time to random function in java 
        //random function is used to generate random numbers.
        // Random rand= new Random(); //create a Random object
        // //generate random numbers
        // int randomNum=rand.nextInt(100); //generate random number between 0 and 99
        // System.out.println("Random number: " + randomNum);
        // //we can also generate random number between a range
        // int min=10, max=50; //define the range
        // int randomInRange = rand.nextInt(max-min+1)+min; //generate random number between min and max
        // System.out.println("Random number between " + min + " and " + max + ": " + randomInRange); //output the random number in range
        // //we can also generate random float and double numbers
        // float randomFloat=rand.nextFloat(); //generate random float number between 0.0 and 1.0
        // System.out.println("Random float number: " + randomFloat); //output the random float number
        // double randomDouble=rand.nextDouble(); //generate random double number between 0.0 and 1.0
        // System.out.println("Random double number: " + randomDouble); //output the random double number
        // //we can also generate random boolean value
        // boolean randomBoolean=rand.nextBoolean(); //generate random boolean value
        // System.out.println("Random boolean value: " + randomBoolean); //output the random boolean value
        //now lets go to java control statements
        //there are 3 types of control statements in java->selection statements, iteration statements, jump statements.
        //in while only boolean supports not like in c++ it will support the 1 or any integer value.
        //lets go to the array in java
        //array is an object in java. it is a collection of similar type of elements.
        //array declaration syntax-> dataType[] arrayName = new dataType[size];->different from c++ tho->process 1
        // int [] arr= new int[5]; //declare an array of size 5
        // char [] charArr= new char[5]; //declare a character array of size 5
        // String [] strArr= new String[5]; //declare a string array of size 5
        // int [] marks;
        // marks = new int[5]; //declare an array of size 5
        // //array initialization syntax-> arrayName[index] = value;->process 2
       // System.out.println(marks.length); //output the length of the array
       //for(intelement:marks){ //for each loop to iterate through the array
         //     System.out.println(element); //output the element
         //}
         //lets go to multidimensional array in java
         //int [][]arr2d= new int[5][4]; //declare a 2D array of size 5x4
            //int [][]arr2d= {{1,2,3},{4,5,6},{7,8,9}}; //declare and initialize a 2D array
       //arr2d.length; //output the number of rows in the 2D array 
       //arr2d[i].length; //output the number of columns in the ith row of the 2D array
       //Math.floorDiv(10, 3); //floor division in java
         //Math.floorMod(10, 3); //floor modulus in java
    //      int z= add(5,10);
    //    System.out.println(z);    
    //     //way 2 for calling method
    //     java1 obj = new java1(); //create an object of the class this is how we create an object in java
    //     int diff = obj.difference(10, 5); //call the difference method using the object now we can do this not using static keyword as it is not a shared method
       
//    }
         //lets go for methods in java
         //method->functions written inside a class. it is a block of code that performs a specific task.
            //method declaration syntax-> returnType methodName(parameterList) { //method body }->process 3
            //example
            // public static int add(int a, int b) {//method to add two numbers we can only call static methods in main method that is why we have to make this static
            //     return a + b;//static is shared by all the objects of the class. so we can call this method without creating an object of the class.
            // }
            // int difference(int a, int b) { //method to find the difference between two numbers
            //     return a - b;
            // }
            //now its time for method overloading in java
            //method overloading->it is a feature in java where we can have multiple methods with the same name but different parameter lists.
            //it is used to perform similar operations with different data types or different number of parameters.}
            //reference passed=object is passed to the method. so if we change the value of the object in the method, it will change the value of the object in the main method.
            //method overloading example
            // public static int add(int a, int b) { //method to add two integers
            //     return a + b; //return the sum of two integers
            // }
            //differnce between parameter and argument->parameter is the variable in the method declaration and argument is the value passed to the method when it is called.
            //method overloading becomes sucessful when we have different parameter lists.
            //method overloading wont work if same name function has different return type .
            //method overloading-.same return type, same name, different parameter list.
            //introduction to variable arguments in java
            //variable arguments->it is a feature in java where we can pass variable number of arguments to a method.
            //tbh we use thismethod when number of arguments is not fixed btw we can pass any number of arguments to the method.
            //public static int add(int... numbers)
            //{for(int number:numbers){ //method to add variable number of integers -> sum+=number; //add each number to the sum
            //} { //method to add variable number of integers
            //... //numbers is an array of integers
            // simialr like (int [] numbers) but here we can pass any number of arguments to the method
            //add(7,8,9,10,.....) //call the method with variable number of arguments
            //add()->call the method with no arguments->kinda like empty array
            //add(7,8,9)->call the method with 3 arguments
//}
