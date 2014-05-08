package scala.ml.data

import scala.collection.mutable.ArrayBuffer

/**
 * Created by JStevens on 08/05/2014.
 */
trait DataSet {
  /**
   * Add a value to the end of the set.
   *
   * @param value
	   * The value to add.
   */
  def add(value: Double): Unit

  /**
   * @return All of the data as an array.
   */
  def getData(): List[Double]


  /**
   * Get the element specified index value.
   *
   * @param index
	 * The index to read.
   * @return The value at the specified inedx.
   */
  def getData(index: Int): Double

  /**
   * Clear any data to zero.
   */
  def clear(): Unit

  /**
   * @return How many elements are stored in this object.
   */
  def size(): Int

  /**
   * Set all of the data as an array of doubles.
   *
   * @param data
	 * An array of doubles.
   */
  def setData(data: List[Double]): Unit

  /**
   * Set the specified element.
   *
   * @param index
	 * The index to set.
   * @param value
	 * The data for the specified element.
   */
  def setData(index: Int, value: Double): Unit

}
