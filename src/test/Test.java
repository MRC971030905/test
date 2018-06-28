package test;

public class Test {
	private String dongwu;
	private String dongzuo;

	public static void main(String[] args) {
		Test t = new Test();
		t.setDongwu("人");
		t.setDongzuo("一步一步的走");
		t.run();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		t.setDongwu("袋鼠");
		t.setDongzuo("一跳一跳的蹦");
		t.run();
	}

	public void run() {
		System.out.println(dongwu + dongzuo);
	}

	public String getDongwu() {
		return dongwu;
	}

	public void setDongwu(String dongwu) {
		this.dongwu = dongwu;
	}

	public String getDongzuo() {
		return dongzuo;
	}

	public void setDongzuo(String dongzuo) {
		this.dongzuo = dongzuo;
	}

}
