package com.github.perscholas;

/**
 * Created by leon on 7/14/2020.
 */
public class GradeEvaluator {
    char gradeChar;


    public Boolean isGradeA(Double score) {
        if(score<=100 && score>=90){
            return true;
        }else
            return false;
    }

    public Boolean isGradeB(Double score) {
        if(score<=89 && score>=80){
            return true;
        }else
            return false;
    }

    public Boolean isGradeC(Double score) {
        if(score<=79 && score>=70){
            return true;
        }else
            return false;
    }

    public Boolean isGradeD(Double score) {
        if(score<=69 && score>=65){
            return true;
        }else
            return false;
    }

    public Boolean isGradeF(Double score) {
        if(score<64){
            return true;
        }else
            return false;
    }

    public Character getGrade(Double score) {
        if(isGradeD(score)){
            gradeChar='D' ;
            }else if(isGradeC(score)){
            gradeChar='C';
            }else if(isGradeB(score)) {
            gradeChar = 'B';
            }else if(isGradeA(score)) {
            gradeChar = 'A';
            }else {
            gradeChar = 'F';
            }

             return gradeChar;
    }
}
