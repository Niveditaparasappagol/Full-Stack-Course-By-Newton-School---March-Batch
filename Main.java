wDate : 28th March 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:
- Introduction: DONE
- Intro to Java: DONE
- Installation: DONE

- Variables and Constants
- Basics of Programming


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".









- Introduction: DONE

Competitive Programming:

- Topcoder World Finalist 2021
- Google Kick Start, Facebook Hacker Cup: World Semifinalist


- Twitch
- Youtube

Google: "DEVANG SHARMA"






Intro About Students:

(1) Name, Place: INDIA

(2) Graduation (Course), Pass Out

Bsc, B-Tech, MCA, BCA, BA, BBA, B.Com, B.Voc

(3) Current Professional: 

(4) Why you want to Join Tech ?









- Intro to Java:

Windows: cmd ---> java -version


Mac: Terminal --> java -version


Linux: Terminal ---> java -version

How to Install - DONE


java -version: SUCCESS








Java:


16 Billion Devices:

95% of Top 500 Fortune Companies: Codebase in Java




James Gosling: JAVA - 1991

Sun Microsystems ---> Oracle (JAVA)

 
Ram, Shyam

Computer A: RAM

Code --> Machine Code (Byte Code)


Computer B: SHYAM

Code 

Problem: "Code Written Once Cannot Be Used Anywhere Else"


Solution: "Write Once, Run Everywhere"

- Platform Independent









2 Things Required to Run Code in Different Machine:

(1) Java Compiler
(2) Machine Code


File: Main.java --> Byte Code (Main.class)

Compiler--> Understand Java



Installed JDK: Java Development Kit

JDK = JVM + JRE

JVM = Java Virtual Machine (Java Compiler)
JRE = Java Run-time Environment 



javac Solution.java: Compile - Empty Line - Successful --> Solution.class (Machine Code)

java Solution: RUN - Output 

















Date : 29th March 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:
- Revision: DONE
- Doubts: Assignments: DONE
- Decoding First Java Code: DONE
- Variables and Constants: DONE
- Data Types: DONE

- Operators
- Loops


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".








---> Understanding FIRST JAVA Code:


public class Main {
    public static void main(String[] args) {
    System.out.println("Hello, Devang");
    }
}


(1) Name of Public Class MUST be EQUAL to Filename

public class Main ---> Main.java

public class Solution ---> Solution.java

public class Devang ---> Devang.java

(2)  public static void main(String[] args) {

main Function - DO NOT MODIFY this


(3)     System.out.println("Hello, Devang");


Whatever is given inside System.out.println() --> Will be printed AS IT IS


System.out.println("Hello, Devang"); ---> Hello, Devang

System.out.println("Hello, Newton"); ---> Hello, Newton






System: System Running your Code -> IDE/Terminal/Online Editor (Environment)
out. : Output
println: Print On Next Line

print: Print On Same Line













-----> Variables and Constants


Practical Understanding:

Name: Constant
Roll Number: Variable


Theoretical Understanding:

Both Variables and Constants are Use to Store data.

Variables: Changes Value

Constants: Cannot change value



CODE:



public class Main {
    public static void main(String[] args) {
        
    // Variable        
    int a = 10;
    System.out.println("Value of a is: " + a);
    
    a = 20; // Value Changed - Any Number of Times
    System.out.println("New Value of a is: " + a);
        
        
    // Constant
    // const int a = 25; - CPP, Py, Go, Perl
    final int p = 25;
    System.out.println("Value of p is: " + p);
        
    //p = 20; // Value Changed - Any Number of Times
    //System.out.println("New Value of p is: " + p);
        
    }
}






--> Size in Programming:


Computer: 0 or 1 (Binary/ Bits)

0/1: 1 Bit of Data - Smallest Unit
1 Nibble = 4 Bits (1111)
1 Byte = 8 Bits (1111111)
1 KB = 1024 Bytes (2^10)
1 MB = 1024 KB
1 GB = 1024 MB
1 TB = 1024 GB (TerraByte)
1 PB = 1024 TB (PentaByte)
1 ZB = 1024 PB (ZettaByte)










----> Data Types


Data Type is Identity of Any Variable or Constant
- It tells what kind of values it can store.

int a= 10; - CORRECT

int a= "hello"; - INCORRECT





2 Types:

(1) Primitive Data Types


Number(4), Decimal(2), Character(1), Boolean(1)

(A) Character: 2 Bytes 

Other Languages: 1 Byte in Memory (C, C++, Py, Perl, Go)
Java Language: 2 Byte in Memory

char: 'a'-'z', 'A'-'Z', 0-9, ',', ';' '!', special character  etc

Eg: 
char a ='a'; - CORRECT
char a ='abcd'; - INCORRECT


char: ASCII Code: 0-255

a: 97
z: 122

A: 65
Z: 90


(B) byte: 1 Byte (-2^7 to 2^7-1) = -128 to 127

(C) short: 2 Byte (-2^15 to 2^15-1)

(D) int: 4 bytes (-2^31 to 2^31-1) (-2 Bn to +2Bn)

(E) long: 8 bytes (-2^63 to 2^63-1)

(F) float: 4 bytes (4 Digits Precision)

(G) double: 8 bytes (8 Digits Precision)

(H) boolean: true/false (0/1): 0: false, 1: true : 1 bit



byte a = 10; - CORRECT (Within Range)

byte a = 1000; - INCORRECT (Beyond Range)


short a = 1000; - LESS Memory




100.25

Number = 100
Decimal= 0.25


float a = 223.25
In Memory, a = 223.2500 (4 Digits Precision)

double a = 223.25
In Memory, a = 223.25000000 (8 Digits Precision)














---> Formula to Calculate Range:

Size in Bytes * 8 = Size in Bits = N

Range = -2^(N-1) to 2(N-1)-1



Eg:
int: 4 Bytes = 32 Bits = N
Range = -2^31 to 2^31-1



0 / 1 -> 2 Ways 

_ _ _ _ 

Total Number of Ways = 2 * 2 * 2 * 2 = 2^4 Ways


int: 4 Bytes = 32 bits

_ _ _ _ ......... 32 

Total Number of Ways =  2^32 Ways

1 Bit is Reserved for Negative Values
















(2) Non-Primitive Data Types/User Defined


- String
- Array
- Interfaces





CODE:

public class Main {
    public static void main(String[] args) {
        char a = 'a';
        int i = 10;
        float c = 12.5f; // 12.5000
        double d = 32.5; // 32.50000000
        long l = 1000L;
        Boolean b = true;
        short h = 5;
        
System.out.println(a + " " + i + " " + c + " "+ d + " " + l + " " + b + " " + h);
        
    }
}




OP:

a 10 12.5 32.5 1000 true 5











Date : 30th March 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:
- Revision: DONE
- Doubts: Assignments: DONE
- Decoding First Java Code: DONE
- Variables and Constants: DONE
- Data Types: DONE
- How to Take Input from User in Java: DONE
- Assignment: DONE

- Operators
- Loops


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".










----> How to Take Input from User in Java ?


(1) Using Scanner Class
(2) Using Buffered Reader



---> Using Scanner Class:



packages
    - modules 
        - classes/interfaces


package = collections of modules
module  = collections of classes


java : package


- io (input output) (Modules)
    - bufferedreader
    - customreader
    - filereader

- util (utility)
    - scanner (FOCUS)
    - apiexception
    - collections
    - collections framework
    - comparator
    - list
    - map
    - math

- exceptions
    - Arithemetic
    - nullpointer



How to Use a Class:

import package.module.class

import java.io.*;
- Select All Classes inside io module of java package

import java.util.*;
- Select All Classes inside util module of java package



Take Input from User:



IP: 5
OP: 10


IP: n
OP: 2*n



Scanner Class


Scanner sc = new Scanner(System.in);

Scanner = Class
sc = Object of Scanner Class


System.in: Take Input from System (Environment)

System.out : Print Output to System (Environment)


Class obj;


Class: Blueprint
obj: Actual Instance


Class: Cars
object: BMW/Mercedes/Tesla/Audi...



NOTE:

In Programming,
a = b;

Meaning: RIGHT TO LEFT
b is assigned to a.

Eg: 

int a = 10;

Reading: "10 is Assigned to a"


int a = 10;
int b = 20;

a = b;

Meaning: b is Assigned to a



CODE:

(1) How to take 1 Integer - DONE
(2) How to take Multiple Integers - DONE



import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 10    
        int b = sc.nextInt(); // 20
        int c = sc.nextInt(); // 30


        OR

        int a,b,c;
        a = sc.nextInt(); // 10    
        b = sc.nextInt(); // 20
        c = sc.nextInt(); // 30


        System.out.println(a + " " + b + " " + c);
    }
}




