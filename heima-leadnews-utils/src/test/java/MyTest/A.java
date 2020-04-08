package MyTest;

import lombok.Data;

import java.util.HashMap;

@Data
public final class A {

    static A a1 = new A();

    static String a = "aaa";
    int B;

    static volatile A a2;

    private A() {

    }

    public static String getA() {
        return a;
    }

    public void changeAAA(String str) {
        this.a = str;
    }

    public static A getA1() {
        return a1;
    }

    public static A getA2() {
        if (null == a2) {
            synchronized (A.class) {
                a2 = new A();
            }
        }
        return a2;
    }


}
