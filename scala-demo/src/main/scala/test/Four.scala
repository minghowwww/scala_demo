package test

import scala.collection.mutable

object Four {

  def main(args: Array[String]): Unit = {
//    testImmutable();
//    testSet();
//    testMap();
//    testTuple();
//    testQueue();
    testStack();
  }

  def testImmutable(): Unit = {
    //默认是immutable的，mutable类型需要引包

    var set1 = mutable.Set(1,2,4);
    var set2 = Set(1,2,3);

    set1.add(12);
    set2+1;

    println(set1);
    println(set2);
  }

  def testSet():Unit = {
//    val numberSet = Set(5.0, 3.0);
//    val numberSet = mutable.Set(5.0, 3.0);

    //严格按照插入顺序排序
    val numberSet = mutable.LinkedHashSet(5.0, 3.0);
    numberSet.add(7);
    val res = numberSet.+(6)
    for (i <- res) println(i);
  }

  def testMap():Unit = {

    val studentInfo = mutable.Map("john" -> 21, "nio" -> 666);
//    studentInfo.clear();
//    println(studentInfo);
    studentInfo.foreach(e => println(e._1 + ":" + e._2));

//    println(studentInfo.get("nio") + "6");
    println(show(studentInfo.get("nio")));
  }


  //相当于java中的switch case
  def show (item:Option[Int]) = item match {
    case Some(s) => s
    case None => "???"
  }

  //元组
  def testTuple():Unit = {
    val tuple = ("abc", true, 1);
    println(tuple._1);
  }

  def testQueue():Unit = {
    val queue = mutable.Queue(1,2,3);
    //出队列
    val item = queue.dequeue();
    println(item);

//    queue.enqueue(12);
//    queue+=12;
    queue++=List(6,6,6);
    println(queue);
  }

  def testStack():Unit = {
    val stack = mutable.Stack(1,2,3);
    println(stack.top);
    stack.push(666);
    println(stack);
  }
}
