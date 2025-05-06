/**
 * 
 */
package project;

/**
 * メインクラス
 */
public class Main {

	/**
	 * @param args nothing
	 */
	public static void main(String[] args) {
		
		//社員１を作る
		ShainBean shain1 = new ShainBean();
		shain1.setId(101);
		shain1.setName("鈴木義信");
		shain1.setGender("男");
		shain1.setBornYear(2003);
		shain1.setAddress("宮城県仙台市");
		
		//社員２を作る
				ShainBean shain2 = new ShainBean();
				shain2.setId(102);
				shain2.setName("佐藤香織");
				shain2.setGender("女");
				shain2.setBornYear(2004);
				shain2.setAddress("福岡県福岡市");
		
		//社員１を表示させる
		System.out.println(shain1.getId() + ":" + shain1.getName()+ ":" + shain1.getGender()+ ":" + shain1.getBornYear()+ ":" + shain1.getAddress());
	
		//社員２を表示させる
				System.out.println(shain2.getId() + ":" + shain2.getName()+ ":" + shain2.getGender()+ ":" + shain2.getBornYear()+ ":" + shain2.getAddress());
			
	}

}
