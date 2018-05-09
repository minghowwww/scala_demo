package test

import scala.collection.mutable.ArrayBuffer

object Three {

  def main(args: Array[String]): Unit = {
//    var arr1 = Array[Int](5);
//    var arr2 = new Array[String](5);
//
//    for (i <- arr1) print(i + ",")
//    println();
//    for (str <- arr2) print(str + ",")

//    testArrayBuffer();
    testList();
  }

  def testArrayBuffer():Unit = {
//    var arr = new ArrayBuffer[Int]();
//    arr+=1;
//    arr+=12;
//    arr+=(122,132)
//    print(arr)

    var strs = new ArrayBuffer[String]();
    strs++=Array("HELLO", "world");
    strs++=List("iam", "nio");
//    println(strs);
//    strs.trimEnd(2);
//    print(strs);


    var arr = strs.toArray;
    var arr1 = for(i <- arr if i.contains("o")) yield i+"6"

//    print(arr1.toBuffer);
    print(arr1.mkString(","))
  }


  def testList(): Unit = {
//    val list = List.apply("hello", "world", "666");
//    list(2) = "888";  list与array的不同之处在于list一旦被创建，便不可以修改他的值
//    println(list);

//    val nums = 1 :: (2 :: (3 :: Nil));
//    val nums = 1 :: 2 :: 3 :: Nil;
//    println(nums);
//
//    println(nums.isEmpty);
//    println(nums.head);
//    println(nums.tail);

//    val l = list ::: nums
//    print(l);

//      val list = List.range(1,5);
//    val list = List.range(5,1,-1);

    val list = List.make(5, "啾咪");
    print(list);




  }
}
