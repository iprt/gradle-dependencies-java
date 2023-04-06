package org.iproute.commons.model;

import com.google.common.collect.Maps;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * DemoModel
 *
 * @author zhuzhenjie
 * @since 4/6/2023
 */

public class DemoModel {

    @Getter
    private final Map<String, String> map;

    public DemoModel() {
        this.map = Maps.newConcurrentMap();
    }

    public static boolean isEmpty(CharSequence cs) {
        return StringUtils.isEmpty(cs);
    }
}
