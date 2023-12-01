# Introduction to Data Types in Java

As opposed to dynamically typed languages such as JavaScript
Java is a statically typed language. This means any
variable or method you declare must be accompanied by a
data type. This data type cannot be changed.

### Java primitive types:

Primitive types are types built into the language of Java
itself.

- **Integer `int`** numbers without decimals. Maximum value 2147483647. (2^31 - 1)
- **Long** like an integer but much larger.
- **Double** numbers with 16 decimal digits.
- **Float** less precise but smaller memory requirement than double.

- **Character `char`** a single alphanumeric symbol.
- **String** an ordered collection of chars.

- **Boolean** a value of either `true` or `false`.

### Method types:

Methods are functions which belong to a class. While not entirely
correct, it is okay to use method/function interchangeably.

When declaring a method in java, you must specify the type of data 
you expect it to return. A method which returns no data must be given
the type `void`.

Think about a code snippet that looks like this:

```java
int myNumber = quotient(15, 2);
```

The compiler needs to know what type of data the `quotient` method returns.
If it returns a `double` and not an `int`, then the code snippet above should 
catch this mistake.

## Instructions

We are working only within the School class file for this project.
App.java is simply for the purposes of running the `main()` method of a School
object. App should not be changed, and it can be ignored for now.

A school has provided you with some information and data it would like for you to
store and use in order to compute some values.

### Create variables to store the following data

Remember each variable must have a data type, refer to the list of primitive 
types above.
Use integers for whole numbered object, such as students.
Use doubles only when necessary.

- 10 classrooms
- 86 students
- 14 teachers
- average teacher salary 70k
- total expenditure this year of 1206724.86
- our total budget was 1.5mil
- the school's name is "Red Mountain High School"
- we have been accredited (use a boolean)

### Arithmetic Operations

There are several arithmetic calculations we'd like to make with the above
data. These symbols used for operations are listed below:

- `+` addition
- `-` subtraction
- `*` multiplication
- `/` division


## Type Casting

Compatible data types can be converted into one another.
For example, an integer or long can be converted to a double or a float and
vice-versa.

For example:

```java
int myInt = 7;
double myDouble = (double)myInt;

//The value of myDouble is 7.0
```

However, it is possible to lose information due to type casting. For example:

```java
double myDouble = 3.9;
int myInt = (int)myDouble;

//The value of myInt is 3 (not 4!)
```

The 3.9 was truncated (not rounded) to 3.

Note that not all types can be casted. For example a
string cannot be cast into an integer.

### Creating methods

The `main` method has been started for you, you should uncomment each line as
you progress through the project.

Create the following methods and pick appropriate return types:

- `studentsPerClassroom` returns a **whole number** of students to be placed in 
each class. (There will be one class with a reduced number of students).

- `costPerStudent` returns the average amount of money each student costs the school.
Remember to first subtract the amount of money spent on teachers from the total
expenditures.

- `costPerClassroom` returns the cost per classroom using both of the above methods.

- `isWithinBudget` returns true if the totalBudget is greater than the total
 expenditures.
 
- `roundToNearestCent` returns a double with two decimal places. 
There is a trick to doing this. 
    - First multiply by 100.
    - Cast that amount to an integer
    - Divide by 100 and return as a double
    
Modify the `main` method to round both monetary results to two decimal places.

## A Completed Project will

Output to the console:

```
Students per classroom: 9
Cost per student: 2636.33
Cost per classroom: 23727.02
```