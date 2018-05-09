package test.twelve

import java.io.FileWriter
import java.net.URL

import scala.io.Source

object TestSource {

  def main(args: Array[String]): Unit = {
//    read();
    netIO();
  }

  def write(): Unit ={
    val fileWriter = new FileWriter("file.txt");
    fileWriter.write("scala file write");
    fileWriter.flush();
    fileWriter.close();
  }

  def read(): Unit ={
    //读取文件
    val file=Source.fromFile("/home/nio/npm-debug.log")
    //返回Iterator[String]
    val lines=file.getLines()
    //打印内容
    for(i<- lines) println(i)
    //关闭文件
    file.close();
  }

  def netIO(): Unit ={
    println(Source.fromURL(new URL("http://www.baidu.com")).mkString(","));
  }
}
