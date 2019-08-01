import org.scalatest.FunSuite
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class OldStyleTest extends FunSuite with GeneratorDrivenPropertyChecks {
  test("case 1") {
    forAll { (s: String) =>
      assert(s.length == s.size)
    }
  }
}
