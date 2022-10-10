public class PostfixCalculator{


    private Converter conv;

    public PostfixCalculator(String input){
        conv = new Converter(input);
    }


    public double evaluate (){
        String postfix = conv.toPostFix();
        double value = 0;
        LinkedStack<String> evaluationStack = new LinkedStack<String>() ;
        String [] operationlist = postfix.split(" "); 
        for (int i=0; i<operationlist.length; i++){
            if (operationlist[i].equals("+")){
                double secondterm = Double.parseDouble(evaluationStack.pop());
                double firstterm = Double.parseDouble(evaluationStack.pop());
                double partialterm = firstterm + secondterm;
                evaluationStack.push(Double.toString(partialterm));
            }
            else if (operationlist[i].equals("-")){
                double secondterm = Double.parseDouble(evaluationStack.pop());
                double firstterm = Double.parseDouble(evaluationStack.pop());
                double partialterm = firstterm - secondterm;
                evaluationStack.push(Double.toString(partialterm));
            }
            else if (operationlist[i].equals("*")){
                double secondterm = Double.parseDouble(evaluationStack.pop());
                double firstterm = Double.parseDouble(evaluationStack.pop());
                double partialterm = firstterm * secondterm;
                evaluationStack.push(Double.toString(partialterm));
            }
            else if (operationlist[i].equals("/")){
                double secondterm = Double.parseDouble(evaluationStack.pop());
                double firstterm = Double.parseDouble(evaluationStack.pop());
                double partialterm = firstterm / secondterm;
                evaluationStack.push(Double.toString(partialterm));
            }
            else if (operationlist[i].equals("^")){
                double secondterm = Double.parseDouble(evaluationStack.pop());
                double firstterm = Double.parseDouble(evaluationStack.pop());
                double partialterm = Math.pow(firstterm, secondterm);
                evaluationStack.push(Double.toString(partialterm));
            }
            else{
                evaluationStack.push(operationlist[i]);
            }
        }
        value = Double.parseDouble(evaluationStack.pop());
        return value;

    }
}
