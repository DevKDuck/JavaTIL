package EqualsCompare;

public class Member extends Object{
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	
	//Object 의 equals 메서드를 재정의해서 동등 비교
	//객체가 비록 달라도 내부의 데이터가 같은지를 비교
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			if(id.equals(target.id)){
				return true;
			}
		}
		return false;
	}
}
