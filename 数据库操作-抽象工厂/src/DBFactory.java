public interface DBFactory
{
	public Connection createConnection();
	public Statement createStatement();
}