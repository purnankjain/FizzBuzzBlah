package knanrup;

public class FizzBuzz {
    int x;

    public FizzBuzz(int x) {
        this.x = x;
    }

    private boolean isFizz(){
        if(x%3 == 0){
            return true;
        }
        return false;
    }

    private boolean isBuzz(){
        if(x%5 == 0){
            return true;
        }
        return false;
    }

    public String findFizzBuzz() {
        String ans = "";
        boolean flag = false;

        if(isFizz()){
            ans += "Fizz";
            flag = true;
        }

        if(isBuzz()) {
            flag = true;
            ans += "Buzz";
        }

        if(flag){
            return ans;
        }
        else{
            return "Blah";
        }
    }
}
