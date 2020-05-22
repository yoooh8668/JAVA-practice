class Circle{  //定義類別Circle
	private double pi=3.14;
	private double radius;
	// 設定資料成員為私有
	private double area()
	{  //設定計算面積的函數為私有
	    return pi*radius*radius;
	}

        public void show_area()
        {   //設定列印面積的函數為公有
            System.out.println("area="+ area());
        }

        public void setRadius(double r)
        {   //設定一個設定半徑的函數為公有
            if (r>0)
            {
               radius=r;
               System.out.println("radius= "+radius);
            }
            else System.out.println("半徑輸入錯誤");
        }
}
public class PrivateAndPublic {

	public static void main(String[] args) {
		Circle moon=new Circle();  //建立 moon 物件
		moon.setRadius(5);
		moon.show_area();
	}
}