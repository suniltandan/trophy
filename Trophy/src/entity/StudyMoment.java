package entity;

import java.util.Date;


public class StudyMoment {
	
	private Date startDate;
	private Date stopDate;
	private Course course;
	private int efficiency;
	private StudyType studyType;
	
	public StudyMoment(Course c, Date startd, StudyType sp){
	course = c;
	startDate = startd;
	studyType = sp;
	}
	
	public void setStopDate(Date stopd){
		stopDate = stopd;
	}
	
	public void setEfficiency(int eff){
		efficiency = eff;
	}
	
	public Course getCourse(){
		return course;
	}
	
	public long getlength(){
		long startlong = startDate.getTime();
		long stoplong = stopDate.getTime();
		long length=stoplong - startlong;
		return length;
	}
	
	public Date getStartDate(){
		return startDate;
	}
	
	public Date getStopDate(){
		return stopDate;
	}
	
	public StudyType getType(){
		return studyType;
	}
	
	public int getEfficiency(){
		return efficiency;
	}

}
