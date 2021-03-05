package day06_File;
//ȱʧ�ļ�emp.dat
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ��emp.dat�ļ�������Ա������������������Ϊ����EMPʵ������һ�����ϣ�Ȼ������ü�����ÿ��Ա������Ϣ
 * ���ļ�800�ֽڣ�ÿ80���ֽ�Ϊһ��Ա������Ϣ��
 * ���У�
 *    nameΪ�ַ���������Ϊ32���ֽڣ�����Ϊ��UTF-8��ageΪint������Ϊ4�ֽ�
 *    genderΪ�ַ���������Ϊ10���ֽڣ�����ΪUTF-8
 *    salaryΪint������Ϊ4���ֽ�
 *    hiredateΪ�ַ�������ʽ"yyyy-MM-dd",����Ϊ30���ֽڣ�����ΪUTF-8
 *    
 *    ��ʾ:
 *    ʹ��RandomAccessFile��ȡ�ַ���ʱ������name,�����ȶ�ȡ32���ֽڣ��ٰ���UTF-8
 *    ת��Ϊ�ַ�������ȡageʱ����ֱ��ʹ��readInt�������������ơ�
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
			//��ȡname���ַ���
			String name= readString(32,raf);			
			
			//��ȡ����
			int age=raf.readInt();
			
			//��ȡgender
			String gender=readString(10,raf);
			
			//��ȡsalary
			int salary =raf.readInt();			
			
			//��ȡ����
			String hiredate=readString(30,raf);
			Date hire=sdf.parse(hiredate);
			
			Emp emp=new Emp(name,age,gender, salary, hire);
			empList.add(emp);
		}
		System.out.println("������ϣ�");
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
 * ����˽������
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//��ְʱ��
 * 
 * ���幹�췽�����Լ�����get,set����
 * ����toString��������ʽ�磺
 *   ������25���У�5000,2006-01-25
 * ����equals������Ҫ��������ͬ������Ϊ����һ��
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
