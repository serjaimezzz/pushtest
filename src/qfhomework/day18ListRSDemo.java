package qfhomework;
import java.util.*;
import java.io.*;
public class day18ListRSDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
	/*	BufferedReader br = new BufferedReader(new FileReader("D:\\MyProject\\day18\\source.txt"));
		List<User> list = new ArrayList<>();
//		String[] arr = null;
		String line = null;
		while((line = br.readLine()) != null){	//按行读取		
//			System.out.println(line);
			 list.add(new User(line));
		}
		System.out.println(list);	
		
//		list = removeDupID(list);
//		System.out.println(list);
		
		int max = 0,min = list.get(0).getLevel(), sum = 0;
		for(int i = 0;i < list.size();i++){
			int level = list.get(i).getLevel();
			if(max < level)
				max = level;
			if(min > level)
				min = level;
			sum += level;
		}
		System.out.println("max:" + max +",min:" + min + ",sum:" + sum + "avr:"+(double)(sum/list.size()));
	
		list.sort((t1,t2)->{
			User u1 = (User)t1;
			User u2 = (User)t2;
			return t2.getLevel() - t1.getLevel();
		});
		System.out.println(list);
	*/
		writeObj();
		readObj();
//		br.close();
		
	}
	public static void writeObj()throws IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\MyProject\\day18\\source.txt"));
		oos.writeObject(new User("oos",1));
		oos.close();
	}
	
	public static void readObj()throws IOException,ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\MyProject\\day18\\source.txt"));
		User p = (User)ois.readObject();
		System.out.println(p.getUsername()+","+p.getId());
		ois.close();
	}
	
	//去重
	public static ArrayList<User> removeDupID(List<? extends User> list){
		ArrayList<User> list1 = new ArrayList<>();
		for(int i = 0;i < list.size();i++){
			Object o = list.get(i);
			if(!(list1.contains(o))){
				list1.add((User) o);
			}
		}
		return list1;
	}
	
	
}
class User implements Comparator<User>,Serializable
{
	private static final long serialVersionUID = 1L; 	//序列化
	private String username;
	private String password;
	private int id;
	private int level;
	User(){}
	User(String username,int id){
		this.username = username;
		this.id = id;
	}
	User(String username,String password,int id,int level){
		this.username = username;
		this.password = password;
		this.id = id;
		this.level = level;
	}
	User(String str){
		String[] arr = str.split(",");
//		for (String string : arr) {
//			System.out.println(string);
//		}
		for (int i = 0; i < arr.length; i++) {
			String[] array = arr[i].split("=");	
			array[0] = array[0].trim();
			array[1] = array[1].trim();
			if(array[0].equals("username")  || array[0].equals("yonghu"))
				this.username = array[1];
//			System.out.println(getUsername());
			if(array[0].equals("password")  || array[0].equals("mima"))
				this.password = array[1];
			if(array[0] .equals("id"))
				this.id = Integer.parseInt(array[1]);
			if(array[0].equals("level")  || array[0].equals("dengji"))
				this.level = Integer.parseInt(array[1]);
		}
	
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String toString(){
		return username + "," + password + "," + id + "," + level;
	}
	
	public boolean equals(Object o){
		if(!(o instanceof User))
			throw new ClassCastException("类型不匹配");
		else{
			User u = (User)o;
			return this.getId() == u.getId();
		}
	}
	
	@Override
	public int compare(User o1, User o2) {
		return o2.getLevel() - o1.getLevel();
	}
}