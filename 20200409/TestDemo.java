

public class TestDemo{
public static void main(String[] args) {
	int  a = 3; byte b = a;
}

public static void main13(String[] args) {
	double x=2.0; 
	int y=4; 
	x/=++y; 
	System.out.println(x);
}
/**
 * 
 * 隐式类型转换： 把一个小类型数据给大类型
 * 显示类型转换： 把一个大类型数据给小类型  需要强制类型转换
 * @param args [description]
 */

public static void main12(String[] args) {
	//int a = 10;
	//long b = a;//隐式类型转换
	//long a = 10L;
	//int b = (int)a;//显示类型转换
	//System.out.println(b);
    //int b = 10;
    // boolean c = b;//int 无法转换成 boolean
    // 
    // 
    //int num = 10;
    //String str1 = num + "";//方法1
    //String str2 = String.valueOF(num);//方法2
    //把一个整型转换成字符串的方法
    //
    String str = "100";
    int num = Integer.parseInt(str);//字符串转换成整型
    System.out.println(num);
}


/**
 * 
 * 常量只能被初始化一次  且使用的时候一定要初始化
 * @param args [description]
 */
//变量命名的时候 使用小驼峰命名法
public static void main11(String[] args) {
	final int MAXNUM ; //final关键字修饰的常量
	MAXNUM = 999;

   	System.out.println(MAXNUM);
}



/**
 * 
 * 小于4个字节的数据类型运算的时候  会发生类型的提升
 * @param args [description]
 */
public static void main10(String[] args) {
	byte b = 10;
	byte c = 20;
	byte d = (byte)(b+c);
	System.out.println(d);
}


/**
 * 
 * 字符串数据类型
 * String
 * @param args [description]
 */
public static void main9(String[] args) {
	//String str = "\"Hello\"";
	String str = "\\\"Hello\\\"";
	System.out.println(str);
}



/**
 * 布尔类型
 * 1.在Java中  布尔类型没有明确的大小
 * 2.在Java中  布尔类型只有两个取值  true和false
 * 3.在Java中  没有所谓的 0 是假  非0 是真
 *   真只有true   假只有false
 * 4.Boolean
 * @param args [description]
 */
public static void main8(String[] args) {
	boolean flg = false;
	System.out.println(flg);
}



/**
 * 
 * 短整型： short   2个字节   -32768--32767
 * @param args [description]
 */

public static void main7(String[] args) {
		short sh = 12;
		System.out.println(Short.MAX_VALUE);
	    System.out.println(Short.MIN_VALUE);
}

/**
 * 
 * 字节：byte  1个字节   数值  -128--127
 * 每一种数据类型给它赋值时 一定不能超过它的赋值范围
 * @param args [description]
 */
public static void main6(String[] args) {
	byte b = 12;
	byte c = 21;
	System.out.println(b+" " +c);
	System.out.println(Byte.MAX_VALUE);//最大值为127
	System.out.println(Byte.MIN_VALUE);//最小值为-128

	//byte d = Byte.MAX_VALUE + 1;//127 + 1
//类型的提升
	System.out.println(Byte.MAX_VALUE + 1);//默认是以整型进行打印的

    byte d = 127; 

    int i = 2147483647;//    2147483647
    System.out.println(Integer.MAX_VALUE );
}
 

/**
 * 
 * 字符数据类型
 *    char  占2个字节   0-65535
 *    Unicode--> 包含了很多，比如：中文  范围更广了
 *    对应包装类 Character
 * @param args [description]
 */

public static void main5(String[] args) {
	char ch = 'a' ;
	System.out.println(ch);
	
	char ch2 = '刘' ;
	System.out.println(ch2);

	char ch3 = 97 ;
	System.out.println(ch3);
}



/**
 * 
 *
 * 单精度浮点型  float
 * 1. double  8个字节
 * 2. float   4个字节
 * @param args [description]
 */

public static void main4(String[] args) {
	float f =12.3f;
	System.out.println(f);
}
//在java中不允许把一个double类型的值 直接赋值给float 编译错误






/**
 * 
 * 双精度 浮点型
 * @param args [description]
 */
public static void main3(String[] args) {
	double d = 12.5;//12.5 默认就是双精度类型
	System.out.println(d);
	System.out.println(Double.MAX_VALUE);
	System.out.println(Double.MIN_VALUE);

	//int a = 1;
	//int b = 2;
	//System.out.println(a / b);//a和b都是整形

	//double a = 1.0;
	//double b = 2.0;
	//System.out.println(a / b);
	
	double num = 1.1;
	System.out.println(num * num);
}




public static void main2(String[] args) {//args是运行时命令行参数
	for(int i = 0;i < args.length; i++){
		System.out.println(args[i]);
	}
	System.out.println("kaixin");
}


/**
 * 长整型
 * @param args [description]
 */
	public static void main1(String[] args) {
		

		long a = 10L;
		System.out.println("a的值是: " + a);
		System.out.println("最大值：" + Long.MAX_VALUE);// +表示拼接
		System.out.println("最小值：" + Long.MIN_VALUE);
		int b = 10;
        int c = 20;
        System.out.println(b + c);
        // 注意： 任何类型的数据 和 字符串拼接 结果就是字符串
        System.out.println("hhh" + (b + c));
	}
}



