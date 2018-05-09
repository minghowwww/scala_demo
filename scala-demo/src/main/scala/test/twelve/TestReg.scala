package test.twelve

object TestReg {

  def main(args: Array[String]): Unit = {
    val ipRegex="(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)".r
    for(ipRegex(one,two,three,four) <- ipRegex.findAllIn("192.168.1.1"))
    {
      println("IP子段1:"+one)
      println("IP子段2:"+two)
      println("IP子段3:"+three)
      println("IP子段4:"+four)
    }
  }
}
