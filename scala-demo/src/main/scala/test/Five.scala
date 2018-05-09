package test

object Five {

  def main(args: Array[String]): Unit = {

    //函数字面量
//    val increament = (x:Int, y:Int) => x+y;
//    println(increament(1,2));

//    val increase2=(x:Int)=>{
//      println("Xue")
//      println("Tu")
//      println("Wu")
//      println("You")
//      x+1
//    }

//    println(increase2(1));

//    println(Array(1,2,3).map(increase2).mkString(","));
    //niming hanshu
//    Array(1,2,3).map(x => x+1).mkString(",")
//    Array(1,2,3).map(_+1).mkString(",")

    //    值函数1
//    val fun1 = 1+(_:Double);
    //    值函数2
//    val fun1:(Double)=> Double = (1+_);

//    println(fun1(1));

    //函数参数传递
//    println(convertIntToString((x:Int) => x+"s"));

//    val f = mutiplyBy(10)
//    print(f(20));
  }

  //函数参数定义
  def convertIntToString(x:(Int) => String) = x(4);

  //函数返回函数
  def mutiplyBy(x:Double)=(y:Double)=>x*y

}
