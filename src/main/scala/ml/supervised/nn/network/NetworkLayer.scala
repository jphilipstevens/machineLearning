package scala.ml.nn.network

import scala.ml.nn.{Dendrite, Neuron}
import scala.collection.mutable.ArrayBuffer
import scala.ml.nn.functions.step.ActivationFunction
import scala.math.random

/**
 * This class represents one layer of a neural network.
 * Created by jono on 21/04/14.
 */
class NetworkLayer(val neuronCount: Int, val prevNewwork: NetworkLayer) {

  /**
   * this list of neurons for the layer
   */
  val neurons = {
    val neuronArr = new ArrayBuffer[Neuron](neuronCount)
    for (i <- 0 until neuronCount) {
      val aNeuron = new Neuron(ActivationFunction.getActivationFunction, prevNewwork.createConnections())
    }
    neuronArr
  }


  /**
   * Creates a list of connections from the neurons of this layer
   * @return a list of connections
   */
  def createConnections(): List[Dendrite] = {
    var dendrites = new ArrayBuffer[Dendrite](neuronCount)
    for (x <- neurons) {
      //Use [-2.4, 2.4] as initial weight range
      dendrites += new Dendrite(x, random * (2.4 * 2) - 2.4)
    }
    dendrites.toList
  }


}
