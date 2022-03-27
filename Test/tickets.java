import java.util.Scanner;

public class IfChallenge1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的职业：");
		String job = scanner.next();
        System.out.println("请输入您入园的月份：");
		int month = scanner.nextInt();

		switch(job){
			case "学生":
                if(month==1||month==2||month==6||month==8||month==7||month==12)
				{
					System.out.println("您的门票价格为"+56.0);	
				}else{
					System.out.println("您的门票价格为"+42.0);
				}
				break;

				case "老师":
					if(month==3||month==4||month==5||month==9||month==10||month==11)
                {
					System.out.println("您的门票价格为"+64.0);	
				}else{
					System.out.println("您的门票价格为"+48.0);
				}
				break;
				case "其他":
					System.out.println("您的门票为100元！");
				break;
				default:
					System.out.println("合法日期格式是(一，二，三，四，五，六，日)");
		}
    }
}

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DataShowIterator{
    public static void main(String[] args){
        //String[] num = {"1","12","23","23","45","45","78","86","99","100","136","546"};

        String[] num = {"12","45","23","86","100","78","546","1","45","99","136","23"};
        Set ts = new TreeSet();
        for(int i = 0;i<num.length;i++){
            ts.add(num[i]);
        }
        //System.out.println(ts);

        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }

    }
}