public class CompareExamples {

    Integer a = new Integer(1);
    Integer b = new Integer(1);
    Integer c = Integer.valueOf(1);
    Integer d = Integer.valueOf(1);

    /**
     * Что выведется на экран при вызове метода?
     */
    public void compare() {
        boolean fst = a == b;
        Integer b = a;
        boolean snd = a == b;
        boolean thrd = c == d;
        boolean frth = 1 == b;
        System.out.println("FIRST " + fst);
        System.out.println("SECOND " + snd);
        System.out.println("THIRD " + thrd);
        System.out.println("FOURTH " + frth);
    }
}
