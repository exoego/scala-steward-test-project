import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalatest.funsuite.AnyFunSuite

/**
  * Foo Bar
  */
class OldStyleTest extends AnyFunSuite with GeneratorDrivenPropertyChecks {
  test("case 1") {
    forAll { (s: String) =>
      assert(s.length == s.size)
    }
  }
}
