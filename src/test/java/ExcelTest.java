import com.aiyacloud.common.utils.ExcelUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hx on 2016-12-09.
 */
public class ExcelTest {


    @Test
    public void testImportExcel() {
        Map<String, Integer> batchMap = new HashMap<>();
        List<List<String>> lists = ExcelUtils.importXls("C:\\Users\\chh\\Desktop\\韩萧\\韩萧\\盘点备份1205.xls");
        System.out.println();
        assert lists != null;
        lists.forEach(list -> {
            Integer num = batchMap.get(list.get(4));
            if (num == null) {
                batchMap.put(list.get(4), 1);
            } else {
                batchMap.put(list.get(4), num + 1);
            }
        });

        for (String key : batchMap.keySet()) {
            if (batchMap.get(key) > 1) {
                System.out.println("code:" + key + "   num:" + batchMap.get(key));
            }
        }
    }
}
