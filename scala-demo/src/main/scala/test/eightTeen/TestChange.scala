package test.eightTeen

import java.io.File

import scala.io.Source

object TestChange{
  def main(args: Array[String]): Unit = {
    //定义隐式转换函数
    implicit def doubelToInt (x:Double) = x.toInt
//    val i:Int = 3.6;
//    println(i);

    //隐式转换功能十分强大，可以快速地扩展现有类库的功能
//    implicit def file2Richfile(x:File) = new RichFile(x);
//    val f = new File("file.log");
    //现在来看我们的file类也可以使用read方法了。
//    println(f.read);
    val tc = new TestChange();
    tc.f(12.7);

/*    隐式转换发生的两种情况：
      1 当方法中参数的类型与实际类型不一致时
      2 当调用类中不存在的方法或成员时，会自动将对象进行隐式转换*/
  }
}
class TestChange {

  def f(x:Int)=x
}

//RichFile类中定义了Read方法
class RichFile(val file:File){
  def read=Source.fromFile(file).getLines().mkString
}
