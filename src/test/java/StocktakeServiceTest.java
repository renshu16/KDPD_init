import com.aiyacloud.service.impl.StocktakeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;

import java.io.FileInputStream;

/**
 * Created by hx on 2016-12-09.
 */
public class StocktakeServiceTest extends BaseTest {
    @Autowired
    StocktakeService stocktakeService;

    @Test
    public void testAAa() throws Exception {
        MockMultipartFile file1=new MockMultipartFile("file1","盘点备份1205.xls","",new FileInputStream("C:\\Users\\chh\\Desktop\\韩萧\\韩萧\\盘点备份1205.xls"));
        MockMultipartFile file2=new MockMultipartFile("file2","价格.xls","",new FileInputStream("C:\\Users\\chh\\Desktop\\韩萧\\韩萧\\价格.xls"));

        stocktakeService.newStocktake(file1, file2, "测试盘点");
    }
}
