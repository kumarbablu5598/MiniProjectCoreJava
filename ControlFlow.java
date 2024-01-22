import java.io.*;
import java.math.*;
import java.util.*;


class Result {


    public String[] calculateGrade(int[][] students_marks) {
        int m = students_marks.length;
        int n = students_marks[0].length;
        String[] Ans = new String[m];
        for(int i=0;i<m;i++)
        {
            float avg = 0;
            for (int j=0;j<n;j++)
            {
               avg += students_marks[i][j];
            }
            
               
            avg = avg/n;
            if(avg >= 90) Ans[i] = "A+";
            else if(avg >= 80) Ans[i] = "A";
            else if(avg >= 70) Ans[i] = "B";
            else if(avg >= 60) Ans[i] = "C";
            else if(avg >= 50) Ans[i] = "D";
            else Ans[i] = "F";
        }
        return Ans;

    }

}

public class Solution {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
         

        int students_marksRows = sc.nextInt();
        int students_marksColumns = sc.nextInt();
		
		
		int[][] students_marks = new int[students_marksRows][students_marksColumns];
		for(int i = 0; i < students_marksRows; i++)
        {
			for(int j = 0; j < students_marksColumns; j++)
			{
				students_marks[i][j] = sc.nextInt();				
			}
        }
        Result  obj = new Result();

        String[] result = obj.calculateGrade(students_marks);
		
		for(int i = 0; i < result.length; i++)
        {
			System.out.println(result[i]);
            
        }       
        
    }
}
