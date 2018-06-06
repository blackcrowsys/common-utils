package com.blackcrowsys.commonutils.db;

public interface Migration<T> {

    /**
     * Interface used for migrating database versions..
     *
     * @return T the object returned after migration
     */
    T migrate();
}
