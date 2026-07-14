package lambdaExpressions;

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wordCount = str -> {

            if (str == null || str.trim().isEmpty()) {
                return 0;
            }

            return str.trim().split("\\s+").length;
        };

        String sentence = "Java Lambda Expressions are easy to learn";

        System.out.println("Sentence: " + sentence);
        System.out.println("Word Count: " + wordCount.count(sentence));
    }
}