IP:
10 20 30 

OP:
10 20 30


(3) How To Take Multiple Data Types

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 10
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        String s = sc.next();
//        String s = sc.nextLine();


        System.out.println(a + " " + l + " " + f + " "+ d + " " + s);
    }
}


IP:
10 10000 12.5 32.50 
devang

OP:
10 10000 12.5 32.50 devang



---> Take Character Inputs:

        String s = sc.next(); // devang --> d:0,e:1,v:2,a:3,n:4,g:5
        char first = s.charAt(0); // d
        char second = s.charAt(1); // e
        char third = s.charAt(2); // v

        System.out.println(first + " " + second + " " + third);

IP:
devang

OP:
d e v



sc.nextLine(); - "devang sharma"
sc.next(); - "devang"

devang sharma







Assignment - 2: Doctor Clinic

Problem Statement

Given two positive integers N and X, where N is the number of total patients and 
X is the time duration (in minutes) after which a new patient arrives. 
Also, doctor will give only 10 minutes to each patient. 
The task is to calculate the time (in minutes) the last patient needs to wait.

Input
The first line of input contains the number of test cases T. The next subsequent lines denote the total number of patients N and time interval X (in minutes) in which the next patients are visiting.

Constraints:

1 <= T <= 100
0 <= N <= 100
0 <= X <= 30
Output


Output the waiting time of last patient.
Example


Input:
5
4 5
5 3
6 5
7 6
8 2

Output:

15
28
25
24
56


Test Case-1:

4 5


Number of patients = N = 4


A B C D


Time for Each patient = X = 5


A: 10-5 = 5
B: 10-5 = 5
C: 10-5 = 5

D to wait = 15 Mins


Test Case-2:

5 3


Number of patients = N = 5

A B C D E

Time for Each patient = X = 3

A: 10-3 = 7
B: 10-3 = 7
C: 10-3 = 7
D: 10-3 = 7

E to wait = 28 Minutes


Ans = (10-X)*(N-1)



Case: X >= 10
Ans = 0

X = 12
10-X = -2


Final Ans:

if (x>=10)
ans = 0;
else
ans = (10-x) * (n-1)













Date : 31st March 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:
- Revision: DONE
- Doubts: Assignments: DONE
- Decoding First Java Code: DONE
- Variables and Constants: DONE
- Data Types: DONE
- How to Take Input from User in Java: DONE
- Assignment: DONE

TODO:
- Operators
- Assignment Questions
- Loops

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".

















------> Operators

(1) Mathematical Operators:


+: Addition
-: Subtraction
*: Multiplication
/: Division (Quotient)
%: Modulus (Remainder)


Long Division Method:

12 = 7*1 + 5

D = d*q + r

D: Dividend : 12
d: Divisor: 7
q: Quotient: 1
r: Remainder: 5


50/7 = 7 (Quotient)
50%7 = 1 (Remainder)



Operator Overloading:

One Operator behaves differently with different data types.


Eg:

+:

int: Add the Numbers
String: Concatenate/Merge the String



5 + 2 = 7 : Add
"dev" + "ang" = "devang": Merge/Concatenate


"": String
'': Character



CODE:



import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // *, +, -, / - Binary Operators: 2 Operands
        // % 

        int c = a + b;
        int d = a * b;        
        int e = a - b;        
        int f = b/a;  
        int g = b%a;
      // 20 = 10*2 + 0(Rem)
        g = a%b;
    // 10 = 20*0 + 10(Rem)
     
System.out.println(c + " " + d + " " + e + " " + f + " " + g);
        
    }
}


10 % 20 = 10, 20>10 
n % p = n, p>n


p = 45
n = 12

12 = 0*45 + 12

12 % 45 = 12





(2) Relational Operators: true/ false


<  : Less Than
>  : Greater Than
<= : Less Than Or Equal To
>= : Greater Than Or Equal To
== : Equal To
!= : No Equal To



Note:

In Programming,

= : Assignment
== : Equality
!= : Inequality


CODE:

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println(a<b); // 10<20: true
        System.out.println(a>b); // 10>20: false
        System.out.println(a==b); // 10 == 20: false
        System.out.println(a!=b); // 10!=20: true

    }
}


OP:

true
false
false
true







(3) Logical Operators:

&&: AND
||: OR
! : NOT



AND: Both Must be True

true && true = true
true && false = false
false && true = false
false && false = false


CODE:

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println(a<b && a<5); 
        // 10<20: true && 10<5: false
        // true && false: false
        
        System.out.println(a<b && a>5); 
        // 10<20: true && 10>5: true
        // true && true: true    
    }
}


OP:

false
true



OR: Even One is True

true || true = true
true || false = true
false || true = true
false || false = false



CODE:

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println(a>b || a<5); 
        // 10>20: false || 10<5: false
        // false || false: false
        
        System.out.println(a<b || a<5); 
        // 10<20: true || 10<5: false
        // true || false: true    
    }
}



OP:

false
true






NOT:

!0 = 1
!1 = 0


CODE:

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        boolean b = true, c = false;
        
        System.out.println(!b); 
        // !true = false

        System.out.println(!c); 
        // !false = true
    
    }
}



OP:

false
true





(4) Unary Operators


Unary: Unit: One Operand


