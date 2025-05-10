/**
 * 
 */
package project;

import java.util.ArrayList;

/**
 * メインクラス
 */
public class Main {

	/**
	 * @param args nothing
	 */
	public static void main(String[] args) {

		//社員リストを作る
		ArrayList<ShainBean> shainList = new ArrayList<>();

		//社員１を作る
		ShainBean shain1 = new ShainBean();
		shain1.setId(101);
		shain1.setName("鈴木義信");
		shain1.setGender("男");
		shain1.setBornYear(2003);
		shain1.setAddress("宮城県仙台市");

		//社員リストに追加
		shainList.add(shain1);

		//社員２を作る
		ShainBean shain2 = new ShainBean();
		shain2.setId(102);
		shain2.setName("佐藤香織");
		shain2.setGender("女");
		shain2.setBornYear(2004);
		shain2.setAddress("福岡県福岡市");

		//社員リストに追加
		shainList.add(shain2);

		//社員リストから社員情報を取得してみる
		System.out.println(shainList.get(0).getName());
		System.out.println(shainList.get(1).getBornYear());

		//リストの中の社員を表示させる
		for (ShainBean shain : shainList) {
			System.out.println(shain.getId() + ":" + shain.getName() + ":" + shain.getGender() + ":"
					+ shain.getBornYear() + ":" + shain.getAddress());
		}
	}

}
