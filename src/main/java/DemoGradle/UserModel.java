package DemoGradle;

public class UserModel {
	private String name;
	private int age;
	public UserModel(String name, int age) {
		this.name = name;
		this.age = age;
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

	public static void main(String[] args) {
		UserModel user1=new UserModel("Ashutosh", 11);
		UserModel user2=new UserModel("Ashutosh", 11);
		System.out.println(user1==user2);
		System.out.println(user1.equals(user2));
		System.out.println(user1.name.equals(user2.name));
		System.out.println(user1.name==user2.name);
	}
//	binary search[12,45,56,76]
//	lowest=0;highest=3;mid=1+3/2=2;
//	lowest=mid+1;highest=highest;
//	highest=mid-1;
//	lowest=lowest
//	[1,2,3,4,5,6,7,8,9,10,11]
//	highest=11;lowest=1;
//	n**n
	

}
