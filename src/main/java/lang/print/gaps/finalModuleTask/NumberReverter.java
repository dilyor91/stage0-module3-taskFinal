package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static  void revert(int number) {
        int reverse = (number%10)*100 + (number/10%10)*10 + number/100;
        System.out.println(reverse);
    }
}
