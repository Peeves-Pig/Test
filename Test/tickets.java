import java.util.Scanner;

public class IfChallenge1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("����������ְҵ��");
		String job = scanner.next();
        System.out.println("����������԰���·ݣ�");
		int month = scanner.nextInt();

		switch(job){
			case "ѧ��":
                if(month==1||month==2||month==6||month==8||month==7||month==12)
				{
					System.out.println("������Ʊ�۸�Ϊ"+56.0);	
				}else{
					System.out.println("������Ʊ�۸�Ϊ"+42.0);
				}
				break;

				case "��ʦ":
					if(month==3||month==4||month==5||month==9||month==10||month==11)
                {
					System.out.println("������Ʊ�۸�Ϊ"+64.0);	
				}else{
					System.out.println("������Ʊ�۸�Ϊ"+48.0);
				}
				break;
				case "����":
					System.out.println("������ƱΪ100Ԫ��");
				break;
				default:
					System.out.println("�Ϸ����ڸ�ʽ��(һ�����������ģ��壬������)");
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