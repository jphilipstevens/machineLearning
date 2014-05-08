package scala.ml.supervised.regression.logistic

import scala.ml.nn.functions.step.ActivationFunction
import scala.ml.data.DataSet

/**
 * A Logistic Regression Model
 * Created by JStevens on 08/05/2014.
 */
class LogisticRegression(val hypothesisFunction: ActivationFunction) {

  var decisionBoundry: Double = 0.5

  /**
   * Change the decision boundry to a new value
   * @param newDecisionBoundry the decision boundry to set
   * @throws IllegalArgumentException if you try to set a decision boundry outside the range 0 and 1
   */
  def setDecisionBoundry(newDecisionBoundry: Double): Unit = {
    if (newDecisionBoundry >= 1 || newDecisionBoundry < 0) {
      throw new IllegalArgumentException("The decision boundry must be between 0 and 1")
    }
    decisionBoundry = newDecisionBoundry
  }


  def train(dataset: DataSet): Unit = {

  }

}
