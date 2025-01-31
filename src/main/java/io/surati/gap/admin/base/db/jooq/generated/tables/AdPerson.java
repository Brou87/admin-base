/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.admin.base.db.jooq.generated.tables;


import io.surati.gap.admin.base.db.jooq.generated.Keys;
import io.surati.gap.admin.base.db.jooq.generated.Public;
import io.surati.gap.admin.base.db.jooq.generated.tables.records.AdPersonRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdPerson extends TableImpl<AdPersonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.ad_person</code>
     */
    public static final AdPerson AD_PERSON = new AdPerson();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdPersonRecord> getRecordType() {
        return AdPersonRecord.class;
    }

    /**
     * The column <code>public.ad_person.id</code>.
     */
    public final TableField<AdPersonRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.ad_person.name</code>.
     */
    public final TableField<AdPersonRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    private AdPerson(Name alias, Table<AdPersonRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdPerson(Name alias, Table<AdPersonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.ad_person</code> table reference
     */
    public AdPerson(String alias) {
        this(DSL.name(alias), AD_PERSON);
    }

    /**
     * Create an aliased <code>public.ad_person</code> table reference
     */
    public AdPerson(Name alias) {
        this(alias, AD_PERSON);
    }

    /**
     * Create a <code>public.ad_person</code> table reference
     */
    public AdPerson() {
        this(DSL.name("ad_person"), null);
    }

    public <O extends Record> AdPerson(Table<O> child, ForeignKey<O, AdPersonRecord> key) {
        super(child, key, AD_PERSON);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<AdPersonRecord, Long> getIdentity() {
        return (Identity<AdPersonRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AdPersonRecord> getPrimaryKey() {
        return Keys.AD_PERSON_PKEY;
    }

    @Override
    public List<UniqueKey<AdPersonRecord>> getKeys() {
        return Arrays.<UniqueKey<AdPersonRecord>>asList(Keys.AD_PERSON_PKEY);
    }

    @Override
    public AdPerson as(String alias) {
        return new AdPerson(DSL.name(alias), this);
    }

    @Override
    public AdPerson as(Name alias) {
        return new AdPerson(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdPerson rename(String name) {
        return new AdPerson(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdPerson rename(Name name) {
        return new AdPerson(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
