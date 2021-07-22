package src.problem2;

public class ThreeSum extends TwoSum {
    int n3;
    ThreeSum(){
        super();
        this.n3 = 0;
    }
    ThreeSum(int n1, int n2, int n3){
        super(n1,n2);
        this.n3 = n3;
    }
    int Sum(){
        return super.Sum() + this.n3;
    }
}
