public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new RuntimeException("На 0 делить нельзя");
        }
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(int a, int b){
        return times(add(a, b), dif(a, b));
    }
}