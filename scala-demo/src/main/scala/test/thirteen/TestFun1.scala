package test.thirteen

object TestFun1{
  def main(args: Array[String]): Unit = {
   val tf = new TestFun1();
//    tf.testMapf();
//    tf.testFlatMapf();
//    tf.testFilterf();
//    tf.testReducef();
//    tf.testFold();
//    tf.testScanf();
    
    //函数curry化
    def multiplyBy(arg1:Double)(arg2:Double) = arg1*arg2

    val sum = multiplyBy(10)(50);
    println(sum);

  }
}

class TestFun1 {

  def testMapf(): Unit ={
    val arr = Array(1,2,3);
    val arr2 = arr.map(_*2);
    arr2.foreach(i => println(i));
  }

  def testFlatMapf(): Unit ={
    val list = List(List(1,2,3), List(4,5,6));
    val newList = list.flatMap(x => x);
    println(newList);
  }

  def testFilterf(): Unit ={
    val arr = Array(1,2,3,4);
    println(arr.filter(_>2).foreach(println(_)));
  }

  def testReducef(): Unit ={
//    val list = List("hadoop", "hive", "spark");
//    println(list.reduce(_+ "," +_));

    val arr = Array(1,2,3,4,5);
    val sum = arr.reduceRight((x:Int, y:Int) => {println(x + ":" +  y);x+y})
    println("sum=" + sum);
  }

  def testFold(): Unit ={
//    reduceLeft只是简单的把list的第一个元素作为运算的开始元素，而foldLeft则需要传入一个元素作为开始元素。
    val sum = Array(1,2,3,4,5).foldLeft(10)((x:Int, y:Int) => {println(x + ":" +  y);x+y});
    println("sum=" + sum);
  }

  def testScanf(): Unit ={
    val sum = Array(1,2,3,4,5).scanRight(0)((x:Int, y:Int) => {println(x + ":" +  y);x+y});
    sum.foreach(x => print(x + ","));
  }


}
