package LambdaConfirmTest;

public class Example {
	private static int[] scores = {10,50,3};

	public static int maxOrMin(Operator operator) {
		//result = 10
		int result = scores[0];
		for(int score: scores) {
			result = operator.apply(result, score);
			System.out.println(result);
		}
		return result;
	}
	
	public static void main(String[] args) {
//		int max = maxOrMin((x,y)->{
//			if(x>=y) {
//				return x;
//			}
//			else {
//				return y;
//			}
//		});
		
		int max = maxOrMin((x,y)->
			(x>=y) ?  x :  y
		);
		
	//int max = maxOrMin((x,y) -> Math.max(x,y));	
		
		//이렇게 작성하면 함수호출을 줄일 수 있다.
//		int max = maxOrMin(Math::max);
		
		System.out.println("최대값 : " + max);
//		
//		int min = maxOrMin((x,y)->{
//			if(x>=y) {
//				return y;
//			}
//			else {
//				return x;
//			}
//		});
		
		int min = maxOrMin((x,y)->(x>=y) ? y : x );
			

		System.out.println("최소값: " + min);
	}

}
