name := "crf-spark_2.2"

version := "0.2.0"

scalaVersion := "2.11.12"

spName := "hqzizania/crf-spark"

sparkVersion := "2.2.2"

sparkComponents += "mllib"

libraryDependencies += "org.scalanlp" %% "breeze" % "0.13.2"

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

