package test.six

object Test {

  def main(args: Array[String]): Unit = {
//    val p = new Person("nio");
//    p.name_= ("nio");
//    println(p.name);

    //通过属性直接赋值的行为也会调用我们自定义的set方法
//    p.name = "nio";

//    p.setName("nio");
//    println(p.getName);

//    println(p);

//    println(Single.add(2,3));

    val p = Person("nio",12);
    println(p);
  }
}
