public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        // Утена проверка деления на 0
        if (b == 0) {
            throw new RuntimeException("На 0 делить нельзя");
        }
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(int a, int b){
        // Считает сложное выражение вида (a + b) * (a - b)
        return times(add(a, b), dif(a, b));
    }
}