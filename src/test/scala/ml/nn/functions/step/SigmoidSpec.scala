package scala.ml.nn.functions.step

import org.specs2.mutable._
import scala.ml.nn.functions.step.Sigmoid.calculate

/**
 * Simple test for assuring the sigmodi function works
 * Created by jono on 30/04/14.
 */
class SigmoidSpec extends Specification {
  "Sigmoid function" should {
    "resolve input of 1 to about 0.731058579" in {
      val result = calculate(
        () => {
          1.0d
        })
      result must beCloseTo(0.731058579, 0.001)
    }
  }

}
