package interface_retrining3;

public interface Calculator {
	
    public int plus(int i, int j);
    public int multiple(int i, int j);
    
    default int exec(int i, int j) {
        return i + j;
    }
        
   public static int exec2(int i, int j) {
       return i * j; // static 은 인터페이스롤 직접 접근해야 사용이 가능하다.
    }
}
