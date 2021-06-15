import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    StringChecking sc = new StringChecking();

    @Test
    @DisplayName("Đếm số lượng Upper case")
    void CountUpperCase() {
        int count = 7;
        assertThat(count).isEqualTo(sc.CountUpperCase());
    }

    @Test
    @DisplayName("Viết Hoa chữ cái đầu")
    void UpperAllCase() {
        String str = "You Only Live Once. But If You Do It Right. Once Is Enough";

        assertThat(str).isEqualTo(sc.UpperAll("You Only Live Once. But if You do it right. once is Enough"));
    }


}
