package chap02.lab01;

public class MakeLiteral {
    public static void main(String[] args) {
    	long annualSalary = 50000000L;       		
    	double increaseRate = 1.2;    
        char tab = '\t';   		

        System.out.println("연봉: " + annualSalary);
        System.out.println(tab + "연봉 \"인상률\": " + increaseRate);
    }
}