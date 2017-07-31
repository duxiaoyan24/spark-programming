package com.duxiaoyan.spark.learn

import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by du on 2017-07-30.
 */
object Demo {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("debug").setMaster("local")
    val sc = new SparkContext(conf)

    val array: Array[Int] = new Array[Int](100000)
    println(sc.parallelize(array).sample(false, 0.05).count())

    sc.stop()
  }
}