Pre-Increment/Decrement:

Increases/Decreases the value by 1 BEFORE and then Use it

int a =10;
++a; // 11
--a; // 10


Post-Increment/Decrement:

Use it and THEN Increases/Decreases the value by 1 

int a = 10;
a++; // 11
a--; //10




Difference:

int a = 10;
int c = a++ + ++a;
System.out.println(c);

OP: 22

a++ (10) ---->11

+ 

++a; (11--->12)




int a = 10;
int c = ++a + a++; // 11 + 11
System.out.println(c);
System.out.println(a); // 11-->12
        

OP:
22
12        


----> Loops



Q: WAP to Take Input of 10 Integers

Solution:

Scanner s = new Scanner(System.in);

int a = s.nextInt();
int b = s.nextInt();
int c = s.nextInt();
int d = s.nextInt();

.... 10 Times




LOOP: 
Same Thing on Repetition


Movie: Inception, Edge of Tomorrow


(1) For Loop - ENTRY BASED LOOP


for (initilisation ; condition ; increment/decrement)
{
    // Code to be executed
}


Flow of For Loop:

(1) initilisation: ONLY ONCE AT THE BEGINNING
(2) condition Check: 
- Pass: Enter Loop
- Incorrect: Exit Loop

(3) After Entering Loop
(4) increment/decrement
(5) Step 2 and repeat


i++ or ++i = i = i+1: Increment the Value By 1
i-- or --i = i = i-1: Decrement the Value by 1

i+=k : i = i+k: Increment the Value By k
i-=k : i = i-k: Decrement the Value By k



    int i;
    for (i=0; i<10; i++)
    {
    System.out.print(i + " ");
    }

System.out.println(i); // 10



OP: 

0 1 2 3 4 5 6 7 8 9


for (i=0; i<10; i++) - 10 Times

for (i=0; i<N; i++) - N Times











    int i;
    for (i=0; i<=10; i++)
    {
    System.out.print(i + " ");
    }

    System.out.print(i); // 11


OP: 0 1 2 3 4 5 6 7 8 9 10






int i=1;
for (; i<10; i++)
{
    System.out.print(i);
}

OP: 1-9



for (int i=1; ; ++i)
{
    System.out.print(i);    
}


OP: 1 2 3 4 5 6 7 .......Infinite

OP in Compiler: TLE



for (int i=1; i<10; )
{
    System.out.print(i);    
}

OP: 1 1 1 1 1 1....infinite



int i = 5;
for ( ; ; )
{
    System.out.print(i);        
}

OP: 5 5 5 5 5 5 5....infinite


for (int i=10; i>=0; i--)
{
    System.out.print(i);            
}

OP: 10-0












(2) While Loop: Entry based Loop


while (codition)
{
    Code to be executed
    increment/decrement
}




int i = 1;
while (i<10)
{
    System.out.println(i);
    i++;
}

System.out.println(i); //10


OP: 1 2 3 4 5 6 7 8 9






int i = 1;
while (i<=10)
{
    System.out.println(i);
    i++;
}

System.out.println(i); //11


OP: 1 2 3 4 5 6 7 8 9 10






int i = 1;
while ()
{
    System.out.println(i);
    i++;
}


OP: 1 2 3 4 5 6 7 8 9 10.....infinite - TLE




int i = 1;
while ()
{
    System.out.println(i);
}


OP: 1 1 1 1 1 1.....infinite




for, while - Entry Based Loop





(3) Do While Loop: Exit Based Loop

do
{
    body
    increment/decrement
} while(condition);


int i = 1;

do{
    System.out.println(i);
    i++;
} while (i<10);

OP: 1 2 3 4 5 6 7 8 9



int i = 1;
do{
    i++; // 9-->10
    System.out.println(i);
} while (i<10);



OP: 2-10




int i=1;
do{
    i = 1000;
    System.out.println(i);    
} while (i<10);
// 1000<10: FALSE

OP: 1000





























-----> Take Multiple Input as per Test Cases:


(A) Only 1 Test Case:

IP: 1 2

Scanner s = new Scanner(System.in);
int a = s.nextInt(); // 1
int b = s.nextInt(); // 2



(B) Take 5 Times Input for Test Cases:


5
1 2
3 4 
5 6
7 8


Scanner s = new Scanner(System.in);

for (i=0; i<5; i++)
{
int a = s.nextInt(); // 1
int b = s.nextInt(); // 2
}

Memory: 40 Bytes


More Efficient:


Scanner s = new Scanner(System.in);
int i,a,b; // 12 Bytes

for (i=0; i<5; i++)
{
a = s.nextInt(); // 1
b = s.nextInt(); // 2
}


(C) Take N Times Input for Test Cases:

5
1 2
3 4 
5 6
7 8
9 10

CODE:

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {    

Scanner s = new Scanner(System.in);
int tc = s.nextInt(); //5
int i,a,b; 

for (i=0; i<tc; i++)
{
a = s.nextInt(); // 1, 3, 5, 7, 9 
b = s.nextInt(); // 2, 4, 6, 8, 10

System.out.println(a + " " + b);
}


        
    }
}











Date : 1st April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:

✅ Drive students to Mentor Session just after your session

✅ Entrance Contest Dump


Time: 3 PM - 4 PM IST

- 3 coding ques
- 15 MCQ's
- Topics: Datatypes, loops, arithmetic options



Doubt Session: 11 AM - 12 PM IST





Starts at 3 PM, Saturday tomorrow
-Duration - 1hr
-3 coding ques
-15 MCQ's
-Topic covered - Datatypes, loops, arithmetic options  (overall topics covered in Trial class)
Mandatory to attend! For getting eligible for next steps

✅ They have doubt session tomorrow from 11 AM -12 PM for doubt resolutions on topics which is helpful for contest



- Operators: DONE
- Assignment Questions
- Loops: DONE

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




byte c = 127+1-1: DONE


If - Else:


if (condition)
{

}
else
{

}



Nested If-Else:


if (condition 1)
{

}

else if (condition- 2)
{

}


else





Switch:


Q: Dice Example

 1-6: True, Else: False


CODE:

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Dice Example
        // 1-6: True, Else: False
        
    Scanner s = new Scanner(System.in);
    int num = s.nextInt(); 
    String ans = "FALSE"; - TO MAKE ELSE OPTIONAL
       
        if (num>=1 && num<= 6)
        {
            ans = "TRUE";
        }
        else - NOT REQUIRED
        {
            ans = "FALSE";
        }
        
        System.out.println(ans);
    }
}



















Topics: Datatypes, loops, arithmetic options


Even or Odd:

Q: Input : Number
OP: Odd or Even



TC-1:

3
4
5
6

OP:

EVEN
ODD
EVEN




Condition -> Diff OP ---> If-Else


Concept: 
- Take Multiple Input Test Cases : DONE
- If Else
- Arithmetic Operators




