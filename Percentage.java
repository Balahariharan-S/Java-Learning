public class Percentage{
	public static void main(String[]args){
		int max = 600;
		int tamil = 96;
		int english = 89;
		int maths = 79;
		int physics = 82;
		int chemistry = 84;
		int biology = 79;
		int total = tamil + english + maths + physics + chemistry + biology;
		float percentage = (float)total/max *100.0f;
		System.out.println("Percentage is : "+percentage);
	}
}