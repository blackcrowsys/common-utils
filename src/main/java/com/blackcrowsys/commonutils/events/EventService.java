package com.blackcrowsys.commonutils.events;

public interface EventService<V> {

    boolean submit(String service, String operation, V v);
}
