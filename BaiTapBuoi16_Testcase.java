import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BaiTapBuoi16_Testcase {
    @Test
    public void KtraMK() {
        String mk = "12@Thancong";
        assertThat(mk).isNotEmpty();
        assertThat(mk).isNotNull();
        assertThat(mk).containsPattern("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%^&*])(?=.{10,})");
        if(mk.length() < 10) {System.out.println("Mật khẩu không đủ mạnh") ;}
    }
}
