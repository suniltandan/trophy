package entity;

import java.util.Date;


public class StudyMoment {
	
	private Date startDate;
	private Date stopDate;
	private Student student;
	private Course course;
	private StudyType studyType;
	private int efficiency;
	private int pages;
	private String location;

	
	public StudyMoment(Course course, StudyType studyType) {
		this.course = course;
		this.studyType = studyType;
		this.startDate = new Date();
	}
	
	public StudyMoment(Course course, StudyType studytype, Date startDate, Date stopDate, int efficiency, int pages) {
		this.course = course;
		this.studyType = studyType;
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.efficiency = efficiency;
		this.pages = pages;
	}
	
	public Date getStartDate(){
		return startDate;
	}
	
	public Date getStopDate(){
		return stopDate;
	}
	
	public Course getCourse(){
		return course;
	}
	
	public StudyType getStudyType(){
		return studyType;
	}
	
	public int getEfficiency(){
		return efficiency;
	}
	
	public int getPages(){
		return pages;
	}
	
	//deze methode kan evt. nog gebruikt worden om een sessie aan te passen, is misschien nog  nuttig ooit.
	//anders kunnen deze 4 methodes weg en variabele startdate final gemaakt worden.
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	//zelfde als hierboven
	public void setStopDate(Date stopDate){
		this.stopDate = stopDate;
	}
	//zefde
	public void setEfficiency(int efficiency){
		this.efficiency = efficiency;
	}
	//zelfde
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public long getlength() {
		return startDate.getTime() - stopDate.getTime();
	}
	
	
	public void stop(int efficiency, int pages) {
		this.stopDate = new Date();
		this.efficiency = efficiency;
		this.pages = pages;
	}
	
	
	public void setLocation(String l)
	{
		location = l;
	}
	
	public String getLocation() {
		return location;
	}
	
	
	
	
	
	
	
	
	
	

}
