public class Runner {
    public static void main(String[] args) {
        LuckyNumbers numberGenerator = new LuckyNumbers();
        String luckyNums = numberGenerator.getLuckyNumbers();
        System.out.println(luckyNums);
    }
}