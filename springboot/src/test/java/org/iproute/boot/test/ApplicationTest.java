package org.iproute.boot.test;

import org.apache.commons.lang3.StringUtils;
import org.iproute.boot.services.StringService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTest {

    private static final String EMPTY = StringUtils.EMPTY;
    private static final String BLANK = "    ";

    @Autowired
    private StringService stringService;

    @Test
    void testShare() {
        Assertions.assertTrue(stringService.actionEmpty(EMPTY));
        Assertions.assertTrue(stringService.actionBlank(BLANK));

        Assertions.assertTrue(stringService.modelEmpty(EMPTY));
    }

}
