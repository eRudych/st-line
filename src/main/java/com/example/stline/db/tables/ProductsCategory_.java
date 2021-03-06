/*
 * This file is generated by jOOQ.
*/
package com.example.stline.db.tables;


import com.example.stline.db.Keys;
import com.example.stline.db.Public;
import com.example.stline.db.tables.records.ProductsCategory_Record;

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
public class ProductsCategory_ extends TableImpl<ProductsCategory_Record> {

    private static final long serialVersionUID = 1609231786;

    /**
     * The reference instance of <code>public.products_category_</code>
     */
    public static final ProductsCategory_ PRODUCTS_CATEGORY_ = new ProductsCategory_();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductsCategory_Record> getRecordType() {
        return ProductsCategory_Record.class;
    }

    /**
     * The column <code>public.products_category_.id</code>.
     */
    public final TableField<ProductsCategory_Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('products_category__id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.products_category_.name</code>.
     */
    public final TableField<ProductsCategory_Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>public.products_category_</code> table reference
     */
    public ProductsCategory_() {
        this(DSL.name("products_category_"), null);
    }

    /**
     * Create an aliased <code>public.products_category_</code> table reference
     */
    public ProductsCategory_(String alias) {
        this(DSL.name(alias), PRODUCTS_CATEGORY_);
    }

    /**
     * Create an aliased <code>public.products_category_</code> table reference
     */
    public ProductsCategory_(Name alias) {
        this(alias, PRODUCTS_CATEGORY_);
    }

    private ProductsCategory_(Name alias, Table<ProductsCategory_Record> aliased) {
        this(alias, aliased, null);
    }

    private ProductsCategory_(Name alias, Table<ProductsCategory_Record> aliased, Field<?>[] parameters) {
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
    public Identity<ProductsCategory_Record, Long> getIdentity() {
        return Keys.IDENTITY_PRODUCTS_CATEGORY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductsCategory_Record> getPrimaryKey() {
        return Keys.PRODUCTS_CATEGORY__PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductsCategory_Record>> getKeys() {
        return Arrays.<UniqueKey<ProductsCategory_Record>>asList(Keys.PRODUCTS_CATEGORY__PKEY, Keys.PRODUCTS_CATEGORY__NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsCategory_ as(String alias) {
        return new ProductsCategory_(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsCategory_ as(Name alias) {
        return new ProductsCategory_(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductsCategory_ rename(String name) {
        return new ProductsCategory_(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductsCategory_ rename(Name name) {
        return new ProductsCategory_(name, null);
    }
}
