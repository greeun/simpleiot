package com.withwiz.simpleiot.simplicity.abstraction;

/**
 * abstract thing interface.<BR/>
 * created by greeun on 2018-03-01..
 */
public interface IAbstractThing<ID> {
    /**
     * return ID.<BR/>
     *
     * @return ID
     */
    ID getId();

    /**
     * return name.<BR/>
     *
     * @return name
     */
    String getName();
}
