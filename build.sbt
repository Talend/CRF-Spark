name := "crf-spark_1.6"

moduleName := name.value

version := "0.2.0"

scalaVersion := "2.10.4"

spName := "hqzizania/crf-spark"

sparkVersion := "1.6.3"

sparkComponents += "mllib"

libraryDependencies += "org.scalanlp" %% "breeze" % "0.11.2"

resolvers += Resolver.sonatypeRepo("public")

/********************
  * Release settings *
  ********************/

spShortDescription := "crf-spark"

spDescription := """A Spark-based implementation of Conditional Random Fields (CRFs) for labeling sequential data""".stripMargin

credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials")

licenses += "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")

spIncludeMaven := false

credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials")

