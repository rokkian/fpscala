package funsets

/**
 * This class is a test suite for the methods in object FunSets.
 *
 * To run this test suite, start "sbt" then run the "test" command.
 */
class FunSetSuite extends munit.FunSuite:

  import FunSets.*

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }

  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   *
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   *
   *   val s1 = singletonSet(1)
   *
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   *
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   *
   */

  trait TestSets:
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)

  /**
   * This test is currently disabled (by using .ignore) because the method
   * "singletonSet" is not yet implemented and the test would fail.
   *
   * Once you finish your implementation of "singletonSet", remove the
   * .ignore annotation.
   */

    // qui la dicitura .ignore dopo la stringa evita che il test sia eseguito
    //test("singleton set one contains one".ignore) {
    test("singleton set one contains one") {
    
    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3".
     */
    new TestSets:
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
      assert(contains(s2, 2), "Singleton 2")
  }

  test("union contains all elements of each set") {
    new TestSets:
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
  }

  test("union contains all elements of each set") {
    new TestSets:
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
  }

  test("forAll testing"){
    new TestSets:
      assert(forall(s1, (x: Int) => x == 1), "ForAll got the s1 right for {1}")
      assert(!forall(s1, (x: Int) => x == 0), "ForaAll checks wrong")
  }

  test("exists testing"){
    new TestSets:
      val s12 = union(s1, s2)
      val set = FunSets.toString(s12)
      assert(exists(s12, x => x==1), "exist doesn't work on at least one value")
      assert(!exists(s12, x => x==0), s"exist find value that do not exists: 0 in ${set}")
  }

  test("map works on the sets"){
    new TestSets:
      val s2_mapped = map(s1, x => x*2)
      assert(s2_mapped(2), "Map wronged the apply x2")
      assert(!s2_mapped(1), "Map mantained old values")
      assert(!s2_mapped(0), "Map completely wrong!!")
  }



  import scala.concurrent.duration.*
  override val munitTimeout = 10.seconds
