/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import entity.Student;
import java.util.List;

/**
 *
 * @author USE
 */
public class Feature5 {
    
    public void calPercent(List<Student> list){
        System.out.println("Percentage grading");
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if(s.getMark() > 7.5){
                countA++;
            } else if(s.getMark() >= 6 && s.getMark() <= 7.5){
                countB++;
            } else if(s.getMark() >= 4 && s.getMark() < 6){
                countC++;
            } else if(s.getMark() < 4){
                countD++;
            }
        }
        float A = (countA/list.size())*100;
        float B = (countB/list.size())*100;
        float C = (countC/list.size())*100;
        float D = (countD/list.size())*100;
        System.out.println("A: " + A + "%");
        System.out.println("B: " + B + "%");
        System.out.println("C: " + C + "%");
        System.out.println("D: " + D + "%");
    }
    
}
