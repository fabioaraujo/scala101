import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite{
  test("CubeCalculator.cubeOf3"){
    assert(CubeCalculator.cube(3) === 27)
  }

  test("CubeCalculator.cubeOf0"){
    assert(CubeCalculator.cube(0) === 0)
  }
}
