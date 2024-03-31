package structural.adaptorPattern;

public class Main {
    public static void main(String[] args) {
        FrenchSpeaker frenchSpeaker = new FrenchSpeaker();
        Translator englishTranslator = new EnglishTranslator(frenchSpeaker);

        EnglishSpeaker englishSpeaker = new EnglishSpeaker(englishTranslator);

        englishSpeaker.sendMessageToFrenchSpeaker("Hello, I am idiot. Thank you, Some Idiot");
    }
}
