package interface_retrining3;

public class MyCalTest {

	public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(1, 2);
        cal.exec(3, 4);
                
        
        int j = cal.plus(5, 6);
        System.out.println(j);
        
        System.out.println("---절취선---");
        
        int k = cal.multiple(5, 6);
        System.out.println(k);
        
        System.out.println("---절취선---");
        
        int df = cal.exec(5, 6);
        System.out.println(df);
        
//왜 자바 8에서는 default 메서드를 추가했을까요? 인터페이스를 구현하는 모든 클래스는 해당 메서드를 모두 구현해야 합니다.
//그런데 만약 인터페이스를 변경한다면 어떻게 될까요? 변경한 인터페이스를 구현하는 모든 클래스가 다시 변경 사항을 구현해야 할 것입니다.
//바로 이런 문제를 해결하기 위해 인터페이스에서 메서드를 구현할 수 있도록 default를 추가한 것입니다.
        
        int st = Calculator.exec2(7, 9);
        System.out.println("---절취선---");
        System.out.println(st);
     // static 은 인터페이스롤 직접 접근해야 사용이 가능하다.

	}

}
