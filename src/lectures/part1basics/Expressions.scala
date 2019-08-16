package lectures.part1basics

object Expressions extends App {

 val x = 1 + 2 // EXPRESSION
 println(x)

 println(2 + 3 + 4)
 // math operators: + - * / & | ^ << >> >>> (right shift with zero extension)

 println(1 == x)

 println(! (1==x))

 var aVariable = 2
 aVariable += 3

 println(aVariable) // a side effect

 // Instructions (DO) = MORE OF AN OOPS approach vs EXPRESSIONS (VALUE) more functional
 // programming style

 // IF expression in scala

 val aCondition = true
 val aCondtionedValue = if (aCondition) 5 else 3

 // THE IMPORTANT THING HERE IS THAT IF EXPRESSION GIVES BACK A VALUE
 // NOT LIKE IMPERATIVE LANGUAGES WHERE YOU DO IF (aCondition) assign this variable or do something else
 // do something else. Expression is more functional
 println(aCondtionedValue)

 println(if (aCondition) 5 else 3)

 // loops are not preferred it is imperative
 // they introduce side effects and are not really expresssions
 var i = 0
 while (i < 10) {
  println(i)
  i+=1
 }

 // EVERYTHING IN SCALA IS AN EXPRESSION!!

 val aWeirdValue = (aVariable = 3) // Unit === void ()
 print(aWeirdValue)


 // examples of side effects: println(), whiles, reassigning. THEY ARE ALL EXPRESSIONS RETURNING UNIT


 // Code blocks
// value of a code block is the value of the last  expression
// vals defined inside are scope to the inside of the codeblock
 val aCodeBlock = {
  val y = 2
  val z = y + 1
  if (z > 2 ) "hello " else "goodbye"
 }

 //Summary:
 // Instructions are executed and expressions are evaluated
 // In Scala: everything is in terms of expressions

// Exercise
 // 1. Difference between "hello world" and "println("Hello world")"
 // type of value "hello world" is String whereas println is a side effect that prints to the console and  that has () type

 // 2.What is the type of the following:

 val someValue = {
  2 < 3
 } // Ans: Boolean
val someOtherValue = {
 if (someValue) 239 else 986
 42
} // Ans: Integer


}
