//
//
//public class Triangle {
//
//    private int a;
//    private int b;
//    private int c;
//
//    public Triangle(int a, int b, int c) {
//        setSides(a, b, c);
//    }
//
//
//    public Triangle setSides(int a, int b, int c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//        return this;
//    }
//
//    public boolean positiveNumbers() {
//
//        return a > 0 && b > 0 && c > 0;
//    } //шинима хуйня
//
//    public boolean isValidTriangle() { //у нее функция без аргументов
//        return (a + b) > c && (a + c) > b && (b + c) > a;
//
//    } //тут правильно, у нее так
//
//    public boolean ravnostoronnyTriangle(){ //у нее нет аргументов, называется экватериал(походк равносторонний)
//
//        return (a == b && b == c && a == c);
//    } //тоже вроде правильно, у нее так, но у меня неправильно бля
//
//    public boolean ravnobedrennyTriangle(){ //у нее нет аргументов, называется из регулар
//
//        return (a == b) && (b == c);
//    } //взяла как у нее
//
//
//    public boolean raznostoronnyTriangle(){   //этого у нее даже нет. што
//        return (a != b) && (a != c) && (b != c);
//    } //хз, вроде бы должно быть так
//
//    public String triangleType() {
//        String st;
//        if (positiveNumbers()) {
//            if (isValidTriangle()) {
//                if (ravnostoronnyTriangle()) {
//                    if (ravnobedrennyTriangle())
//                        st = String.format("Равнобедренный треугольник");
//                    else
//                        st = String.format("Равносторонний треугольник");
//                } else
//                    st = String.format("Разносторонний треугольник");
//            } else
//                st = String.format("Треугольник не существует");
//        } else {
//            st = String.format("Неверные данные");
//        }
//        return st;
//    }
//}



public class Triangle {

    private int a;
    private int b;
    private int c;

    public static final String RAVNOBEDRENNY_TRIANGLE = "Равнобедренный треугольник";
    public static final String RAVNOSTORONNY_TRIANGLE = "Равносторонний треугольник";
    public static final String RAZNOSTORONNY_TRIANGLE = "Разносторонний треугольник";
    public static final String WRONG_TRIANGLE = "Треугольник не существует";
    public static final String WRONG_NUMBERS = "Числа должны быть положительными";


    public Triangle(int a, int b, int c) {
        setSides(a, b, c);
    }


    public Triangle setSides(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        return this;
    }

    public boolean positiveNumbers() {

        return a > 0 && b > 0 && c > 0;
    }
    public boolean isValidTriangle() {
        return (a + b) > c && (b + c) > a && (a + c) > b;

    }

    public boolean ravnostoronnyTriangle(){
return (a == b && a == c && b == c);
    }

    public boolean ravnobedrennyTriangle(){
       return (a == b || a == c || b == c);

    }


    public boolean raznostoronnyTriangle(){   //этого у нее даже нет. што
        return (a != b) && (a != c) && (b != c);
    }

    public String triangleType() {
        String st;
        if (positiveNumbers()) {
            if (isValidTriangle()) {
                if (ravnobedrennyTriangle()) {
                    if (ravnostoronnyTriangle())
                        st = String.format(RAVNOSTORONNY_TRIANGLE);
                    else
                        st = String.format(RAVNOBEDRENNY_TRIANGLE);
                } else
                    st = String.format(RAZNOSTORONNY_TRIANGLE);
            } else
                st = String.format(WRONG_TRIANGLE);
        } else {
            st = String.format(WRONG_NUMBERS);
        }
        return st;
    }
}
