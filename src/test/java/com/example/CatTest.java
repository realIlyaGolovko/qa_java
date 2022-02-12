package com.example;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundShowsMeow(){
        Cat  cat = new Cat(feline);
      String expectedResult="Мяу";
      String actualResult=cat.getSound();
      assertEquals("Ожидали слово 'Мяу' ",expectedResult,actualResult);
    }
    @Test
    public void getFoodShowsListOfPredatorFoods()throws Exception{
        Cat  cat = new Cat(feline);
        List<String> expectedResult=List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedResult);
        List<String> actualResult=cat.getFood();
        assertEquals("Ожидали другой список слов",expectedResult,actualResult);
    }
}