import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int tc = s.nextInt(); 
int num, i=0; 
String ans = "ODD";

    for (i=0; i<tc; i++)
    {
        num = s.nextInt(); 
        if (num % 2 == 0)   
        {
        ans = "EVEN";
        }
        
        else
        {
        ans = "ODD";    
        }

    System.out.println(ans);
    }
    
    }
}






Even: Divisible by 2

%: Remainder
Modulus 0 means Completely Divisible

6%3 = 0

12%2 = 0


num % 2 == 0 --> Even
else Odd









Q: Fizzbuzz


num % 3 == 0: Newton 

num % 5 == 0: School

num % 3 && num % 5  == 0: NewtonSchool
OR
 num % 15 == 0: NewtonSchool

Else: Number


OP:

1: 1
3: Newton
5: School
15: NewtonSchool


num = 20

if(num > 30)
{

}

else if()
{

}

else if()
{

}

else
{

}    


Solution: Always Follow in Decreasing Order (15 -> 5 -> 3)




--- Why Increasing Order Gives Incorrect Answer?

15: Newton


if (num % 3 == 0)
{

}

else if (num % 5 == 0)
{


}

else if (num % 15 == 0)
{


}








--- Why Decreasing Order Gives Correct Answer?



15: NewtonSchool
5

if (num % 15 == 0)
{

}

else if (num % 5 == 0)
{


}

else if (num % 3 == 0)
{


}
















Date : 4th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:


- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







Functions:
A piece of Code which is used to perform a "SPECIFIC TASK"


Why?

- Better Modularity: Modules
- Easier Implementation
- Avoid Single Point of Exceptions



Syntax:

[return type] name (parameters)
{
    body
    return value;
}



(): Functions
[]: Arrays


CODE:

// "static void main" must be defined in a public class.
public class Main {
    
static int add(int a, int b) //-- FUNCTION DEFINITION
{
    int c = a+b;
    return c;
}

static int subtract(int a, int b)
{
    int c = a-b;
    return c;
}
    
static void printvalues(int a, int b, String name)
{
    System.out.println(a + " " + b + " " + name);
}
    
    public static void main(String[] args) {
        int c = add(2,4); //6 - FUNCTION INVOKATION/CALLING
        System.out.println(c);
        System.out.println(add(20,40)); // CALL MUTLTIPLE TIME- REUSABILITY
        System.out.println(add(c,80)); // PASS VARIABLE TO FUNCTION
        
        System.out.println(subtract(4,2));
        printvalues(2,4,"devang");
        
    }
}















Amazon/Flipkart:


- Search
- Add to Cart
- Buy
- Payment


Example:

Jacket:

Search: Sucess
Add to Cart: Success
Buy: Success

Payment: Not Completed



























Date : 5th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions
- Nested Loops
- Pattern Printing: TEMPLATE
- Switch Case
- Intro to DSA
- Arrays

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".






------> Assignment Questions





Floor: Bottom
Ceil: Top

Programming -- English


-5 -4.5 -4 -3 -2 -1 0 1 2 3 4 4.5 4.9 5


Floor: below: Nearest Left Integer on the Number Line/ Nearest Smaller Integer Value


floor(4.5) = 4
floor(4.9) = 4 
floor(4.1) = 4
floor(4) = 4 


floor(-4.5) = -5
floor(-4.9) = -5
floor(-4.1) = -5
floor(-4) = -4


CODE:
Math.floor(4.5) = 4

Floor(a) = a, a = int, BOTH POSITIVE and NEGATIVE

floor(4) = 4
floor(-4) = -4

int a = 2.9;
System.out.println(a); //2

Decimal:

(1) Positive : floor = Integer Value
(2) Negative : floor = Integer Value-1


floor(-4.5) = -4-1= -5






-5 -4.5 -4 -3 -2 -1 0 1 2 3 4 4.5 4.9 5

Ceil: top: Nearest Right Integer on the Number Line/ Nearest Larger Integer Value



ceil(4.5) = 5
ceil(4.9) = 5
ceil(4.1) = 5
ceil(4) = 4


ceil(-4.5) = -4
ceil(-4.9) = -4
ceil(-4.1) = -4
ceil(-4) = -4


Ceil Values:


CODE:
Math.ceil(4.5) = 5


(1) Integers

ceil(a) = a, BOTH and NEGATIVE

(2) Decimal

- Positive: ceil value = Int value + 1
- Negative: ceil value = Int value






Type Casting:

- String to Integer
- Integer to String



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) 
    {
        int a =10;  
        String ans ="devang";
        //System.out.println(ans.length());
        
        // Integer to String
        ans = String.valueOf(a); // 10 --> "10"
        System.out.println(ans);
           // "10" --> '1' and '0'
       //System.out.println(ans.length());
        
        // String to Integer
        a = Integer.parseInt(ans); // "10" --> 1
        System.out.println(a);       
    }
}













Date : 6th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE

- Assignment Questions
- Nested Loops
- Pattern Printing: TEMPLATE
- Switch Case

- Intro to DSA
- Arrays

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
















-> Nested Loops








int ans = p/q;



q---> Smaller

ans ---> Larger


p = 20- Constant

q = 10

ans = 20/10 = 2

q = 2

ans = 20/2 = 10


ans = p/q, q--->0: ans --> Infinity

ans = p/q, q =0, ans: Undefined






MCQ Exam
View Solution
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has an MCQ exam containing 100 questions this sunday but she isn't prepared. She came to know that in her exam
- >P number of Questions will have A as the correct option
- >Q number of Questions will have B as the correct option
- >R number of Questions will have C as the correct option
- >S number of Questions will have D as the correct option
Sara doesn't know the order of the questions. If Sara filled the MCQs optimally using the above information what will be the maximum of minimum marks she can get.
Input
The input contains 4 integers P, Q, R, and S.

Constraints:-
0 <= P, Q, R, S <= 100

Note:- P + Q + R + S will always be 100
Output
Print the maximum marks Sara can get.
Example
Sample Input:-

8 10 20 62

Sample Output:-
62



Ans = Max(8,10,20,62) = 62

import java.util.*;


util 
 - Math




Maximum of N Numbers


For Two Numbers:

(1) int ans = Math.max(2,3) = 3

2 Values: Math.max(1,2) = 2 
3 Values: Math.max(Math.max(1,2),3) = Math.max(2,3) = 3
4 Values: Math.max(Math.max(Math.max(1,2),3), 4)


(2) Nested if -else (For Small N)

(3) Use For Loops:


-2 Bn ..................... +2 Bn
INT_MIN                     INT_MAX


int ans = Math.INT_MIN; //-2 Bn

1,2,3,4
Maximum = Greater than All Other Values


for (i=0; i<4; i++)
{
    ans = Math.max(num, ans); // ans = 1->2->3->4: Final
}


ans = max(1, -2 Bn) = 1
ans = max(1,2) = 2
ans = max(2,3) = 3
ans = max(3,4) = 4




max(-2, INT_MIN) = -2

max( any integer, INT_MIN) = any integer









Minimum of N Numbers








Q: Finding roots

View Solution
Time Limit: 2 sec

