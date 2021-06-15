import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiTapBuoi16 {
    public static void demtu (String chuoi)
    {
        int dem = 0;
        String[] temp= chuoi.split(" ");
//        chuoi="";
        for(int i=0;i<temp.length;i++) {
            if (String.valueOf(temp[i].charAt(0)).equals(String.valueOf(temp[i].charAt(0)).toUpperCase()) )
            {
                dem++;
            }
        }
        System.out.println("Số từ viết hoa trong chuỗi là: "+dem);
    }

    public static void Chuanhoa(String chuoi) {
        chuoi = chuoi.trim();
        chuoi = chuoi.replaceAll("\\s+", " ");
        chuoi = chuoi.toLowerCase();
        chuoi = chuoi.replace(chuoi.valueOf(chuoi.charAt(0)), chuoi.valueOf(chuoi.charAt(0)).toUpperCase());
        String temp[] = chuoi.split(" ");
//        chuoi = "";
        for (int i = 0; i < temp.length; i++) {
            if (String.valueOf(temp[i]).equals(".")) {
                chuoi += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            }
        }
        System.out.println("Chuỗi đã chuẩn hóa: ");
        System.out.println(chuoi);
    }
    public static void ktrthang () {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập tháng muốn kiểm tra: ");
        int thang = 0;
        try {
            thang = sc.nextInt();
            if (thang <1 || thang>13) {throw new CheckException( "Không có tháng này");}

        } catch (InputMismatchException exp3) {
            System.out.println("Không được nhập ký tự");
        }
        catch (CheckException e1){
            System.out.println(e1.getMessage());
        }
        finally {
            if (thang < 13) {
                if (thang == 2) {
                    System.out.printf("Tháng %d có 28 ngày \n", thang);
                } else if (thang == 1 | thang == 3 | thang == 5 | thang == 7 | thang == 8 | thang == 10 | thang == 12) {
                    System.out.printf("Tháng %d có 31 ngày\n", thang);
                } else if (thang == 4 | thang == 6 | thang == 9 | thang == 11) {
                    System.out.printf("Tháng %d có 30 ngày\n", thang);
                }
            } else {
                System.out.println("Không có tháng này");
            }
        }
    }
}
