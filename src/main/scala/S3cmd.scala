package ohnosequences.statika

import ohnosequences.statika._
import sys.process._

case object S3cmd extends Bundle(Git :: Python :: HNil) {

  val metadata = generated.metadata.S3cmd

  // Adding method to run commands from a given path
  implicit class PBAt(cmd: Seq[String]) {
    implicit def @@(path: String): ProcessBuilder =
      Process(cmd, new java.io.File(path), "" -> "")
  }

  def install[D <: DistributionAux](distribution: D): InstallResults = {

    val trace = List[ProcessBuilder](
      Seq("git", "clone", "https://github.com/s3tools/s3cmd.git")
    , Seq("python", "setup.py", "install") @@ "s3cmd"
    ).foldLeft(List[InstallResult]()){ (acc, cmd) => 
      if (acc exists (_.isLeft)) acc
      else if (cmd.! != 0) acc ::: failure(cmd.toString)
      else acc ::: success(cmd.toString)
    }

    if (trace exists (_.isLeft)) trace
    else success("%s is installed" format metadata)
  }

}
