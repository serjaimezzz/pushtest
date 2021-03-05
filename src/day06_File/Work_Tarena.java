package day06_File;
//缺失文件emp.dat
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 将emp.dat文件中所有员工解析出来，并创建为若干EMP实例存入一个集合，然后输出该集合中每个员工的信息
 * 该文件800字节，每80个字节为一个员工的信息。
 * 其中：
 *    name为字符串，长度为32个字节，编码为：UTF-8，age为int，长度为4字节
 *    gender为字符串，长度为10个字节，编码为UTF-8
 *    salary为int，长度为4个字节
 *    hiredate为字符串，格式"yyyy-MM-dd",长度为30个字节，编码为UTF-8
 *    
 *    提示:
 *    使用RandomAccessFile读取字符串时，例如name,可以先读取32个字节，再按照UTF-8
 *    转换为字符串，读取age时可以直接使用readInt方法。依次类推。
 * @author zhangchi
 *
 */
public class Work_Tarena {

	public static void main(String[] args) throws IOException, ParseException {
		File file=new File("."+File.separator+"demo.txt");
		RandomAccessFile raf=new RandomAccessFile("demo.txt","r");
		
		List<Emp> empList=new ArrayList<Emp>();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<10;i++){
			//读取name的字符串
			String name= readString(32,raf);			
			
			//读取年龄
			int age=raf.readInt();
			
			//读取gender
			String gender=readString(10,raf);
			
			//读取salary
			int salary =raf.readInt();			
			
			//读取日期
			String hiredate=readString(30,raf);
			Date hire=sdf.parse(hiredate);
			
			Emp emp=new Emp(name,age,gender, salary, hire);
			empList.add(emp);
		}
		System.out.println("解析完毕！");
		for(Emp e:empList){
			System.out.println(e);
		}
		
		raf.close();
	}
	public static String readString(int len,RandomAccessFile raf) throws IOException{
		byte[] data=new byte[len];
		raf.read(data);
		return new String(data,"UTF-8").trim();
	}

}



/**
 * 定义私有属性
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法
 * 定义toString方法，格式如：
 *   张三，25，男，5000,2006-01-25
 * 定义equals方法，要求名字相同，则认为内容一致
 */
class Emp {
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hiredate;
	
	public Emp(){
		
	}
	public Emp(String name, int age, String gender, int salary, Date hiredate) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	public String toString(){
		SimpleDateFormat sdf=new SimpleDateFormat();
		return name+","+age+","+gender+","+salary+","+sdf.format(hiredate);
	}
	
	
}
