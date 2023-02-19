public class Envelope {
    private String outerName;

    public Envelope(String outerName) {
        this.outerName = outerName;
    }

    public String sayLocation() {
        return "I am the envelope!";
    }

    // this is the inner class called "InnerContents" that is nested inside the enclosing class called "Envelope"
    class InnerContents {
        private String innerName;

        public InnerContents(String innerName) {
            this.innerName = innerName;
        }

        public String sayWhatIsInside() {
            return "This is a birthday card being passed around the office for our lovely colleague, Viktoria!";
        }
    }

    public static void main(String[] args) {
        Envelope manilaEnvelope = new Envelope("manila");
        Envelope.InnerContents letter = manilaEnvelope.new InnerContents("letter"); // this is probably the most important part about inner classes
        System.out.println(letter.sayWhatIsInside());
    }
}
