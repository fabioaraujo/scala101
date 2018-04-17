import org.scalatest.FunSuite

class CalculatorTest extends FunSuite{
  test("Calculator.cubeOf3"){
    assert(Calculator.cube(3) === 27)
  }

  test("Calculator.cubeOf0"){
    assert(Calculator.cube(0) === 0)
  }

  test("Calculator.squareOf0"){
    assert(Calculator.square(0) === 0)
  }

  test("Calculator.squareOf2"){
    assert(Calculator.square(2) === 4)
  }
}
