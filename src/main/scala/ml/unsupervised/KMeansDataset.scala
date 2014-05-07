package scala.ml.unsupervised

import scala.ml.data.{BasicDataSet, DataSet}
import scala.math.{sqrt, pow}

/**
 * a K-Means specific dataset
 * Created by jono on 05/05/14.
 */
class KMeansDataset extends BasicDataSet {
  var closestCluster: KMeansDataset = _

  /**
   * Caluclate the euclidean distance of the currently assigned closest cluster
   * @return the eudlidean distance
   */
  def getEuclideanDistance(): Double = {
    if (closestCluster != null) {
      return this.getEuclideanDistance(closestCluster)
    }
    return 0
  }

  /**
   * Calculates the Euclidean distance of this dataset from another dataset
   * @param that another dataset we are calculating the euclidean distance
   * @return the euclidean distance
   */
  def getEuclideanDistance(that: KMeansDataset): Double = {
    if (that.size() != this.size()) {
      throw new IllegalArgumentException("That data size has to match this objects size")
    }
    var result: Double = 0;
    for (i <- 0 until size()) {
      result += pow((getData(i) - that.getData(i)), 2)
    }
    return sqrt(result)
  }


  /**
   * Calculate the difference from this to that
   * @param that the dataset to subtract from this
   * @return the a dataset that is the difference of this dataset from that
   */
  def -(that: KMeansDataset): KMeansDataset = {
    if (that.size() != this.size()) {
      throw new IllegalArgumentException("That data size has to match this objects size")
    }
    val newVal: KMeansDataset = new KMeansDataset();
    for (i <- 0 until size()) {
      newVal.add(getData(i) - that.getData(i))
    }
    return newVal
  }

  /**
   * Add a new dataset to this one
   * @param that the new dataset we are adding to this one
   */
  def +=(that: KMeansDataset): Unit = {
    if (that.size() != this.size()) {
      throw new IllegalArgumentException("That data size has to match this objects size")
    }

    for (i <- 0 until size()) {
      this.setData(i, this.getData(i) + that.getData(i))
    }
    return
  }

  /**
   * Divide this dataset by a scalar
   * @param scalar the scalar to divide by
   */
  def /=(scalar: Double): Unit = {
    for (i <- 0 until size()) {
      setData(i, getData(i) / scalar)
    }
    return
  }
}
