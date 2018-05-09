package test

object Two {
//  基本数据类型：
//  Scala的基本数据类型与Java中的基本数据类型是一一对应的，不同的是Scala的基本
//  数据类型头字母必须大写，本节以Int、Long、String、Char、Double及Float类型
//  为例介绍Scala的基本类型定义


  def main(args: Array[String]): Unit = {
//    print(add(1,-2));
//    val a = "String";
//    val b = "String";
//    print(equ(a, b));
//    print(judge(a, b));
//    print(whileLoop(1, 10));
    forLoop();
  }

  def add (a: Int, b: Int) :Int = {
    (a).+(b)
  }

  def equ (a:Object, b:Object): Boolean = {
    a == b
  }

  def judge(a:Object, b:Object): Int = {
    val param = if (a == b) 1 else 0;
    param;
  }


  def whileLoop (a:Int ,b:Int): Int={
//    参数是val的

    var x = a;
    var y = b;

    var temp = 0;
    while (x != y){
      x = x + 1;
      temp += 1;
    }
    temp
  }

  def forLoop (): Unit = {
//    val filesHere = (new java.io.File(".")).listFiles;
//    for (file <- filesHere){
//      println(file.getName);
//    }

    for(i <- 1 to 5) println("Iteration"+i)

//    val filesHere = (new java.io.File(".")).listFiles
//    for (file <- filesHere if file.getName.endsWith(".scala"))
//      println(file)
    //还可以加入多个过滤条件，用;隔开
//    for (
//      file <- filesHere
//      if file.isFile;
//      if file.getName.endsWith(".scala")
//    ) println(file)
  }

}
