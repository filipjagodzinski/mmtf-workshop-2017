package edu.sdsc.mmtf.exercises;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;
import java.util.List;

public class Problem09 {

	/** FlatMapToPair() on JavaPairRDD example.
	 *
	 * @author Yana Valasatava
	 */

	public static void main(String[] args) {

		SparkConf conf = new SparkConf().setMaster("local[*]").setAppName(Problem09.class.getSimpleName());
		JavaSparkContext sc = new JavaSparkContext(conf);

		List<Tuple2<String, Integer>> data = Arrays.asList(
				new Tuple2<String, Integer>("first", 2),
				new Tuple2<String, Integer>("second", 4));

		JavaRDD<Tuple2<String, Integer>> rdd = sc.parallelize(data);
		JavaPairRDD<String, Integer> pairRdd = JavaPairRDD.fromJavaRDD(rdd);

		// TODO
		//


		sc.close();
	}
}
