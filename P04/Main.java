public  class Main
{

	public static void main(String[] args)
	{
		new Main().go();
	}

	private void go()
	{
		IWord w1 = new Word("an");
		IWord w2 = new CompoundWord(new CompoundWord(new Word("upper"), new Word("class")), new Word("man"));
		IWord w3 = new Word("did");
		IWord w4 = new Word("the");
		IWord w5 = new CompoundWord(new Word("home"), new Word("work"));
		IWord w6 = new Word("correctly");

		Sentence s = new Sentence();
		s.add(w1).add(w2).add(w3).add(w4).add(w5).add(w6);
		System.out.println(s.getSentence());

		w1 = new Word("my");
		w2 = new CompoundWord(new CompoundWord(new Word("father-"), new Word("in-")), new Word("law"));
		w3 = new Word("ate");
		w4 = new Word("eggs");
		w5 = new Word("for");
		w6 = new CompoundWord(new Word("break"), new Word("fast"));

		s = new Sentence();
		s.add(w1).add(w2).add(w3).add(w4).add(w5).add(w6);
		System.out.println(s.getSentence());
	}
}
