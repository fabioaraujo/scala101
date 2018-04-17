package variados

object TimerAnonymous {
  def oncePerSecond(callback: () => Unit) {
    var x = 0
    while (x < 5) {
      callback()
      Thread sleep 1000
      x += 1
    }
  }

  def main(args: Array[String]) {
    oncePerSecond(() => println("time flies like an anonymous arrow..."))
  }
}
