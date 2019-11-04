/*
 * This file is generated by jOOQ.
 */
package com.example.stline.db.public_;


import com.example.stline.db.DefaultCatalog;
import com.example.stline.db.public_.tables.Messages;
import com.example.stline.db.public_.tables.Photos;
import com.example.stline.db.public_.tables.Posts;
import com.example.stline.db.public_.tables.Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -503250814;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.messages</code>.
     */
    public final Messages MESSAGES = com.example.stline.db.public_.tables.Messages.MESSAGES;

    /**
     * The table <code>public.photos</code>.
     */
    public final Photos PHOTOS = com.example.stline.db.public_.tables.Photos.PHOTOS;

    /**
     * The table <code>public.posts</code>.
     */
    public final Posts POSTS = com.example.stline.db.public_.tables.Posts.POSTS;

    /**
     * The table <code>public.products</code>.
     */
    public final Products PRODUCTS = com.example.stline.db.public_.tables.Products.PRODUCTS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Messages.MESSAGES,
            Photos.PHOTOS,
            Posts.POSTS,
            Products.PRODUCTS);
    }
}
