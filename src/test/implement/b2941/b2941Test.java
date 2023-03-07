package implement.b2941;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("크로아티아 알파벳")
public class b2941Test {
    public B2941 main = new B2941();

    @Test
    @DisplayName("예제 1번 - ljes=njak  6 나와야한다.")
    public void ex1() {
        //when
        int result = main.solve("ljes=njak");
        //then
        assertEquals(result, 6);
    }

    @Test
    @DisplayName("예제 2번 - ddz=z= 갯수가 3 나와야한다.")
    public void ex2() {
        //when
        int result = main.solve("ddz=z=");
        //then
        assertEquals(result, 3);
    }

    @Test
    @DisplayName("예제 3번 nljj 3이 나와야 한다. ")
    public void ex3() {
        //when
        int result = main.solve("nljj");
        //then
        assertEquals(result, 3);
    }

    @Test
    @DisplayName("예제 4번 c=c= 결과값은 2")
    public void ex4() {
        //when
        int result = main.solve("c=c=");
        //then
        assertEquals(result, 2);
    }

    @Test
    @DisplayName("에제 5번 dz=ak 결과값3")
    public void ex5() {
        //when
        int result = main.solve("dz=ak");
        //then
        assertEquals(result, 3);
    }

    @Test
    @DisplayName("에제 6번 dz=akc- 결과값4")
    public void ex6() {
        //when
        int result = main.solve("dz=akc-");
        //then
        assertEquals(result, 4);
    }
}
