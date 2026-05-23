import java.util.*;

public class Bai1_Buoi4 {

    public static void main(String[] args) {

        ArrayList<String> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;

        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Sua sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Tim sinh vien");
            System.out.println("6. Sap xep danh sach");
            System.out.println("7. So luong sinh vien");
            System.out.println("0. Thoat");


            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon)
            {
                case 1:
                    System.out.println("1. Nhap ten sinh vien:");
                    String ten = sc.nextLine();

                    ds.add(ten);

                    System.out.println("Da them sinh vien!");
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien:");

                    int c = 0;

                    for (String i : ds) {
                        c++;
                        System.out.println(c + ": " + i);
                    }
                    break;

                case 3:
                    System.out.println("Sua sinh vien:");

                    System.out.println("Danh sach sinh vien:");

                    int x = 0;
                    int sua;
                    for (String i : ds) {
                        x++;
                        System.out.println(x + ": " + i);
                    }
                    System.out.println("Nhap vi tri sinh vien muon sua:");
                    sua = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten moi: ");
                    String tenMoi = sc.nextLine();

                    ds.set(sua-1, tenMoi);
                    System.out.println("Da sua ten sv");

                    break;
                case 4:
                    System.out.println("Xoa sinh vien:");

                    System.out.println("Danh sach sinh vien:");

                    for(int i=0; i<ds.size();i++)
                    {
                        System.out.println((i+1) + ". " + ds.get(i));
                    }

                    System.out.println("Nhap vi tri sinh vien muon XOA:");
                    int xoa= Integer.parseInt(sc.nextLine());

                    ds.remove((xoa-1));
                    System.out.println("Da xoa ten sv");

                    break;
                case 5:
                    boolean timThay = false;
                    String Tim = sc.nextLine();

                    for (String q : ds) {
                        if (q.toLowerCase().contains(Tim.toLowerCase())) {
                            System.out.println("Da tim ra:"+Tim);
                            timThay = true;
                            break;
                        }
                    }
                    break;
                case 6:
                    Collections.sort(ds);
                    System.out.println("Da sap xep danh sach!");
                    break;
                case 7:
                    System.out.println("So luong sinh vien: " + ds.size());
                    break;
            }

        }while(chon!=0);

        System.out.println("END!");


    }

}