public class CalculatorEvents {


    public String getOperator(int operator)
    {
        String operatorIcon ="";
        if (operator == Constants.ADDITION)
        {
            operatorIcon = "+";
        }
        else if (operator == Constants.SUBTRACTION)
        {
            operatorIcon = "-";
        }
        else if (operator == Constants.MULTIPLICATION)
        {
            operatorIcon = "*";
        }
        else if (operator == Constants.DIVISION)
        {
            operatorIcon = "/";
        }
        return operatorIcon;
    }
    public String getAnswer( int value1, int value2,int operator)
    {
        String answer ="";
        int operation;
        if (operator == Constants.ADDITION)
        {
            operation = value1 + value2;
            answer = Integer.toString(operation);
        }
        else if (operator == Constants.SUBTRACTION)
        {
            operation = value1 - value2;
            answer = Integer.toString(operation);
        }
        else if (operator == Constants.MULTIPLICATION)
        {
            operation = value1 * value2;
            answer = Integer.toString(operation);
        }
        else if (operator == Constants.DIVISION)
        {
            operation = value1 / value2;
            answer = Integer.toString(operation);
        }

        return answer;
    }
}
