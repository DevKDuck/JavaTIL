package ex08_TestNum07;

public class OracleDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("OracleDao DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("OracleDao DB에서 삽입");		
	}

	@Override
	public void update() {
		System.out.println("OracleDao DB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("OracleDao DB에서 삭제");
	}
}
