package java_exer_kihon2.q75;

public class Main {
    public static void main(String[] args){
        Quiz q1 = new Quiz("最も面積の広い都道府県はどこですか？");
        String[] answers = {"青りんご", "さくらんぼ", "みかん", "ぶどう"};
        Quiz q2 = new MultipleChoiceQuiz("赤色の果物はどれですか", answers);
        Quiz q3 = new BlankQuiz("(  )は(  )年に鎌倉幕府を設立した。", 2);

        QuizViewer.showQuiz(q1);
        QuizViewer.showQuiz(q2);
        QuizViewer.showQuiz(q3);

    }

public class Quiz {
    String main;

    public Quiz(String main) {
        this.main = main;
    }

    public void displayHeader(){
        System.out.println("[次の問いに答えなさい]");
    }

    public void displayMain(){
        System.out.println(main);
    }
}

public class MultipleChoiceQuiz extends Quiz {
    String[] answers;

    public MultipleChoiceQuiz(String main, String[] answers) {
        super(main);
        this.answers = answers;
    }

    @Override
    public void displayHeader(){
        System.out.println("[次の問いについて、正しいものを４つの中から選びなさい]");
    }

    @Override
    public void displayMain(){
        super.displayMain();

        for (int i = 1; i < answers.length + 1; i++) {
            System.out.println(i + " : " + answers[i - 1]);
        }

    }
}

public class BlankQuiz extends Quiz {
    int blankCount;

    public BlankQuiz(String main, int blankCount) {
        super(main);
        this.blankCount = blankCount;
    }

    @Override
    public void displayHeader(){
        System.out.println("[次の文の空欄を埋めなさい。]");
    }

    public void displayMain(){
        System.out.println(main);
        for (int i = 1; i < blankCount + 1; i++) {
            System.out.println(i + "." + "______________");
        }
    }
}

  
  public class QuizViewer {
    public static int count;

    public static void showQuiz(Quiz quiz){
        count++;
        System.out.println("「第" + count + "問」");
        quiz.displayHeader();
        quiz.displayMain();
        System.out.println();
    }
}
  
}
