package test.sevenTeen

object TestT{
  def main(args: Array[String]): Unit = {
//    val tt = new TestT[String];
//    println("hello".compareTo("world"));
    //    println(tt.compare("hello", "world"));

    val tt = new TestT1[Int];
    println(tt.compare(12,123));
  }
}

//继承层次的泛型界定 <:
class TestT[T <: Comparable[T]] {

  def compare(first:T, second:T): T ={
    if (first.compareTo(second) > 0)
      first
    else
      second
  }

}

//利用<%符号对泛型S进行限定
//它的意思是S可以是Comparable类继承层次结构
//中实现了Comparable接口的类
//也可以是能够经过隐式转换得到的类,该类实现了
//Comparable接口

//Int 会隐式的转为RichInt
class TestT1[T <% Comparable[T]] {

  def compare(first:T, second:T): T ={
    if (first.compareTo(second) > 0)
      first
    else
      second
  }

}


//上面的都是指定了上界，还可以去指定下界 >: