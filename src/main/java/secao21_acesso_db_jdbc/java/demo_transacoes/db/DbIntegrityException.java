package secao21_acesso_db_jdbc.java.demo_transacoes.db;

public class DbIntegrityException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public DbIntegrityException(String msg)
	{
		super(msg);
	}
}
