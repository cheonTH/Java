package Ex04_16_Exam;

public class T2 extends T1{
	int a =55;
	
	void function(int i){
        System.out.print(super.a);
    }
    void function(){
        System.out.print(super.a + a);
    }
    void function(T i){
        System.out.print(a);
    }
}
