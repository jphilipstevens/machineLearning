package com.jono.nn

import com.jono.nn.functions.step.ActivationFunction


/**
 * Created by jono on 21/04/14.
 */
class Neuron(val stepFunction: ActivationFunction, val synapsis: List[Dendrite]) {

  /**
   * Calculate the output for this neuron based on its Dendrite connections
   * @return the calculated output of the neuron
   */
  def getOutput(): Double = {
    return stepFunction.calculate(
      () => {
        var cumul: Double = 0d
        for (x <- synapsis)
        {
          cumul += x.getWeightedInput()
        }
        return cumul
      })
  }


}
