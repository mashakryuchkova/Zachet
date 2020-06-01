package zachet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityCourses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actionCounter = scanner.nextInt();
        int action;
        int numberOfStudents;
        int numberOfSemester;
        String courseName;

        List<Courses> coursesList = new ArrayList<Courses>();
        List<String> listToOutput = new ArrayList<String>();
        for (int i = 0; i < actionCounter; i++) {
            action = scanner.nextInt();
            if (action != 3) {
                Courses course = new Courses();
                numberOfStudents = 0;
                if (action == 1) {
                    courseName = scanner.next();
                    numberOfStudents = scanner.nextInt();
                    numberOfSemester = scanner.nextInt();
                } else {
                    courseName = scanner.next();
                    numberOfSemester = scanner.nextInt();
                }
                course.setCourseName(courseName);
                course.setNumberOfStudents(numberOfStudents);
                course.setNumberOfSemester(numberOfSemester);
                coursesList.add(course);
            } else {
                for (Courses course : coursesList) {
                    listToOutput.add(course.toString());
                }
            }
        }

        for (String result : listToOutput) {
            System.out.println(result);
        }
    }

    public static class Courses {
        private String courseName;
        private Integer numberOfStudents;
        private Integer numberOfSemester;

        public Courses() {
            this.numberOfStudents = 0;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public Integer getNumberOfStudents() {
            return numberOfStudents;
        }

        public void setNumberOfStudents(Integer numberOfStudents) {
            this.numberOfStudents = numberOfStudents;
        }

        public Integer getNumberOfSemester() {
            return numberOfSemester;
        }

        public void setNumberOfSemester(Integer numberOfSemester) {
            this.numberOfSemester = numberOfSemester;
        }

        @Override
        public String toString() {
            return courseName + ", " +
                    (numberOfSemester % 2 == 0 ? "Summer " : "Winter ") + "Semester, " +
                    numberOfStudents;
        }
    }
}
