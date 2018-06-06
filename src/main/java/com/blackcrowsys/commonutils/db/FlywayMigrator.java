package com.blackcrowsys.commonutils.db;

import org.flywaydb.core.Flyway;

public class FlywayMigrator implements Migration<Integer> {

    private Flyway flyway;

    public FlywayMigrator(Flyway flyway) {
        this.flyway = flyway;
    }

    @Override
    public Integer migrate() {
        return flyway.migrate();
    }
}
