package test.eleven

import java.io.PrintWriter

trait Logger{
  def log(msg:String):Unit
}

trait FileLogger extends Logger{
  val filename:String;
  lazy val fileoutput = new PrintWriter(filename:String);

  override def log(msg: String): Unit = {
    fileoutput.print(msg);
    fileoutput.flush();
  }
}

class Person

class Student extends Person with FileLogger {
  val filename="file.log";
}

object TraitDemo{
  def main(args: Array[String]): Unit = {
    val s = new Student();
    s.log("hello world");
  }
}
