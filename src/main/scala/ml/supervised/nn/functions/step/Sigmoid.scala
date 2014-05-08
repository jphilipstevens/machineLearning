package scala.ml.nn.functions.step

/**
 * Sigmoid function
 * Created by jono on 20/04/14.
 */
object Sigmoid extends ActivationFunction {

  /**
   * Calculates the sigmoid function given the input function
   * @param function and input function that gives you some Double value used for sigmoid function
   * @return the calculated result of the sigmoid function
   */
  def calculate(function: () => Double): Double = 1 / (1 + Math.exp(-1 * function()))

}