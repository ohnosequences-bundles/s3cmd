package ohnosequences.statika

import ohnosequences.statika._

case object S3cmd extends Bundle(Git :: Python :: HNil) {

  val metadata = generated.metadata.S3cmd

  def install[D <: DistributionAux](distribution: D): InstallResults = {
    // do someting here
    success("%s is installed" format metadata)
  }

}
