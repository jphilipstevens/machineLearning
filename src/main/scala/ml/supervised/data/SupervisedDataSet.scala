package scala.ml.supervised.data

import scala.ml.data.{BasicDataSet}

/**
 * a dataset meant for supervised learning.It allows for saving the expected values
 *
 * Created by JStevens on 08/05/2014.
 */
class SupervisedDataSet extends BasicDataSet {

  var expectedResult: Double = -1

  def addExpectedResult(result: Double): Unit = {
    this.expectedResult = result
  }
}
