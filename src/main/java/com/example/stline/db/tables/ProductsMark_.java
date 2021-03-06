/*
 * This file is generated by jOOQ.
*/
package com.example.stline.db.tables;


import com.example.stline.db.Keys;
import com.example.stline.db.Public;
import com.example.stline.db.tables.records.ProductsMark_Record;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductsMark_ extends TableImpl<ProductsMark_Record> {

    private static final long serialVersionUID = -984617765;

    /**
     * The reference instance of <code>public.products_mark_</code>
     */
    public static final ProductsMark_ PRODUCTS_MARK_ = new ProductsMark_();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductsMark_Record> getRecordType() {
        return ProductsMark_Record.class;
    }

    /**
     * The column <code>public.products_mark_.id</code>.
     */
    public final TableField<ProductsMark_Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('products_mark__id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.products_mark_.name</code>.
     */
    public final TableField<ProductsMark_Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>public.products_mark_</code> table reference
     */
    public ProductsMark_() {
        this(DSL.name("products_mark_"), null);
    }

    /**
     * Create an aliased <code>public.products_mark_</code> table reference
     */
    public ProductsMark_(String alias) {
        this(DSL.name(alias), PRODUCTS_MARK_);
    }

    /**
     * Create an aliased <code>public.products_mark_</code> table reference
     */
    public ProductsMark_(Name alias) {
        this(alias, PRODUCTS_MARK_);
    }

    private ProductsMark_(Name alias, Table<ProductsMark_Record> aliased) {
        this(alias, aliased, null);
    }

    private ProductsMark_(Name alias, Table<ProductsMark_Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ProductsMark_Record, Long> getIdentity() {
        return Keys.IDENTITY_PRODUCTS_MARK_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductsMark_Record> getPrimaryKey() {
        return Keys.PRODUCTS_MARK__PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductsMark_Record>> getKeys() {
        return Arrays.<UniqueKey<ProductsMark_Record>>asList(Keys.PRODUCTS_MARK__PKEY, Keys.PRODUCTS_MARK__NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsMark_ as(String alias) {
        return new ProductsMark_(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsMark_ as(Name alias) {
        return new ProductsMark_(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductsMark_ rename(String name) {
        return new ProductsMark_(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductsMark_ rename(Name name) {
        return new ProductsMark_(name, null);
    }
}
