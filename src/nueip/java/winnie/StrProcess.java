package nueip.java.winnie;

public class StrProcess {
	public static void main(String[] args) {
		String str = "人易科技:上 機 測 驗 - 演算法";
		str = halfToFull(str);
		str = spaceRemove(str);
		str = strPrint(str);
		System.out.println(str);
	}

	public static String halfToFull(String str) {
		String[] tmp = str.split(":");
		String val = tmp[0] + "：" + tmp[1];
		return val;
	}

	public static String spaceRemove(String str) {
		String val = "";
		for (String tmp : str.split(" ")) {
			if (!tmp.equals("-"))
				val += tmp;
			else
				val = val + " " + tmp + " ";
		}
		return val;
	}
	
	public static String strPrint(String str) {
		String[] tmp1 = str.split("：");
		String[] tmp2 = tmp1[1].split(" - ");
		return tmp2[0];
	}
}
