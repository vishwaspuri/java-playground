package src.problem2;

public class TwoSum {
    int n1;
    int n2;
    TwoSum(){
        n1 = 0;
        n2 = 0;
    }
    TwoSum(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    int Sum(){
        return this.n1+this.n2;
    }
}
