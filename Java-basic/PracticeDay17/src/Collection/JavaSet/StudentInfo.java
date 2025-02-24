package Collection.JavaSet;

public class StudentInfo implements Comparable<StudentInfo> {
    private String name;
    private int age;
    private int ChineseScore;
    private int MathScore;
    private int EnglishScore;

    public StudentInfo() {}
    public StudentInfo(String name, int age, int ChineseScore, int MathScore, int EnglishScore) {
        this.name = name;
        this.age = age;
        this.ChineseScore = ChineseScore;
        this.MathScore = MathScore;
        this.EnglishScore = EnglishScore;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getChineseScore() {
        return ChineseScore;
    }
    public void setChineseScore(int chineseScore) {
        ChineseScore = chineseScore;
    }
    public int getMathScore() {
        return MathScore;
    }
    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }
    public int getEnglishScore() {
        return EnglishScore;
    }
    public void setEnglishScore(int englishScore) {
        EnglishScore = englishScore;
    }
    
    public int TotalScore() {
        return this.getChineseScore() + this.getMathScore() + this.getEnglishScore();
    }

    @Override
    public int compareTo(StudentInfo o) {
        int result = this.TotalScore() - o.TotalScore();
        result = result == 0 ? this.getChineseScore() - o.getChineseScore() : result;
        result = result == 0 ? this.getMathScore() - o.getMathScore() : result;
        result = result == 0 ? this.getEnglishScore() - o.getEnglishScore() : result;
        result = result == 0 ? this.getAge() - o.getAge() : result;
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;
        return result;
    }
}
