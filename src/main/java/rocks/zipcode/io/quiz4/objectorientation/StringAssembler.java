package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private Character delimeter;
    private StringBuilder builder;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        this.builder = new StringBuilder();
    }

    public StringAssembler append(String str) {
        builder.append(str + delimeter);
        return this;
    }

    public String assemble() {
        return this.builder.toString().substring(0,builder.length()-1);
    }
}