Memory Limit: 128000 kB

Problem Statement
Write a program to find roots of a quadratic equation using switch case.
Input
The first line of the input contains the three float values a, b, and c of equation ax^2 + bx + c.

Constraints
1<= a, b, c <= 50
Output
Print the two roots in two different lines and for imaginary roots print real and imaginary part of one root with (+/- and i )sign in between in one line and other in next line. For clarity see sample Output 2.

Note Imaginary roots can also be there and roots are considered upto 2 decimal places.
Example
Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25 + i2.22
-0.25 - i2.22







Solution:


D = b^2-4*a*c

D = 0, Real and Equal Roots
D > 0, Real and Unequal Roots
D < 0, Imaginary Roots














Switch Case:



switch(condition)
{
case A:
        ____
        break;

case B: 
       ____
        break;

case C: 
    ___       
        break;



.......



default: 
        ___    
}





CODE:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) 
    {
     int val = 10;

switch(val)
{
case 1: 
    System.out.println(1);
    break;
case 2: 
    System.out.println(2);
    break;
case 3: 
    System.out.println(3);
    break;
case 4: 
    System.out.println(4);
    break;
default:
    System.out.println(0);    
}

    }
}



- Use of Default
- Without Break
- No Pretraversal (second condtion matched, previous conditions wont be matched)
















-----> Nested Loops:


int i=0;
for (i=0; i<3; i++)
{
    System.out.println(i);
}


for (i=0; i<3; i++)
{
    System.out.println(i);
}

OP: 0 1 2 0 1 2





Nested Loop -- Loop Inside Loop

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) 
    {
        int i=0, j=0;
        for (i=0; i<3; i++) // i = 0, j=0 -- i =1
        {
        for (j=0; j<3; j++) // i =0, j =0 --- i=0,j=1 --- i=0,      j=2 
            {
        System.out.println(i + " " + j);
            }
        }

    }
}


OP:

0 0
0 1
0 2

1 0
1 1
1 2

2 0
2 1
2 2





Total Iterations = 3*3 = 9 Times



int i=0,j=0;
for (i=0; i<p; i++) -- P Times
{
    for (j=0; j<q; j++) -- Q Times
    {
        s.o.p(i,j);
    }
}


Total: P*Q Times


0 to N-1 == 1 to N




int i=0,j=0;
for (i=0; i<p; i++) -- P Times
{
    while (j<q) - Q Times
    {
        s.o.p(i,j);
        j++;
    }
}


Total: P*Q Times


int i=0,j=0,k=0;

for (i=0; i<p; i++) -- P Times
{
    for (j=0; j<q; j++) -- Q Times
    {
       for (k=0; k<r; k++) -- R Times
       {
        s.o.p(i,j,k);
       }
    }
}


Total: P*Q*R













Date : 7th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 1 & 2

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE

- Intro to DSA
- Arrays

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".












Q-1: Pattern Printing:



N = 5 

*****
****
***
**
*



N = 6

******
*****
****
***
**
*


Template: (N = 5)


Row = 1, Col = 5  1+5 = 6 
Row = 2, Col = 4  2+4 = 6
Row = 3, Col = 3  3+3 = 6
Row = 4, Col = 2  4+2 = 6 
Row = 5, Col = 1  5+1 = 6 




TWO LOOPS:

First Loop: Outer Loop: Row

for (i=0; i<5; i++) 


Second Loop: Inner Loop: Col

for (j=0; i+j<5; j++)




for (i=0; i<5; i++)  i = 0
{
    for (j=0; i+j<5; j++) i =0, j=0 ---> i =1, j=0
    {
        System.out.println(i, j);
    }
}


Condition: i + j < 5

i = 0
j = 0,1,2,3,4 (5 Times)

i = 1
j = 0,1,2,3  ( 4 Times)

i = 2
j = 0,1,2  ( 3 Times)

i = 3
j = 0,1  ( 2 Times)



---> Decreasing Pattern: Col Decreases


CODE:


// "static void main" must be defined in a public class.
public class Main {
    
    public static void pattern(int n)
{
        int i=0, j=0;
        
        for (i=0; i<n; i++) 
    {
        for (j=0; i+j<n; j++)
        {
        System.out.print("* ");
        }
        System.out.println("");
    }
}
    
    public static void main(String[] args) {
       pattern(5);
       //pattern(6);

    }
}



















Q-2: Pattern Printing:

N = 5 

*
**
***
****
*****

N = 6

*
**
***
****
*****
******


Template: (N = 5)

Row = 1, Col = 1  i == j
Row = 2, Col = 2  i == j
Row = 3, Col = 3  i == j
Row = 4, Col = 4  i == j
Row = 5, Col = 5  i == j



Cols Increasing --> Increasing



TWO LOOPS:

First Loop: Outer Loop: Row

for (i=0; i<5; i++) 


Second Loop: Inner Loop: Col

for (j=0; j<=i; j++)


for (i=0; i<5; i++)
{
    for (j=0; j<=i; j++)
    {
        s.o.p(i,j)
    }
}


DRY RUN:

Condition: j<=i


i = 0
j = 0 (1 Time)

i = 1
j = 0,1 (2 Times)


i = 2
j = 0,1,2 (3 Times)




CODE:


// "static void main" must be defined in a public class.
public class Main {
    
    public static void pattern(int n)
{
        int i=0, j=0;
        
        for (i=0; i<n; i++) 
    {
        for (j=0; j<=i; j++)
        {
        System.out.print("* ");
        }
        System.out.println("");
    }
}
    
    public static void main(String[] args) {
       //pattern(5);
       pattern(6);

    }
}








- Intro to DSA


Practical Understanding:


20 L Water
5 Buckets - 10 L Each

Task: Store Water in Buckets


Ways:


(1) B1- 10L, B2- 10L, Rest Empty: Resource Utilised

(2) B1- 4L, B2- 4L, B3- 4L, B4- 4L, B5- 4L: Resource Not Utilised

(3) B1-10L, B2- 5L, B3- 5L, Rest Empty 

..............etc


Water: Data
Bucket: Data Structure
Ways: Algorithms




Theoretical Definition


Data Structures:

Container to Store Data to perform operations on it

Eg: Arrays, Linked Lists, Stacks, Queues, Trees, Graphs, RBT, BST, Segment Trees, Tries



Algorithms:

Step by Step Process to solve a problem using appropriate DS


Eg: Linear Search, Binary Search, DP, Sorting, Recursion, Two Pointers, Backtracking, Greedy, DFS, BFS etc




Master any DS/Algorithm:

- What ? (Need/Use Case)
- Why? (Applications)
- How? (Coding/Implementation)





----> Arrays

10 Integers

int a,b,c,d,e,f,g,h,i,j


1000 Integers

int a-z, A-Z, a1-z1.....



int a =10;
a = "devang";
s.o.p(a);




ARRAYS:
Collection of "Similar Type of Data Types" stored in a "Contiguous Location"


[1 2 3 4 5] - YES- Array of Integers

