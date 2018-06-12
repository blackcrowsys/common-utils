package com.blackcrowsys.commonutils.events;

public interface EventProducer<V> {

    boolean submit(String service, String operation, V v);
}
