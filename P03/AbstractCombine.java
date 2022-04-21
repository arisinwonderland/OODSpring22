public abstract class AbstractCombine implements ICombine
{
	abstract public String combine(String s1, String s2);
	protected String ignoreCase(String s)
	{
		return s.toLowerCase();
	}
}
