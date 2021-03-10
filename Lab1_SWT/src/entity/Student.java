/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author USE
 */
public class Student {
    
    private int id;
    private String code;
    private double mark;

    public Student() {
    }

    public Student(int id, String code, double mark) {
        this.id = id;
        this.code = code;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    public String getType(double mark) {
        String type = "";
        if (mark > 7.5) {
            type = "A";
        } else if (mark >= 6 && mark <= 7.5) {
            type = "B";
        } else if (mark >= 4 && mark < 6) {
            type = "C";
        } else {
            type = "D";
        }
        return type;
    }
    
    @Override
    public String toString() {
        return id + "\t" + code + "\t" + getType(mark);
    }
    
    
    
}