[a b c d e] - YES - Array of Characters

[10 20 p 30 40 50 q] - NO

[2 2 2 2 2] - YES, Array of Integers

[true false false true] - YES, Array of boolean

["devang" "sharma" "newton" "school"] - YES, Array os Strings



(): Function
[]: Array

Code:

Declaration Syntax: data_type name[size];

int arr[5]; // 20 Bytes in Memory
char arr[20]; // 40 Bytes in Memory
float arr[10];
boolean arr[25];


Book: Collection of Pages
    = Array of Pages

Page Numbering: Uniquely Access a Page in Book

Indexing: Uniquely Access a Element in Array


int arr[] = {1,2,3,4,5};

Size: 5

Indexing: 0 to size-1: 0 to 4


0 Index: arr[0] = 1
1 Index: arr[1] = 2
2 Index: arr[2] = 3
3 Index: arr[3] = 4
4 Index: arr[4] = 5


arr[6] = Error - Index Out of Bound Exception

arr[-2] = Error - Index Out of Bound Exception


Practical Example:

Book: Collection of Pages

Book: Array of Pages
All Pages --> Same Structure

Page Number: Unique Page



Lunch Packets: Database

- Cashews- Array (Only Cashews - Variable)
- Almonds (Only Almonds)
- 




------> Contiguous/Continuous Location


int arr[] = {1,2,3,4,5}
Index: 0 to 4

int: 4 Bytes

Size of arr in Memory: 20 Bytes


Adrress of arr[0]= 1 - Base Address of Array: 1000: ASSUME
Adrress of arr[1]= 2: 1000 + 1*4 = 4 
Adrress of arr[2]= 3: 1000 + 2*4 = 1008
Address of arr[3]= 4: 1000 + 3*4 = 1012

.........................................

Address of arr[k] = Base Address + k*4 (int)

Address of arr[k] = Base Address + k*2 (char)

Address of arr[k] = Base Address + k*8 (double)


Memory Diagram:

--- 1-------------- -------2----------- ----3-------

1000 1001 1002 1003 1004 1005 1006 1007 1008 1009 












Date : 9th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 1 & 2

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE

- Arrays
- 1 D Array 
- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




Q-1: WAP Sum of All Values in Array


a[] = {1, 5, 3, -2, 6}

OP: 13
N: 5



Approach:

sum = 0

sum = sum + a[0] + a[1] +.....a[n-1]

sum = sum + a[loop from 0 to n-1]




int sumOfArray(int arr[], int n)
{
int i=0;
int sum=0;

for (i=0; i<n; i++)
{
    sum = sum + arr[i]; //sum = sum + a[0] + a[1] +.....a[n-1]

}

return sum;
}


CP Trick:

int a = 10;
b = a;

NOTE: ALWAYS RHS IS ASSIGNED TO LHS

int a = "Devang";

String to int Error: RHS to LHS

error: incompatible types: String cannot be converted to int [in Main.java]
        a = "devang";



Final Code:


// "static void main" must be defined in a public class.
public class Main {
    
 static int sumOfArray(int arr[], int n)
{
int i=0;
int sum=0;

for (i=0; i<n; i++)
{
    sum = sum + arr[i]; 
    // Creating a Copy of sum EVERY TIME --- SC: O(N)
    sum += arr[i];   // O(1)-  No Copy Created - CP Trick
}

return sum;
}

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        
             System.out.println(sumOfArray(arr, n));

    }    
}




Q-2:  WAP to Print Product of All Values in Array


a[] = {1, 5, 3, -2, 6}

OP: -180



Approach:

prod = 1

prod = prod * a[0] * a[1] *.....a[n-1]

prod = prod * a[loop from 0 to n-1]


CODE:

// "static void main" must be defined in a public class.
public class Main {
    
 static int productOfArray(int arr[], int n)
{
int i=0;
int prod=1;

for (i=0; i<n; i++)
{
    prod *= arr[i]; 
}

return prod;
}

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        
             System.out.println(productOfArray(arr, n));

    }    
}















Q-4:  Pattern:

N = 4
OP:

*
*^*
*^^*
*****

N = 3
Sample Output:-
*
*^*
****

N = 6
Sample Output:-
*
*^*
*^^*
*^^^*
*^^^^*
******



^^ Pattern: N-2 Rows

N = 6 (0 Based Indexing)

Row :1   No of ^: 1  i == j
Row :2   No of ^: 2  i == j
Row :3   No of ^: 3  i == j
Row :4   No of ^: 4  i == j




Observations:

(1) Increasing

(3) Last Row: N+1 Stars: DONE

(3) First Row: 1 Star: DONE

(4) ^^ Pattern: N-2 Rows: DONE
    - Outer Loop: Rows: N-2
    - Inner Loop: Cols: i == j

CODE:

// "static void main" must be defined in a public class.
public class Main {
    
 static void pattern(int n)
{
     int i=0,j=0;
System.out.println("*");

// N-2 Pattern
for (i=0; i<n-2; i++)
{
   System.out.print("*");
    for (j=0; j<=i; j++)
    {
        System.out.print("^");
    }
     System.out.println("*");
}

for(i=0; i<=n; i++) 
{
    System.out.print("*");
}


}

    public static void main(String[] args) 
    {
        pattern(6);
    }    
}





Q: Magic Trick:




Initial Number: X

(1) X + A
(2) 2(X+A)
(3) Even Number: B Added
(4) 2(X+A) + B
(5) Divide by 2
(6) X + A + B/2
(7) Subtract Initial Number: X
(8) X + A + B/2 - X = A + B/2
(9) Final Ans = A + B/2












Date : 11th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 1 & 2

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE

- 1 D Array 

- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".





Two Types:

Unsorted Array

a = [5 2 1 4 3]

Sorted Array

a = [1 2 3 4 5]




Case 1: Unsorted Array


--------> Search in Unsorted Array (Linear Search/ Sequential Search)

Return the index of key if it exists in array, 
else return -1 (Invalid Index)


a = [5 2 1 3 4 -6 -2]

key = -6
OP: 5

key = 1
OP: 2

key = 4
OP: 4

key = -2
OP: 6

key = 20
OP: -1



Approach:

Traverse each and every element in the array and check if arr[i] == key
If not found in arr, then return -1

IMP:
Brownie Points: (Interviews)

Search for Any DS - Always Think About Best case and Worst case while Answering Complexity
(Both TC and SC)


Best Case: O(1), key == arr[0]
Worst Case: O(N), Key does not exist or key == arr[n-1]



Code:


// "static void main" must be defined in a public class.
public class Main {
    
static int linearSearch(int[] arr, int key)
{
    int i=0, n = arr.length;
    for (i=0; i<n; i++)
    {
        if (arr[i] == key)
            return i;
    }

    return -1;
}

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        
        // arr = [-2 3 0 1 5]
        System.out.println(linearSearch(arr, 3));
        System.out.println(linearSearch(arr, 1));
        System.out.println(linearSearch(arr, 10));
        System.out.println(linearSearch(arr, -2));

    }    
}

