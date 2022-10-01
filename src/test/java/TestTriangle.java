

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */

public class TestTriangle {
    protected Triangle triangle;
    @BeforeClass
    public void setUp(){
        triangle = new Triangle(0, 0, 0);
    }



    @DataProvider()
    public Object[][] positiveData(){
        return new Object[][]{
                {triangle.setSides(1, 45575, 1).positiveNumbers(), true},
                {triangle.setSides(7, 1470000, 7).positiveNumbers(), true},
                {triangle.setSides(-1, 2, 5).positiveNumbers(), false}
        };
    }


    @DataProvider()
    public Object[][] triangleData(){
        return new Object[][]{
                {triangle.setSides(1, 1, 2).isValidTriangle(), false},
                {triangle.setSides(1, 1, 3).isValidTriangle(), false},
                {triangle.setSides(1, -1, 1).isValidTriangle(), false},
                {triangle.setSides(1, 1, 0).isValidTriangle(), false},
                {triangle.setSides(1, 1, 1000000001).isValidTriangle(), false},
                {triangle.setSides(2, 3, 4).isValidTriangle(), true},
                {triangle.setSides(1470001, 1470000, 1470009).isValidTriangle(), true},
                {triangle.setSides(2, 3, 1).isValidTriangle(), false}
        };
    }




    @DataProvider()
    public Object[][] ravnostoronnyTriangleData(){
        return new Object[][]{
                {triangle.setSides(1, 1, 1).ravnostoronnyTriangle(), true},
                {triangle.setSides(1000000000, 1000000000, 1000000000).ravnostoronnyTriangle(), true},
                {triangle.setSides(8, 6, 6).ravnostoronnyTriangle(), false},
                {triangle.setSides(6, 8, 10).ravnostoronnyTriangle(), false}
        };
    }

    @DataProvider()
    public Object[][] ravnobedrennyTriangleData(){
        return new Object[][]{
                {triangle.setSides(1, 2, 2).ravnobedrennyTriangle(), true},
                {triangle.setSides(2, 1, 2).ravnobedrennyTriangle(), true},
                {triangle.setSides(2, 2, 1).ravnobedrennyTriangle(), true},
                {triangle.setSides(999999999, 1000000000, 1000000000).ravnobedrennyTriangle(), true},
                {triangle.setSides(1000000000, 999999999, 1000000000).ravnobedrennyTriangle(), true},
                {triangle.setSides(1000000000, 1000000000, 999999999).ravnobedrennyTriangle(), true},
                {triangle.setSides(4, 5, 6).ravnobedrennyTriangle(), false},
        };
    }

    @DataProvider()
    public Object[][] raznostoronnyTriangleData(){
        return new Object[][]{
                {triangle.setSides(2, 3, 4).raznostoronnyTriangle(), true},
                {triangle.setSides(2, 4, 3).raznostoronnyTriangle(), true},
                {triangle.setSides(3, 2, 4).raznostoronnyTriangle(), true},
                {triangle.setSides(3, 4, 2).raznostoronnyTriangle(), true},
                {triangle.setSides(4, 3, 2).raznostoronnyTriangle(), true},
                {triangle.setSides(4, 2, 3).raznostoronnyTriangle(), true},
                {triangle.setSides(999999998, 999999999, 1000000000).raznostoronnyTriangle(), true},
                {triangle.setSides(999999998, 1000000000, 999999999).raznostoronnyTriangle(), true},
                {triangle.setSides(999999999, 999999998, 1000000000).raznostoronnyTriangle(), true},
                {triangle.setSides(999999999, 1000000000, 999999998).raznostoronnyTriangle(), true},
                {triangle.setSides(1000000000, 999999999, 999999998).raznostoronnyTriangle(), true},
                {triangle.setSides(1000000000, 999999998, 999999999).raznostoronnyTriangle(), true},
                {triangle.setSides(2, 2, 3).raznostoronnyTriangle(), false},
                {triangle.setSides(14, 12, 14).raznostoronnyTriangle(), false},

        };
    }

    @DataProvider()
    public Object[][] triangleType(){
        return new Object[][]{
                {triangle.setSides(2, 2, 3).triangleType(),String.format(Triangle.RAVNOBEDRENNY_TRIANGLE)},
                {triangle.setSides(14, 14, 14).triangleType(),String.format(Triangle.RAVNOSTORONNY_TRIANGLE)},
                {triangle.setSides(6, 8, 10).triangleType(),String.format(Triangle.RAZNOSTORONNY_TRIANGLE)}
        };
    }






    @Test(dataProvider = "positiveData")
    public void validatepositiveNumbers(boolean actualResult, boolean expectedResult){
        Assert.assertEquals(actualResult, expectedResult, "неверные данные");
    }


    @Test(dataProvider = "triangleData")
    public void validateTriangleData(boolean actualResult, boolean expectedResult){
        Assert.assertEquals(actualResult, expectedResult, "треугольник не существует");
    }


    @Test(dataProvider = "ravnostoronnyTriangleData")
    public void validateRavnostoronnyTriangle(boolean actualResult, boolean expectedResult){
        Assert.assertEquals(actualResult, expectedResult, "неверные данные");
    }

    @Test(dataProvider = "ravnobedrennyTriangleData")
    public void validateRavnobedrennyTriangle(boolean actualResult, boolean expectedResult){
        Assert.assertEquals(actualResult, expectedResult, "неверные данные");
    }

    @Test(dataProvider = "triangleType")
    public void checkingTriangleType(String actualResult, String expectedResult){
        Assert.assertEquals(actualResult, expectedResult, "треугольник не существует");
    }

    @Test(dataProvider = "raznostoronnyTriangleData")
    public void validateRaznostoronnyTriangle(boolean actualResult, boolean expectedResult){
        Assert.assertEquals(actualResult, expectedResult, "неверные данные");
    }
}