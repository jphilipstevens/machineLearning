package scala.ml.nn

import scala.ml.nn.functions.step.ActivationFunction


/**
 * This is a simple Neuron for a neural network
 * Created by jono on 21/04/14.
 */
class Neuron(val stepFunction: ActivationFunction, val synapsis: List[Dendrite]) {

  /**
   * Calculate the output for this neuron based on its Dendrite connections
   * @return the calculated output of the neuron
   */
  def getOutput: Double =
    stepFunction.calculate(
      () => {
        var cumul: Double = 0d
        for (x <- synapsis) {
          cumul += x.getWeightedInput
        }
        return cumul
      })


}
