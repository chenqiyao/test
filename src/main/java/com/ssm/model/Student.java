package com.ssm.model;

/**
 * Created by 陈齐尧 on 2019/2/23.
 */
public class Student {
    private Integer sid;
    private String sname;
    private String password;
    private String subject;
    private Double goal;

    public Student(Integer sid, String sname, String password, String subject, Double goal) {
        this.sid = sid;
        this.sname = sname;
        this.password = password;
        this.subject = subject;
        this.goal = goal;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getGoal() {
        return goal;
    }

    public void setGoal(Double goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", password='" + password + '\'' +
                ", subject='" + subject + '\'' +
                ", goal=" + goal +
                '}';
    }
}
