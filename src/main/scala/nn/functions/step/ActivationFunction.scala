package com.jono.nn.functions.step

/**
 * Trait for any activation function
 * Created by jono on 26/04/14.
 */
trait ActivationFunction {

  def calculate(function: () =>  Double) : Double;
}

/**
 * Static definition to get the global activation function
 */
object ActivationFunction {

  def getActivationFunction() : ActivationFunction = {
    return Sigmoid
  }
}