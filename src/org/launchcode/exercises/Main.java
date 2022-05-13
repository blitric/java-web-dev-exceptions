package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        System.out.println(Divide(125,4));
      //  Divide(125,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
       /* System.out.println("Points for Carl: "  + CheckFileExtension(studentFiles.get("Carl")));
        System.out.println("Points for Brad: "  + CheckFileExtension(studentFiles.get("Brad")));
        System.out.println("Points for Elizabeth: "  + CheckFileExtension(studentFiles.get("Elizabeth")));
        System.out.println("Points for Stefanie: "  + CheckFileExtension(studentFiles.get("Stefanie"))); */

        for(Map.Entry<String, String> student: studentFiles.entrySet()) {
            System.out.println("Points for " + student.getKey() + ": " + CheckFileExtension(student.getValue()));
        }

    }

    public static int Divide(int x, int y) {
        // Write code here!
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
      return x / y;

    }
    public static int CheckFileExtension(String fileName)
    {
        int points = 0;
        // Write code here!
      if(fileName.endsWith(".java")) {
          points = 1;
      } else if(fileName.equals("")) {
          points = -1;
try{
    throw new SubmissionException("File is empty!");
} catch(SubmissionException e) {
    e.printStackTrace();
}
      } else points = 0;

      return points;
    }

}