public class Character2{

	private String name;
	private int hp;
	private int mp;
	private int hit; //攻撃力

	//キャラクターメソッド生成
	public Character2(String name, int hp, int mp,int hit) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.hit = hit;

	}
//aaaa

	public static void main(String[] args) {
		Character2 majyo = new Character2("魔女",200,30,45);
		//majyo.introduce();　//前回の課題

		Character2 slime = new Character2("スライム",10,20,5);
		//slime.introduce();　/前回の課題

		Character2 yusya = new Character2("勇者",250,50,20);
		//yusya.introduce();　/前回の課題

		Character2 enemy = new Character2("ラスボス",2000,20,40);

		while(true){
			//魔王からして攻撃相手は、勇者
			enemy.attack(yusya);
			//逆に勇者の敵は、魔王
			//3人で一斉に魔王攻撃、ただし攻撃を受けるのは勇者だけ・・
			yusya.attack(enemy);
			majyo.attack(enemy);
			slime.attack(enemy);
		}

	}

	/****************************前回の課題なので、今回はコメントアウト****************************
	//自己紹介　
	private void introduce() {
		System.out.println("私の名前は" + name + "です。体力は" + hp +"で、魔力は" + mp + "です。");

	}
	*****************************前回の課題なので、今回はコメントアウト****************************/

	//引数に攻撃力を受け取り、その分hpを減らそう
	private void damage(int hit) {
	    System.out.println(name + "は" + hit + "ポイントのダメージを受けた。");
		hp = hp - hit;
	    if(hp < 0) {
			System.out.println(name + "の体力は0だ。");
			System.exit(0);

	    }else {
			System.out.println(name + "の体力は" + hp +"になった");

	    }

	}

	//引数に攻撃相手のインスタンスを受け取り、攻撃相手のメソッドを呼ぶ
	private void attack(Character2 charcter) {
		System.out.println(name +"の" + hit + "の攻撃！");
		charcter.damage(hit);

	}

	/*public static void tairyoku(String name,int hp,int hit) {

		if(name == "勇者") {

			if(hp == 0) {

				System.out.println("出直して");
				System.exit(0);
			}
		}
		int tairyoku = hp - hit;


		//return tairyoku;
	}
	*/

}
