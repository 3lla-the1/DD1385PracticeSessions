public class AdditionOperation extends ComputationTemplate {
    
    @Override
    int operation1(int operand1, int operand2) {
        return operand1 + operand2;
    }

    @Override
    public int operation2(int result){
        return result*100;
    }
}
