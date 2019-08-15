package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x  = 42
  println(x)


  // VARS ARE IMMUTABLE

  // COMPILER can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"


  val aBoolean: Boolean = false

  val aChar: Char = 'a';
  val anInt: Int = x;
  val aShort: Short = 42;

  val aLong: Long = 34325253L;
  val aFloat: Float = 3.0f;
  val aDouble: Double = 3.14;

  // variables

  var aVariable: Int = 4
  aVariable = 5 // side effects



}
