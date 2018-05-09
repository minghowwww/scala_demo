package test.fiviteen

object TestMatch{

  def main(args: Array[String]): Unit = {
    val tm = new TestMatch();
//    tm.patternShow("hello world");

//    val p=List("spark","hive","SparkSQL")
//    def sequencePattern(p:List[String])=p match {
//      //只需要匹配第二个元素
//      case List(_,second,_*) => second
//      case _ => "Other"
//    }
//    println(sequencePattern(p))

    val lists = List(List(1,2,3), List(4,5,6));
    println(tm.variableBindingPattern(lists));
  }
}
class TestMatch {

  def patternShow(s:Any) = s match {
    case true => println(1)
    case 1 => println(2);
    case "hello world" => println(3)
    case _  =>"Other constant"
  }

  def variableBindingPattern(t:Any)= t match {
    //变量绑定，采用变量名（这里是e)
    //与@符号，如果后面的模式匹配成功，则将
    //整体匹配结果作为返回
    case List(_,e@List(_,_,_)) => e
    case _ => Nil
  }
}
