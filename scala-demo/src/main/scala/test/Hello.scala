package test

object Hello {
  def main(args: Array[String]): Unit = {
//    sayHello("nio");
    var sum = count(1,2);
    print(sum);
  }

  def sayHello(x: String): Unit = {
    println("hello," + x);
  }

  def count(a: Integer, b:Integer): Integer = {
    a + b;
  }
}
