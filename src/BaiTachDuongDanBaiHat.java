
public class BaiTachDuongDanBaiHat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String path = "D:/music/bolero/longme.mp3";

        // Lấy longme.mp3
        int pos = path.lastIndexOf("/");
        System.out.println(pos);

        String fileName = path.substring(pos + 1);
        System.out.println(fileName);

        // Lấy longme
        int dot = fileName.lastIndexOf(".");
        String name = fileName.substring(0, dot);
        System.out.println(name);
	}

}
