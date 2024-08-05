package lambda01;
// 1. We have created separate class
// 2. We have implemented Max interface
// 3. We have overridden max method in the class
// 4. We have written body to method
// 5. we have called max method
public class MaxImpl implements Max{
    @Override
    public int max(int n1, int n2) {
        if(n1 > n2){
            return n1;
        }else{
            return n2;
        }
    }
}
