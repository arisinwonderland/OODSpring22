public class Main
{
	public static void main(String args[])
	{
		Main m = new Main();
		m.go();
	}

	public void go()
	{
		IAnalyzer v = null;
		String s = null;

		v = new Validator();
		s = "+--+X++-";
		System.out.printf("Validator test #1: %d%n", v.analyze(s)); // -1
		s = "+-+++-";
		System.out.printf("Validator test #2: %d%n", v.analyze(s)); // 1
		s = "";
		System.out.printf("Validator test #2: %d%n", v.analyze(s)); // -1

		v = new RunChanges();
		s = "+W-++-";
		System.out.printf("RunChanges test #1: %d%n", v.analyze(s)); // -1
		s = "+--+++-";
		System.out.printf("RunChanges test #1: %d%n", v.analyze(s)); // 4
		s = "+-+-+-++---+";
		System.out.printf("RunChanges test #2: %d%n", v.analyze(s)); // 9

		v = new DominantRunChar();
		s = "+-+PP+-";
		System.out.printf("DominantRunChar test #1: %d%n", v.analyze(s)); // -1
		s = "+";
		System.out.printf("DominantRunChar test #2: %d%n", v.analyze(s)); // 1
		s = "-";
		System.out.printf("DominantRunChar test #2: %d%n", v.analyze(s)); // -1
		s = "+-----+++-";
		System.out.printf("DominantRunChar test #1: %d%n", v.analyze(s)); // -1
		s = "+-+-+-++++---+";
		System.out.printf("DominantRunChar test #2: %d%n", v.analyze(s)); // 1
		s = "+-+-+-++++-+----+";
		System.out.printf("DominantRunChar test #2: %d%n", v.analyze(s)); // -1
	}
}
