package structural.adaptorPattern;

public class EnglishSpeaker {
    private Translator englishTranslator;

    
    public EnglishSpeaker(Translator englishTranslator) {
        this.englishTranslator = englishTranslator;
    }


    public void sendMessageToFrenchSpeaker(String msg) {
        englishTranslator.sendMessage(msg);
    }
}
