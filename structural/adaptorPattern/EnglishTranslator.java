package structural.adaptorPattern;

public class EnglishTranslator implements Translator{
    private FrenchSpeaker frenchSpeaker;

    public EnglishTranslator(FrenchSpeaker frenchSpeaker) {
        this.frenchSpeaker = frenchSpeaker;
    }

    @Override
    public void sendMessage(String msg) {
        String frenchMsg = msg.replace("Hello", "french hello").replace("Thank you", "french thank you");

        frenchSpeaker.speakMessage(frenchMsg);
    }
    
    
    
}
