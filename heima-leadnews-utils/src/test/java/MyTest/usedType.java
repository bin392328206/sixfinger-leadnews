package MyTest;

public enum usedType {
    PRATICE(1),
    EXAM(2);

    int Code;

    private usedType(int code){
        this.Code=code;
    }
    public  int getCode(){
        return Code;
    }



}
