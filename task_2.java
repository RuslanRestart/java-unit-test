@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}

 @Test
    public void checkIsAdultWhenAgeIsLessThan18False(){
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(12);
        boolean expected = false;
        assertEquals("Возраст должен быть младше 18!", expected, isAdult);
    }

 @Test
    public void checkIsAdultWhenAgeIs18True(){
      Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
       assertEquals("Возраст должен быть >= 18!", true, isAdult);
        
    }
