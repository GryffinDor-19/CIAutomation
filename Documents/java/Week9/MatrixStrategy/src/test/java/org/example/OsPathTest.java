package org.example;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OsPathTest {
        @Test
        void testHardcodedPath() {
            // CÁCH 1: Sử dụng File.separator (Tự động đổi \ hoặc / tùy OS)
            String dynamicPath = "src" + File.separator + "test" + File.separator + "resources";

            // CÁCH 2: Sử dụng API java.nio.file.Path (Cách hiện đại và an toàn nhất)
            Path pathObj = Paths.get("src", "test", "resources", "test.txt");

            System.out.println("Hệ điều hành hiện tại: " + System.getProperty("os.name"));
            System.out.println("Đường dẫn máy này sử dụng: " + pathObj.toString());

                    // Kiểm tra: Dù ở OS nào thì đường dẫn cũng phải chứa thư mục "src"
            assertTrue(pathObj.toString().contains("src"), "Đường dẫn phải hợp lệ trên mọi OS!");
        }
}
