package ex07_static;

public class ShopServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}
		else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}

}
