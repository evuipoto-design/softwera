import java.util.Scanner;

class pro5report{
    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
	  System.out.print("非負整数を入力してください:");
      String Num = stdIn.next();
      
	  boolean seihu = true ;
	  for(int k=0;k<Num.length();k++){
	  int ch = Num.charAt(k);
	  if(ch<'0'||'9'<ch){
		seihu=false;
		break;
	    }
	else{
		seihu = true;
	    }
    }
		String[][] hana = new String[10][5];

        hana[0] = new String[] {" *** ","*   *","*   *","*   *"," *** "};
		hana[1] = new String[] {"    *","    *","    *","    *","    *"};
		hana[2] = new String[] {"*****","    *","*****","*    ","*****"};
		hana[3] = new String[] {"*****","    *","*****","    *","*****"};
		hana[4] = new String[] {"*   *","*   *","*****","    *","    *"};
		hana[5] = new String[] {"*****","*    ","*****","    *","*****"};
		hana[6] = new String[] {"*****","*    ","*****","*   *","*****"};
		hana[7] = new String[] {"*****","    *","    *","    *","    *"};
		hana[8] = new String[] {"*****","*   *","*****","*   *","*****"};
		hana[9] = new String[] {"*****","*   *","*****","    *","*****"};
		
		if(seihu){
		for(int i =0;i<5;i++){
			for(int j=0;j<Num.length();j++){
              int A = Num.charAt(j)-'0';
			  System.out.print(hana[A][i]+"　");
			}
			System.out.println();			
		 }
		}
		else{
			System.out.println("正の整数だけを入力してください:");
		}
		}

		System.out.println("test 変更");
	}
