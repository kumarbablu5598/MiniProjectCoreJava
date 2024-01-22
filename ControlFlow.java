import java.io.*;
import java.math.*;
import java.util.*;


class Result {


  public static String[] calculateGrade(int[][] students_marks) 
	{
        int m = students_marks.length;
		    int n = students_marks[0].length;
        String[] Ans = new String[n];
        for(int i=0;i<m;i++)
		    {
            float avg = 0;
            for (int j=0;j<n;j++){
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
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int students_marksRows = Integer.parseInt(sc.next().trim());
		int[][] students_marks = new int[students_marksRows][students_marksColumns];
		for(int i = 0; i < students_marksRows; i++)
        {
			   for(int j = 0; j < students_marksColumns; j++)
			   {
				  students_marks[i][j] = Integer.parseInt(sc.next().trim());				
			   }
      }

        String[] result = Result.calculateGrade(students_marks);
		
		for(int i = 0; i < result.length; i++)
        {
			System.out.println(result[i]);
            bufferedWriter.write(result[i]+"\n");
        }       
        bufferedWriter.close();
    }
	
}


