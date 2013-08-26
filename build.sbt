name := "s3cmd"

description := "A bundle for s3cmd tool"

homepage := Some(url("https://github.com/ohnosequences/s3cmd"))

licenses := Seq("AGPLv3" -> url("http://www.gnu.org/licenses/agpl-3.0.txt"))

// fully qualified name(s) of your bundle object(s)
bundleObjects := Seq("ohnosequences.statika.S3cmd")

libraryDependencies ++= Seq( "ohnosequences" %% "git" % "0.6.0" ,  "ohnosequences" %% "python" % "0.1.0" ) 