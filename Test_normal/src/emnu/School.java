package emnu;

public enum School {

	zhangSan(1),
	
	liSi(2),
	
	wangLaoWu(3),
	
	Lucy(4),
	
	jack(5),
	
	jeffty(6),
	
	rose(7),
	
	liliy(8),
	
	som(9),
	
	james(10),
	
	unknow(11);
	
	private final int value;
	
	School(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public static School valueOf(int _value){
		switch(_value){
		case 1:return zhangSan;
		case 2:return liSi;
		case 3:return wangLaoWu;
		case 4:return Lucy;
		case 5:return jack;
		case 6:return jeffty;
		case 7:return rose;
		case 8:return liliy;
		case 9:return som;
		case 10:return james;
		default:return unknow;
		}
	}
	
	public  String getChineseName(){
		switch(this){
		case zhangSan:return "张三";
		case liSi:return "李斯";
		case wangLaoWu:return "王老五";
		case Lucy:return "露西";
		case jack:return "杰克";
		case jeffty:return "杰夫";
		case rose:return "罗斯";
		case liliy:return "莉莉丝";
		case som:return "桑姆";
		case james:return "詹姆斯";
		default:return "不知名";
		
		}
	}
	
	public static void main(String[] argus){
		System.out.println(School.valueOf(3).getChineseName());
	}
}
