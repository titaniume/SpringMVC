package com.bhome.springmvc04.entites;

import java.util.Arrays;

public class Person {
    private boolean isMarried; //是否结婚
    private String  [] hobbies; //爱好
    private String education; //学历



    public boolean getIsMarried() {
        return isMarried;
    }
    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "isMarried=" + isMarried +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", education='" + education + '\'' +
                '}';
    }
}
