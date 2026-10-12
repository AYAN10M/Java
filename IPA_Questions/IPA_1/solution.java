import java.util.*;

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handsOn;

    Course(int courseId, String courseName, String courseAdmin, int quiz, int handsOn) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handsOn = handsOn;
    }

    int getCourseId() {
        return courseId;
    }

    String getCourseName() {
        return courseName;
    }

    String getCourseAdmin() {
        return courseAdmin;
    }

    int getQuiz() {
        return quiz;
    }

    int getHandsOn() {
        return handsOn;
    }

    void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    void setHandsOn(int handsOn) {
        this.handsOn = handsOn;
    }
}

class CourseProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Course> arr = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int courseId = sc.nextInt();
            sc.nextLine();

            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();

            int quiz = sc.nextInt();
            int handsOn = sc.nextInt();

            arr.add(new Course(courseId, courseName, courseAdmin, quiz, handsOn));
        }

        sc.nextLine();
        String admin = sc.nextLine();

        int avg = findAvgOfQuizByAdmin(arr, admin);

        if (avg != 0) {
            System.out.println(avg);
        } else {
            System.out.println("No Course found");
        }

        int handsOn = sc.nextInt();

        ArrayList<Course> result = sortCourseByHandsOn(arr, handsOn);

        if (result == null) {
            System.out.println("No Course found with mentioned attributes.");
        } else {
            for (Course c : result) {
                System.out.println(c.getCourseName());
            }
        }

        sc.close();
    }

    static int findAvgOfQuizByAdmin(ArrayList<Course> courses, String courseAdmin) {
        int sum = 0;
        int count = 0;

        for (Course c : courses) {
            if (c.getCourseAdmin().equals(courseAdmin)) {
                sum += c.getQuiz();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }

    static ArrayList<Course> sortCourseByHandsOn(
            ArrayList<Course> courses, int handsOn) {

        ArrayList<Course> result = new ArrayList<>();

        for (Course c : courses) {
            if (c.getHandsOn() < handsOn) {
                result.add(c);
            }
        }

        if (result.isEmpty()) {
            return null;
        }

        result.sort(Comparator.comparingInt(Course::getHandsOn));

        return result;
    }
}
