package com.blackcrowsys.commonutils.events;

public interface EventService<V> {

    boolean submit(V v);
}
