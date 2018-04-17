import scala.concurrent.ExecutionContext
import scala.concurrent.forkjoin.ForkJoinPool

implicit val ec: ExecutionContext = ExecutionContext.fromExecutor(new ForkJoinPool())

import scala.concurrent.Future
import scala.util.{Failure, Success}

val f: Future[Int] = Future { 1 + 2 + 3}

f.onComplete{
  case Success(i) => println("onComplete Success: " + i)
  case Failure(f) => println("onComplete Failure: " + f)
}

f.map(result => println("Mapping: " + result))
