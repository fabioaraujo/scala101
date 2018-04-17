package variados

object Timer {
  def oncePerSecond(callback: () => Unit) {
    var x = 0
    while (x < 5) {
      callback()
      Thread sleep 1000
      x += 1}
  }
  def timeFlies() {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}
