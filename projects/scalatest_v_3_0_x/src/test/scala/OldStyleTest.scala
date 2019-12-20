
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks
import org.scalatest.funsuite.AnyFunSuite

class OldStyleTest extends AnyFunSuite with ScalaCheckDrivenPropertyChecks {
  test("case 1") {
    forAll { (s: String) =>
      assert(s.length == s.size)
    }
  }
}
