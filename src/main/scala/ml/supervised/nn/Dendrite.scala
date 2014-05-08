package scala.ml.nn

/**
 * This represents a den
 * Created by jono on 21/04/14.
 */
class Dendrite(private val outputNeuron: Neuron, private var weight: Double) {


  /**
   * Gets the dendrite output from the neuron that is at the end of the link
   * @return calculates the output of the attached neuron
   */
  def getInput: Double = outputNeuron.getOutput


  /**
   * calculates the weighted output
   * @return the weighted output of the neuron and this connections weight
   */
  def getWeightedInput: Double = outputNeuron.getOutput * weight


}
