/*
 * This file is generated by jOOQ.
 */
package com.example.stline.db.public_.tables;


import com.example.stline.db.public_.Indexes;
import com.example.stline.db.public_.Keys;
import com.example.stline.db.public_.Public;
import com.example.stline.db.public_.tables.records.ProductsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Products extends TableImpl<ProductsRecord> {

    private static final long serialVersionUID = 1568964307;

    /**
     * The reference instance of <code>public.products</code>
     */
    public static final Products PRODUCTS = new Products();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductsRecord> getRecordType() {
        return ProductsRecord.class;
    }

    /**
     * The column <code>public.products.id</code>.
     */
    public final TableField<ProductsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.products.product</code>.
     */
    public final TableField<ProductsRecord, String> PRODUCT = createField("product", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.products</code> table reference
     */
    public Products() {
        this(DSL.name("products"), null);
    }

    /**
     * Create an aliased <code>public.products</code> table reference
     */
    public Products(String alias) {
        this(DSL.name(alias), PRODUCTS);
    }

    /**
     * Create an aliased <code>public.products</code> table reference
     */
    public Products(Name alias) {
        this(alias, PRODUCTS);
    }

    private Products(Name alias, Table<ProductsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Products(Name alias, Table<ProductsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Products(Table<O> child, ForeignKey<O, ProductsRecord> key) {
        super(child, key, PRODUCTS);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRODUCTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductsRecord> getPrimaryKey() {
        return Keys.PRODUCTS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductsRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductsRecord>>asList(Keys.PRODUCTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Products as(String alias) {
        return new Products(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Products as(Name alias) {
        return new Products(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Products rename(String name) {
        return new Products(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Products rename(Name name) {
        return new Products(name, null);
    }
}