OP:

1
3
-1
0










COMMON BUG:

[1,2,3,4,5]
key = 4

Expected OP: 3
Received OP: -1

static int linearSearch(int[] arr, int key)
{
    int i=0, n = arr.length;
    for (i=0; i<n; i++)
    {
        if (arr[i] == key)
            return i;

        else
            return -1;
    }
}
























Date : 12th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - DRACO

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE

- 1 D Array : WIP
- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







---------> Insertion in Unsorted Array


a = [2 5 1 3 4 7 _ _ _]

Insert 6 at index 1

OP: [2 5 1 3 4 7 _ _ ]


Steps:

(1) Shift all elements after 2 to the right - O(N)
(2) a[1] = 6 - O(1)


a = [2 5 1 3 4 7 _ _ _]

a = [2 _ 5 1 3 4 7 _ _]

a = [2 6 5 1 3 4 7 _ _]


TC: O(N) - Big O




-----> Replacement in Unsorted Array

a = [2 5 1 3 4 7 _ _ ]

Replace 6 at index 1


OP: [2 6 1 3 4 7 _ _ ]


arr[idx] = val
TC: O(1)



Operations                  Time          Space
    
Search                      O(N)          O(1)
Insert                      O(N)          O(1)
Delete                      O(N)          O(1)
Replace                     O(1)          O(1)











Case 2: Sorted Array



-------> Search in Sorted Array: Binary Search

Return the index of key if it exists in array, 
else return -1 (Invalid Index)


a = [1 2 3 4 5]

key = 4
OP: 3

key = 3
OP: 2

key = 5
OP: 4

key = 7
OP: -1



                            (3)
Smaller -------L--------   YOU -------R-------- Greater

                           Person



Approach:

a, b

a == b
a > b
a < b



a = [1 2 3 4 5]
     s   m   e

3: mid 
4: mid+1
2: mid-1
5: high
0: low

key, a[mid]

low = 0, high = n-1 = 4
mid = (low+high)/2 = (0+4)/2 = 2                          Optimisation

a[mid] = 3


(1) key == a[mid] -return mid        key = 3, a[mid] = 3
(2) key > a[mid]  5 > 3   - Search in RIGHT, Ignore Left Part, 
Focus Area: [4 5] ---> [mid+1, high]
(3) key < a[mid]   1 < 3   - Search in LEFT, Ignore Right Part
Focus Area: [1 2] ----> [low, mid-1]



if()
{

} 

else if ()
{

}

else
{

}



Code:


// "static void main" must be defined in a public class.
public class Main {
    
static int linearSearch(int[] arr, int key)
{
    int i=0, n = arr.length;
    for (i=0; i<n; i++)
    {
        if (arr[i] == key)
            return i;
    }

    return -1;
}

    
static int binarySearch(int[] arr, int key)
{
int low = 0, high = arr.length-1;
int mid = 0;
      
while (low<=high)
{
    mid = (low+high)/2;  // Optimisation  - Overflow
    mid = low + (high-low)/2; -- No OVERFLOW

    if (key == arr[mid])
        return mid;    

    else if (key > arr[mid]) // 5>3, RIGHT, Focus Area: [mid+1, high]
        low = mid+1;

    else   // 1< , LEFT, Focus Area: [low, mid-1]
        high = mid-1;
}

return -1;
}

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        
        // arr = [1 2 3 4 5]
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, -2));

    }    
}




OP:

0
1
4
-1




    mid = (low + high)/2; 
    mid = low + (high-low)/2;


    To Avoid int Overflow


    int: -2Bn to +2Bn

    a = 1.5 Bn, b = 1.5 Bn
    int c = (a+b)/2; -- OVERFLOW

    int c = a + (b-a)/2 -- No Overflow




Time Complexity of Binary Search:


Mathematical Way:
 = O(N/2) + O(N/4) + O(N/8) + O(N/16) +..........O(N/2^(K-1))


Sum of GP = a(1-r^n)/(1-r), r<1

Here, r = 1/2


TC: O(log (base 2) N)



Theoretical Way:

Master Theorem:

Recurrence Relation

T(N) = T(N/2) + C


OP: O(log (base 2) N)




Operations                  Time          Space
    
Search                      O(log N)      O(1)
Insert                      O(N)          O(1)
Delete                      O(N)          O(1)
Replace                     O(1)          O(1)









Production Example:


E-Commerce: Search in Search Box 
Product: Product_id


N = 1024
1 Search = 1 sec

2 Developers

(1) Product_id in Unsorted Array: O(N) : N Iterations = 1024 seconds = 17 Mins 4 Seconds

(2) Product_id in Sorted Array: O(log N): log N Iterations 
                                        = log (base 2(1024))
                                        = 10 seconds

2^x = 1024


"Amazon loses $7.7 Bn USD for Every 1 sec delay is a year"









Date : 13th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE
- 1 D Array : DONE

- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".












Q: Reverse an Array


a = [-1 5 6 1 2 4 0]

OP: [0 4 2 1 6 5 -1]


Bonus Points: In Place : SC: O(1)


Solutions:


(1) Brute Force

Using Extra Array
b[]


for (int i = n-1; i>=0; i--)
    b[n-1-i] = a[i];  // b[n-1-(n-1)] = a[n-1] --> b[0] = a[n-1]

b = [0 4 2 1 6 5 -1]

TC: O(N)
SC: O(N)


(2) Optimised Solution: Swap / Two Pointers


-- SWAP Approach:

a = 10, b = 5
swap(a,b);

a = 5, b = 10


Collections.swap(list, idx1, idx2) --> Works only with Lis

For Reversing an Array:

int temp=0;
for (i=0; i<n/2; i++)
{
    temp = a[i]; 
    a[i] = a[n-1-i]; 
    a[n-1-i] = temp; 
}

swap(a[i], a[n-1-i]);


TC: O(N/2)
SC: O(1) - In Place


a = [1 2 3 4 5]

n = 5
n/2 = 2


for (i=0; i<2; i++)
  swap(a[i], a[n-1-i]);

i = 0
swap(a[0], a[n-1]) = swap(1,5) ---> [5 2 3 4 1]

i = 1
swap(a[1], a[n-1-1]) = swap(2,4) ---> [5 4 3 2 1]: ANS




SWAPPING:


a = 10, b = 5
void swap(int a, int b)
{
int temp = a; // temp = 10
a = b; //a = 5
b = temp; //b = 10

System.out.println(a + " " +b);
}





Pointer:

Variable:
- Address (Cannot be Changed)
- Value it contains (Changed)

int a = 20;
a: 4 Bytes: RAM: Hexadecimal Format (Base 16)
                : 000x727272a

int *b = &a;
b = 000x727272a       --- b STORES the Address of a

b --> Pointer




-- Two Pointers Approach

a = [1 2 3 4 5]
     s       e

n = 5

start = 0, end = n-1
while (start<end)
{
    swap(a[start],a[end]);
    start++;
    end--;
}

