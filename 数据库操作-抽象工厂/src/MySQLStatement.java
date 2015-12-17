public class MySQLStatement implements Statement
{
	public void state(String str)
	{
		System.out.println("正在对MySQL数据库执行操作："+str);
	}
}