
public class Chapter07 {
	public static void main(String[] args) {
		int distance = 17;
		if (distance <= 5) { //距離が5km以下の場合
			System.out.println("とても近いです");
		} else if (distance <= 10){ //距離が5kmより長く、10km以下
			System.out.println("近いです");
		} else if (distance <= 15) { //距離が10kmより長く、15km以下
			System.out.println("遠いです");
		} else { //距離が15kmより長い
			System.out.println("とても遠いです");
		}
		String color = "black";
		switch(color) {
			case "red":
				System.out.println("赤信号です");
				break;
			case "yellow":
				System.out.println("黄信号です");
				break;
			case "blue":
				System.out.println("青信号です");
				break;
			default:
				System.out.println("信号の色ではありません");
		}
	}
}
