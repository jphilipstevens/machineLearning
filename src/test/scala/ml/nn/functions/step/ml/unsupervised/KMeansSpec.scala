package scala.ml.nn.functions.step.ml.unsupervised

import org.specs2.mutable.Specification
import scala.collection.mutable.ArrayBuffer
import scala.ml.unsupervised.{KMeans, KMeansDataset}

/**
 * This is a spec for testing K-Means clustering
 * Created by jono on 06/05/14.
 */
class KMeansSpec extends Specification {


  "KMeans" should {

    "allow you to cluster a list of points in a simple way" in {
      val dataBuffer: ArrayBuffer[KMeansDataset] = new ArrayBuffer[KMeansDataset]()

      var dataset: KMeansDataset = new KMeansDataset()
      dataset.add(1.0)
      dataset.add(1.0)
      dataBuffer += dataset

      dataset = new KMeansDataset()
      dataset.add(1.5)
      dataset.add(2.0)
      dataBuffer += dataset

      dataset = new KMeansDataset()
      dataset.add(3.0)
      dataset.add(4.0)
      dataBuffer += dataset

      dataset = new KMeansDataset()
      dataset.add(5.0)
      dataset.add(7.0)
      dataBuffer += dataset

      dataset = new KMeansDataset()
      dataset.add(3.5)
      dataset.add(5.0)
      dataBuffer += dataset

      dataset = new KMeansDataset()
      dataset.add(4.5)
      dataset.add(5.0)
      dataBuffer += dataset

      dataset = new KMeansDataset()
      dataset.add(3.5)
      dataset.add(4.5)
      dataBuffer += dataset

      val meansAlgorithm: KMeans = new KMeans(dataBuffer.toList, 2)
      meansAlgorithm.eval()

    }

  }
}