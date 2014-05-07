package scala.ml.unsupervised

import scala.collection.mutable.ArrayBuffer
import scala.math.{random}
import scala.collection.immutable.HashSet

/**
 * Performs a K-Means clustering algorithm
 * Created by jono on 05/05/14.
 */
class KMeans(val dataSet: List[KMeansDataset], val kMeansSize: Int) {

  /**
   * The K-Means
   */
  val kMeans = {
    val kMeansArrBuf = new ArrayBuffer[KMeansDataset](kMeansSize)
    val usedDatasets = new HashSet[Int]()
    for (i <- 1 until kMeansSize) {
      val dataSetIndex = (random * dataSet.size).intValue()
      if (!usedDatasets.contains(dataSetIndex)) {
        kMeansArrBuf += dataSet(dataSetIndex)
      }
    }
    kMeansArrBuf.toList
  }

  /**
   * Execute the clustering algorithm iternation
   */
  def eval() = {
    for (aDataSet <- dataSet) {
      for (aKMeans <- kMeans) {
        val dist = aDataSet.getEuclideanDistance(aKMeans)
        if (dist < aDataSet.getEuclideanDistance()) {
          aDataSet.closestCluster = aKMeans
        }
      }
    }

    for (aKMeans <- kMeans) {
      var count: Int = 0
      aKMeans.clear()
      for (aDataSet <- dataSet) {
        if (aKMeans == aDataSet.closestCluster) {
          aKMeans += aDataSet
          count += 1
        }
      }
      aKMeans /= count
    }
  }
}
