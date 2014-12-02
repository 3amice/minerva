package tagging;

/**
 * Simple java bean to contain tagged content
 * 
 * @author timdolck
 *
 */
public class Word {
	public String word;
	public String lemma;
	public String pos;
	public String neTag;
	public String neTypeTag;
	//Might be continued
	
	public Word(String word, String lemma, String pos, String neTag, String neTypeTag){
		this.word = word;
		this.lemma = lemma;
		this.pos = pos;
		this.neTag = neTag;
		this.neTypeTag = neTypeTag;
	}

	@Override
	public String toString() {
		return word + "\t" + "\t" + pos + "\t" + neTag + "\t" + neTypeTag;
	}

}
