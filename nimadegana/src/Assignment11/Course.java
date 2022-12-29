package Assignment11;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course_info")
public class Course {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int cid;
private String cnmae;
private int cduration;
@ManyToOne
private Teacher teacher;
private String cname;
public Course() {
	super();
	//TODO Auto-generated constructor stub
	
}
public Course(int cid,String cname,int cduration,Teacher teacher) {
	super();
	this.cid=cid;
	this.cname=cname;
	this.cduration=cduration;
	this.teacher=teacher;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCnmae() {
	return cnmae;
}
public void setCnmae(String cnmae) {
	this.cnmae = cnmae;
}
public int getCduration() {
	return cduration;
}
public void setCduration(int cduration) {
	this.cduration = cduration;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}


}

}
