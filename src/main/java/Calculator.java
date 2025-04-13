/**
 * Класс Calculator предоставляет базовые арифметические операции
 * и реализует шаблон проектирования Singleton для создания единственного экземпляра.
 */

public class Calculator {

    private static Calculator instance;

    /**
     * Приватный конструктор для предотвращения создания экземпляров класса извне.
     */
    private Calculator() {
    }

    /**
     * Возвращает единственный экземпляр класса Calculator.
     * Если экземпляр еще не создан, он создается.
     *
     * @return единственный экземпляр класса Calculator
     */
    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    /**
     * Складывает два числа.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма чисел a и b
     */
    public int plus(int a, int b) {
        return a + b;
    }

    /**
     * Вычитает второе число из первого.
     *
     * @param a первое число
     * @param b второе число
     * @return разность чисел a и b
     */
    public int dif(int a, int b) {
        return a - b;
    }

    /**
     * Делит первое число на второе.
     * Если второе число равно 0, выбрасывает исключение NullPointerException.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления a на b
     * @throws NullPointerException если делитель равен 0
     */
    public int div(int a, int b) {
        if (b == 0) {
            throw new NullPointerException("На 0 делить нельзя");
        }
        return a / b;
    }

    /**
     * Умножает два числа.
     *
     * @param a первое число
     * @param b второе число
     * @return произведение чисел a и b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Вычисляет сложное выражение вида (a + b) * (a - b).
     *
     * @param a первое число
     * @param b второе число
     * @return результат выражения (a + b) * (a - b)
     */
    public int calculateExpression(int a, int b) {
        return multiply(plus(a, b), dif(a, b));
    }
}