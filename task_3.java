@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	  this.age = age;
        this.result = result;
  }

      @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
                {0, false},
                {17, false},
                {18, true},
                {42, true}
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
      assertEquals("Возраст должен быть >= 18!", result, isAdult);
	}
}
