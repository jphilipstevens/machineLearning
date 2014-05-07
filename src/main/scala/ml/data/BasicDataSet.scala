package scala.ml.data

import scala.collection.mutable.ArrayBuffer

/**
 * Created by jono on 06/05/14.
 */
class BasicDataSet extends DataSet {

  var values: ArrayBuffer[Double] = new ArrayBuffer[Double]()

  /**
   * Add a value to the end of the set.
   *
   * @param value
	   * The value to add.
   */
  override def add(value: Double): Unit = {
    values += value
  }

  /**
   * @return All of the data as an array.
   */
  override def getData(): List[Double] = values.toList


  /**
   * Get the element specified index value.
   *
   * @param index
	 * The index to read.
   * @return The value at the specified inedx.
   */
  override def getData(index: Int): Double = {
    values(index)
  }

  /**
   * Clear any data to zero.
   */
  override def clear(): Unit = {
    values = new ArrayBuffer[Double]()
  }

  /**
   * @return How many elements are stored in this object.
   */
  override def size(): Int = {
    values.size
  }

  /**
   * Set all of the data as an array of doubles.
   *
   * @param data
	 * An array of doubles.
   */
  override def setData(data: List[Double]): Unit = {
    values :: data
  }

  /**
   * Set the specified element.
   *
   * @param index
	 * The index to set.
   * @param value
	 * The data for the specified element.
   */
  override def setData(index: Int, value: Double): Unit = {
    values(index) = value
  }
}
