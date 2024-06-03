//WAP to convert a string to lowercase
//WAP to replace spaces with underscores
//WAP to fill in a letter template which looks like below:
    //letter="Dear <|name|">, Thanks a lot"
    //Replace <|name|> with a string(some name)
//Wap to detect double and triple spaces in a string
//WAP to format the following letter using escape sequence characters
    //letter="Dear Harry, This Java course is nice. Thanks"

public class PracticeSet3 {
  public static void main(String[] args) {
    //Problem 1
        String name = "Samm";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        //Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Samriddhi");
        System.out.println(letter);

        //Problem 4
        String myString = "This string contains double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem 5
        String myLetter = "Dear Samriddhi,\n\t This Java Course is Nice. \n\t Thanks!";
        System.out.println(myLetter);
    }
}


