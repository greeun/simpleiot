package com.withwiz.simpleiot.simplicity.device;

import com.withwiz.simpleiot.simplicity.abstraction.IAbstractDevice;

/**
 * generic device class.<BR/>
 * created by greeun on 2018-03-01..
 */
public class AGenericDevice implements IAbstractDevice {
    /**
     * id
     */
    String id;

    /**
     * name
     */
    String name;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
