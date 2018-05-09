package test.sevenTeen

object LowerBound{

  def main(args: Array[String]): Unit = {
    val first = new Ebook("ebook1");
    val second = new Ebook("ebook2");

    val test = new LowerBound[Ebook](first,second);
    println(test.replace[Book](new Book("nio")));
//    println(test.replace[WeirdBook](new WeirdBook("pbook")));
  }
}

class LowerBound[T] (var first:T, var second:T) {

  def replace[R >: T](newFirst:R) = new LowerBound[R](newFirst,second);

  override def toString: String = first + "||" + second
}

class Book(val name:String) {

  override def toString: String = "name="+name;
}

class Ebook(name:String) extends Book(name){

}

class Pbook(name:String) extends Book(name){

}

class WeirdBook(name:String) extends Ebook(name){}