TC: O(N/2)
SC: O(1)


DRY RUN:

start = 0, end = 4

while (0<4)
{
    swap(a[0], a[4])---> [5 2 3 4 1]
    start -> 1
    end -> 3
}

while (1<3)
{
    swap(a[1],a[3]) ---> [5 4 3 2 1]: ANS
    start --> 2
    end --> 2
}


















Q: Max Element in an Array



MIN_VALUE ............................................MAX_VALUE
(-2 Bn)                                                (2 Bn)


max = Integer.MIN_VALUE;
min = Integer.MAX_VALUE;

Q-V1: Find Max in Two Values:

a = 5, b = 10
OP: 10


Approach-1:

max = Integer.MIN_VALUE;

if (a>b)
    max = a;
else
    max = b;



Approach-2:

max = Math.max(a,b)

Math.max(2,5) = 5
Math.min(2,5) = 2



Q-V2: Find Max in Three Values:

a = 5, b = 10, c = 15
OP: 15


Approach-1:

int max = Integer.MIN_VALUE;
int a = 5, b = 10, c = 15;

if (a>b && a>c)
    max = a;

else if (b>a && b>c)
    max = b;

else
    max = c;



Max Among K Values = K-1 Comparisons


Approach-2:


System.out.println(Math.max(c,Math.max(a,b)));




Q-V3: Max in an Array/ K Numbers


a = [1 8 7 -1 9 6 20]
OP: 20


Approach-1: if 

int max = Integer.MIN_VALUE;

for (i=0; i<n; i++)
{
    if (arr[i] > max)
        max = arr[i];
}

max = 1
8>1: max = 8
7>8:
9>8: max = 9
20>9: max = 20


a = [1 8 7 -1 9 6 20]
Expected OP: 20

int max = 100;

for (i=0; i<n; i++)
{
    if (arr[i] > max)
        max = arr[i];
}

OP: 100 : Incorrect


a = [-7 -30 -20 -1 -5]
Expected OP: -1

int max = 0;

for (i=0; i<n; i++)
{
    if (arr[i] > max)
        max = arr[i];
}


OP: 0: Incorrect



a = [1 8 7 -1 9 6 20]
Expected OP: 20

int max = arr[0];

for (i=1; i<n; i++)
{
    if (arr[i] > max)
        max = arr[i];
}


OP: 20: Correct


Final Code:

import java.util.*;
import java.io.*;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }

    int max = arr[0];

    for (i=1; i<n; i++)
    {
        if (arr[i] > max)
            max = arr[i];
    }


    System.out.println(max);

    }
}






Approach-2: Math.max


import java.util.*;
import java.io.*;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }

    int max = arr[0];

    for (i=1; i<n; i++)
    {
            max = Math.max(max, arr[i]);
            // SAME AS:
            // if (arr[i] > max)
            //    max = arr[i];
    }


    System.out.println(max);

    }
}



IP:
7
1 8 7 -1 9 6 20

OP:
20


TC: O(N)
SC: O(1)



Approach-3: Sort


Sorting: Converting/Arranging Unsorted Values into Sorted Fashion


[1 5 3 2 4] ---- Sort ---> [ 1 2 3 4 5]


Arrays.sort(arr);

TC: O(NlogN)



In Sorted Array,
First Value = Min Value
Last Value = Max Value


min = arr[0];
max = arr[n-1];
















Q: Min Element in an Array


> --> <





N = 1024

N*log(base 2) N = 1024*10 = 10240

10240 > 1024














Date : 14th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE
- 1 D Array : DONE

- Assignment Questions
- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







---> SWAPPING:


(1) Using 3rd Variable


a = 10, b = 5
void swap(int a, int b)
{
int temp = a; // temp = 10
a = b; //a = 5
b = temp; //b = 10

System.out.println(a + " " +b);
}





(2) Without Using 3rd Variable - Addition/Subtraction


a = 10, b = 5
void swap(int a, int b)
{
a = a + b; // a = 15
b = a - b; // b = 10
a = a - b; // a = 5

System.out.println(a + " " +b);
}


(3) Without Using 3rd Variable - Multiplication/Division


a = 10, b = 5
void swap(int a, int b)
{
a = a * b; 
b = a / b; 
a = a / b; 

System.out.println(a + " " +b);
}






Q: Divisor Problem



Sara is solving a math problem in which she has given an integer N and her task is to find the number of operations required to convert N into 1.
Where in one operation you replace the number with its second-highest divisor.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function DivisorProblem() that takes integer N as argument.

Constraints:-
1 <= N <= 100000
Output
Return the number of operations required.
Example
Sample Input:-
100

Sample Output:-
4

Explanation:-
100 - > 50
50 - > 25
25 - > 5
5 - > 1

Sample Input:-
10

Sample Output:-
2


10-->5
5-->1

OP: 2



Solution:

Prime: Only 2 Factors/Divisors (1 and num)
Composite: Not Prime


100: 1,2,4,5,10,20,25,50,100
Second Highest Divisor: 50

Operation 1: 100 --> 50

50: 1,2,5,10,25,50
Second Highest Divisor: 25

Operation 2: 50 ---> 25


25: 1,5,25
Second Highest Divisor: 5

Operation 3: 25 ----> 5

5: 1,5
Second Highest Divisor: 1


Operation 4: 5 ----> 1: STOP


Final Ans = 4








Count Factors/Divisors of a Number

N = 10

10: 1,2,5,10
OP: 4


int cnt=0;
for(i=1; i<=n; i++)
{
    if (n%i == 0)
        ++cnt;
}

OP: cnt = 4



CODE:



import java.util.*;
import java.io.*;

public class Main
{
    
    static int DivisorProblem(int N){
   int count =0;
   for(int i= N/2; i>0;i--) {
       if(N%i==0){
           System.out.println("i is " + i);
           count++;
           N = i;
        System.out.println("N is " + N);
       }
        
   }
   return count;
   

}
    public static void main (String[] args) {
        
        System.out.println(DivisorProblem(100));
        
        
    }
}








Q: Sum of Digits of a Number


n = 12345
OP: 1+2+3+4+5 = 15


n = 489
OP: 21



Left to Right Separation: Not Possible
12345: 1 + 2345: NO


Right to Left Separation: Possible


12345%10 = 5
12345/10 = 1234

1234%10 = 4
........


num % 10 ---> Last Digit
num/10 ---> Number Removing Last Digit




CODE:

import java.util.*;
import java.io.*;

public class Main
{
    
    static int sum_of_digit(int num)
{
    int sum =0;
    int rem = 0;

    while (num > 0)
    {
        rem = num%10;
        num = num/10;
        sum = sum + rem;
    }

        return sum;
}

    public static void main (String[] args) {
        
        System.out.println(sum_of_digit(489));
        
    }
}








Q: Loops - Post Class - Help Sara !(easy version)



CODE:


while(n){
    p=n;
    while(n){
        p= p - n%10;
        n= n/10;
    }
    n=p;
    cnt++;
}







