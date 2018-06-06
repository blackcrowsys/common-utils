package com.blackcrowsys.commonutils.db;

import org.flywaydb.core.Flyway;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class FlywayMigratorTests {

    private Migration<Integer> migration;

    @Mock
    private Flyway flyway;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        migration = new FlywayMigrator(flyway);
    }

    @Test
    public void testMigrating() {
        when(migration.migrate()).thenReturn(Integer.valueOf(0));
        Integer rc = migration.migrate();
        assertEquals(Integer.valueOf(0), rc);
    }
}
