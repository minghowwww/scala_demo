package test.six

import scala.beans.BeanProperty

object Person{
  def apply(pname: String, page: Integer): Person = new Person(pname, page)
}

class Person /*private 禁用主构造器*/ (pname:String, page:Integer) {

  //属性必须赋值;
  //编译时自动生成gettter/settter，以及属性私有化
  //如果属性是val的，那么只会生成get方法，不会生成set方法
  //如果定义为private【this】 则不会生成getter和setter

  @BeanProperty var name:String = pname; //生成javabean风格的getter和setter
  @BeanProperty var age:Integer = page;

  def this (pname:String){
    //辅助构造器第一个语句都是调用其他的构造器，如果有主构造器的话，就是构造主构造器
    //所以主构造器是一个对象的唯一入口
    this(pname, 20);
  }

  override def toString: String = name + "," + age


//  private var privateName:String = null;
  //自定义getter和setter
//  def name = privateName;

//  def name_=(name:String): Unit ={
//    println("自定义的set方法")
//    this.privateName = name;
//  }
}
