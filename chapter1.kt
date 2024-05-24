
// main function
fun main() {
  println("Hello, Android ")

  // Creating constant variable
  val x = 1
  val y = 3

  println(x)
  val z = x + y
  println(z)

  // Constant vs Variable
  val name = "Alif"
  // name = "Muhammad Alif"
  println(name)

  var fullName = "Alif"
  fullName = "Muhammad Alif"
  println(fullName)

  // Data Type
  var address:String = "Kuala Lumpur"
  println(address)

  var jantina:Char = 'L'
  println(jantina)

  // Operation
  val message = "My name is " + name + ". I live in " + address
  println(message)

  // String Interpolation
  val message2 = "My name is $name. I live in $address"
  println(message2)

  // Number
  var num1:Int = 9
  var num2:Int = 5

  var sum:Int = num1 + num2
  println(sum)

  // Double
  var num3:Int = 9
  var num4:Int = 5

  var sum2 = num3 + num4
  println(sum2)

  var minus = num1 - num2
  println(minus)

  var product = num1 * num2
  println(product)

  var division = num1 / num2
  println(division)

  var modulo = num1 % num2
  println(modulo)

  val x:Int = 55
  val y:Short = x.toShort()
  println("x = $x")
  println("y = $y")

  // Boolean
  var eaten = true
  var tired:Boolean = false

  // Boolean operation : && (AND), || (OR), ! (Reverse)
  println(eaten && tired)
  println(eaten || tired)
  println(!eaten)

  // Nullable
  var profession = null

  var newProfession:String? = null
  println(newProfession)
  println(profession)
  newProfession = "Student"
  println(newProfession)

  // Calculate BMI
  var tinggi:Double = 170.0
  var berat:Double = 70.0
  var bmi:Double = berat / ((tinggi / 100) * (tinggi / 100))
  println(bmi)

  // Array
  var scores = arrayOf(70, 90, 100, 80, 85, 60)
  println(scores[0])
  println(scores[1])
  println(scores.size)

  // Input Information
  println("Enter your name")
  var name = readLine()

  println("Enter your age")
  var age = readLine()

  println("Your name is $name and you are $age years old")
}
