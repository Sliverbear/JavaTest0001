package day4;

public class Student {
	private int studentid;
	private String studentname;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	private int score;
	public void setStudentid(int studentid)
	{
		this.studentid=studentid;
		
	}
	public int getStudentid()
	{
		return studentid;
		
	}
	
	

}