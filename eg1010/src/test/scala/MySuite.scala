// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {
  test("example test that succeeds") {
    val obtained = 42
    val expected = 42
    assertEquals(obtained, expected)
  }

  test("funct3 equal 3"){
    val obtained = func3
    val expected = 3
    assertEquals(obtained, expected)
  }
}
