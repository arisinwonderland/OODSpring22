public class Main
{
	public static void main(String[] args)
	{
		new Main().go();
	}

	public void go()
	{
		ICombine alg = new Simple();
		System.out.println(alg.combine("AaA", "bBB"));

		alg = new MixMaker();
		System.out.println(alg.combine("AaA", "bBB"));
		System.out.println(alg.combine("AaAXxx", "BBb"));
		System.out.println(alg.combine("AaA", "bBBxXX"));
		System.out.println(alg.combine("AaA", ""));
		System.out.println(alg.combine("", "bBB"));
	}
}
