public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "タロウ";
        s1.score = 75;

        s2.name = "花子";
        s2.score = 80;

        s1.showScore();
        s2.showScore();
    }
  
  public class Student {
    String name;
    int score;

    public void showScore(){
        System.out.println(name + "さん" + "得点は" + score + "点です。");
    }
}

}
