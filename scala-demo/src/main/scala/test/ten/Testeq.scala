package test.ten

object Testeq {

  def main(args: Array[String]): Unit = {
    val x = new String("ABC");
    val y = new String("ABC");

    println(x ne y);
    println(x.eq(y));
  }
}
