import org.apache.spark.sql.SparkSession

object PracticeTwo  {
  def main(args: Array[String]): Unit = {
    println("Am inside the main method baby")
    val spark = SparkSession.builder
      .appName("hello spark")
      .config("spark.master", "local")
      .getOrCreate()
    spark.conf.set("spark.driver.host","127.0.0.1")
    println("created spark session")
    val sampleSeq = Seq((1,"spark"),(2,"Big Data"))

    val df = spark.createDataFrame(sampleSeq).toDF("course id", "course name")
    df.show()
  }
}
