import com.leopoo.translate.Trans;
import org.junit.Before;
import org.junit.Test;

import com.leopoo.translate.factory.TFactory;
import com.leopoo.translate.factory.TranslatorFactory;

public class TranslatorTest {
    TFactory factory = null;

    @Before
    public void initTFactory() throws Exception {
        factory = new TranslatorFactory();
    }

    @Test
    public void doTranslate() throws Exception {
//        System.out.println(factory.get(Trans.Baidu).translate("中文翻译成英文"));
        System.out.println(factory.get(Trans.Google).translate("中文翻译成英文"));
//        System.out.println(factory.get(Trans.Youdao).translate("中文翻译成英文"));
    }

}