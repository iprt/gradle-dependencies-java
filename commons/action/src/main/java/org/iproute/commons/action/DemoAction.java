package org.iproute.commons.action;

import org.apache.commons.lang3.StringUtils;
import org.iproute.commons.model.DemoModel;

/**
 * DemoAction
 *
 * @author zhuzhenjie
 * @since 4/6/2023
 */
public class DemoAction {

    /**
     * Is blank boolean.
     *
     * @param cs the cs
     * @return the boolean
     */
    public static boolean isBlank(CharSequence cs) {
        return StringUtils.isBlank(cs);
    }

    public static boolean isEmpty(CharSequence cs) {
        return DemoModel.isEmpty(cs);
    }
}
