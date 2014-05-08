package scala.ml.nn.network

import scala.collection.mutable.ArrayBuffer
import scala.ml.data.DataSet

/**
 *
 * Created by jono on 26/04/14.
 */
class NeuralNetwork(val hiddenLayerNeuronCount: Int, val hiddenLayerSize: Int, val inputLayer: DataSet, val getOutputLayer: NetworkLayer => NetworkLayer) {
  /**
   * hiddenLaterNeuronCount:the size of the hidden layer (not including the bias)
   */
  val hiddenLayerNeuronCountWithBias = hiddenLayerNeuronCount + 1

  /**
   * setup the network layers
   */
  val networkLayers = {
    val layers = new ArrayBuffer[NetworkLayer](hiddenLayerSize)
    for (i <- 1 until (hiddenLayerSize + 1)) {
      layers += new NetworkLayer(hiddenLayerNeuronCountWithBias, layers(i - 1))
    }
    layers += getOutputLayer(layers(layers.size - 1))
    layers.toList
  }


  /**
   * Calculate cost for the network with the weights
   * @return
   */
  def calculateCost(): Double = {
    0
  }
}
