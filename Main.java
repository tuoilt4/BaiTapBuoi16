import com.sun.tools.attach.AgentInitializationException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws CheckException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài tập 1: Bài tập đếm từ viết hoa");
        System.out.println("Bài tập 2: Chuẩn hóa câu");
        System.out.println("Bài tập 3: Kiểm tra tháng");
        System.out.print("Nhập bài muốn kiểm tra: ");
        int bt = sc.nextInt();
        switch (bt){
            case 1: {
                String chuoia = "You Only Live Once. But if You do right. once is Enough";
                BaiTapBuoi16.demtu(chuoia);
                break;
            }
            case 2: {
                String chuoib = "You Only Live Once. But if You do right. once is Enough";
                BaiTapBuoi16.Chuanhoa(chuoib);
                break;

            }
            case 3: {
                BaiTapBuoi16.ktrthang();
                break;
            }
            default:
                System.out.println("Không có bài tập này");
        }
    }
}