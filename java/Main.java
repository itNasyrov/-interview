import java.util.*;
import java.lang.*;

class Main {
    /**
     * Какой результат выполнения функции returnExample
     *
     * @return ???
     */
    public static int returnExample() {
        try {
            throw new RuntimeException("Ошибка");
        } catch (RuntimeException ignore) {
            return 1;
        } finally {
            return 2;
        }
    }

    /**
     * Проверить результаты выполения
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("returnExample = " + returnExample());
    }
}