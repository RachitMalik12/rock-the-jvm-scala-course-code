package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int)  = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction)
  // if you dont have parameters you can call the function
  // just by its name

  def aRepeaterFunction(aString: String, n: Int ): String = {
    if (n==1) aString
    else
      aString + aRepeaterFunction(aString, n-1 )
  }


  println(aRepeaterFunction("hello", 3))


 // Return type is not optional for recursive functions

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int) : Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)

  }

 // A greeting function (name,age) => Hi my name is name and I am $age years old
  // 2. Factorial function
  // 3. Fibonnaci
  // 4. Test if a number is prime

  def greeting(name: String, age: Int): String = {
    val message = "My name is" + name + "and I am" + age + " years old"
    message
  }

  def factorial(n: Int): Int = {
    if (n <=0 ) 1
    else
      n * factorial(n-1)
  }

  def fibonacci(n: Int): Int = {
    if (n == 1) 1
    else if  (n == 2) 1
    else
      fibonacci(n-1) + fibonacci(n - 2)

  }

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t == 1) true
      else
        (n%t != 0 && isPrimeUntil(t-1))

    }
    isPrimeUntil(n/2)

  }



println(isPrime(2003))



}
