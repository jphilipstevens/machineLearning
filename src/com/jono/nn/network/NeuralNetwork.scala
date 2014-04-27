package com.jono.nn.network

import scala.collection.mutable.ArrayBuffer

/**
 *
 * Created by jono on 26/04/14.
 */
class NeuralNetwork(val hiddenLayerNeuronCount: Int, val hiddenLayerSize: Int, val inputLayer: NetworkLayer, val getOutputLayer: NetworkLayer => NetworkLayer) {
  /**
   * hiddenLaterNeuronCount:the size of the hidden layer (not including the bias)
   */

  val hiddenLayerNeuronCountWithBias = hiddenLayerNeuronCount + 1

  val networkLayers = {
    val layers = new ArrayBuffer[NetworkLayer](hiddenLayerSize)
    layers += inputLayer
    for(i <- 1 until (hiddenLayerSize + 1)){
      layers += new NetworkLayer(hiddenLayerNeuronCountWithBias, layers(i - 1))
    }
    layers += getOutputLayer(layers(layers.size - 1))
    layers.toList
  }

  def runFeedForward() = {
    for(i <- 0 until hiddenLayerNeuronCount){

    }
  }

}
