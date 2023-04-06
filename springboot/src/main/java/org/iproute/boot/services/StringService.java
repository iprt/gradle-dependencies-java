package org.iproute.boot.services;

import org.iproute.commons.action.DemoAction;
import org.iproute.commons.model.DemoModel;
import org.springframework.stereotype.Service;

/**
 * StringService
 *
 * @author zhuzhenjie
 * @since 4/6/2023
 */
@Service
public class StringService {

    /**
     * Action blank boolean.
     *
     * @param cs the cs
     * @return the boolean
     */
    public boolean actionBlank(CharSequence cs) {
        return DemoAction.isBlank(cs);
    }

    /**
     * Action empty boolean.
     *
     * @param cs the cs
     * @return the boolean
     */
    public boolean actionEmpty(CharSequence cs) {
        return DemoAction.isEmpty(cs);
    }

    /**
     * Model empty boolean.
     *
     * @param cs the cs
     * @return the boolean
     */
    public boolean modelEmpty(CharSequence cs) {
        return DemoModel.isEmpty(cs);
    }
}
