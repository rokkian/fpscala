import org.slf4j.LoggerFactory
      
object MyApp:
  private val logger = LoggerFactory.getLogger(MyApp.getClass)

  // con la notazione nuova si possono inserire gli argomenti con tipo per il lancio
  @main def hello(name: String, age: Int = 3): Unit =

    println("Hello world!")
    println(msg)
    println(s"You are $name and are $age")

    logger.info("Hello world!")
    logger.debug(msg)
    logger.error(s"You are $name and are $age")

  def msg = "I was compiled by Scala 3. :)"


// Vecchio modo, basato su Java di fare il main:
// object Hello:
//   def main(args: Array[String]): Unit = println("HEllo Worlds!")