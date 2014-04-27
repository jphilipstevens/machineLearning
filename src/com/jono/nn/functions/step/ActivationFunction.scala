package com.jono.nn.functions.step

/**
 * Created by jono on 26/04/14.
 */
trait ActivationFunction {

  def calculate(function: () =>  Double) : Double;
}


object ActivationFunction {

  def getActivationFunction() : ActivationFunction = {
    return Sigmoid
  }
}