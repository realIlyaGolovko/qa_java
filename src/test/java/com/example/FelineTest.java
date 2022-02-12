package com.example;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    private  Feline feline;
    @Before
    public void createObject(){
        feline = new Feline();
    }
    @Test
    public void eatMeatShowsShowsListOfPredatorFoods() throws Exception {
    List<String> expectedResult=List.of("Животные", "Птицы", "Рыба");
    List<String> actualResult=feline.eatMeat();
    assertEquals("Ожидали другой список еды",expectedResult,actualResult);
    }
    @Test
    public void getFamilyReturnFeline(){
    String expectedResult="Кошачьи";
    String actualResult=feline.getFamily();
    assertEquals("Ожидали слово 'Кошачьи'",expectedResult,actualResult);
    }
    @Test
    public void getKittensWithTwoCountShowsTwo(){
    int expectedResult=2;
    int actualResult=feline.getKittens(2);
    assertEquals("Ожидали число 2",expectedResult,actualResult);
    }
    @Test
    public void getKittensWithDefaultParametrShowsOne(){
     int expectedResult=1;
     int actualResult=feline.getKittens();
     assertEquals("Ожидали число 1",expectedResult,actualResult);
    }

}
