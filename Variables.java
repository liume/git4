public class Variables{
	public int a;
	public void test1(){
		System.out.println("test1:"+a);
	}
	public void test2(){
		System.out.println("test2:"+a);
	}
	public static void main(String[] args){
		Variables vrs=new Variables();//a=0
		vrs.test1();//a=0
		vrs.a++;//a=1
		vrs.test2();//a=1
		Variables vrs2=new Variables();
		vrs2.test2();//a=0
	}
}