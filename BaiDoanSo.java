import java.util.*;
public class BaiDoanSo {
	
    public static void GenSo() {
    	Random rd = new Random();
    	int So = rd.nextInt(101);
    	boolean win = false;
    	
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<7; i++) {
			System.out.print("\nnhap so doan lan thu " + (i+1) +": ");
			int Doan = sc.nextInt();
			if (Doan > So) 		
				System.out.print("So can doan < "+Doan);
			if (Doan < So) 		
				System.out.print("So can doan > "+Doan);
			
			if (Doan == So) {
				System.out.print("Congratuation!!!!!!!! ");
				win = true;
				break;
			}
		}
		if(!win)
			System.out.print("NGUUUUUUUUUUUUU!!!!!!!! SO CAN DOAN LA: "+So);

	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenSo();
		
	}

}
