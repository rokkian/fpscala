



final class log_eg$u002Eworksheet$_ {
def args = log_eg$u002Eworksheet_sc.args$
def scriptPath = """log_eg.worksheet.sc"""
/*<script>*/
import org.apache.logging.log4j.scala.Logging
import org.apache.logging.log4j.Level
 
class MyClass extends BaseClass with Logging {
  def doStuff(): Unit = {
    logger.info("Doing stuff")
  }
  def doStuffWithLevel(level: Level): Unit = {
    logger(level, "Doing stuff with arbitrary level")
  }
}
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object log_eg$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new log_eg$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export log_eg$u002Eworksheet_sc.script as log_eg$u002Eworksheet

