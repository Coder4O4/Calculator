public class CalculatorData {

    public static void setData(int value1, int value2, int operator, String answer)
    {
        CalculatorEvents calculatorEvents = new CalculatorEvents();
        String setOperator = calculatorEvents.getOperator(operator);
        String history = Integer.toString(value1) + " " + setOperator + " " + Integer.toString(value2) + "\n= " + answer + "\n\n";
        String previousHistory = "";

    }
}
