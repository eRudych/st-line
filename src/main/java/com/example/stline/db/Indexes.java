/*
 * This file is generated by jOOQ.
*/
package com.example.stline.db;


import com.example.stline.db.tables.Messages;
import com.example.stline.db.tables.Photos;
import com.example.stline.db.tables.Posts;
import com.example.stline.db.tables.Products;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index MESSAGES_PKEY = Indexes0.MESSAGES_PKEY;
    public static final Index PHOTOS_PKEY = Indexes0.PHOTOS_PKEY;
    public static final Index POSTS_PKEY = Indexes0.POSTS_PKEY;
    public static final Index PRODUCTS_PKEY = Indexes0.PRODUCTS_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index MESSAGES_PKEY = createIndex("messages_pkey", Messages.MESSAGES, new OrderField[] { Messages.MESSAGES.ID }, true);
        public static Index PHOTOS_PKEY = createIndex("photos_pkey", Photos.PHOTOS, new OrderField[] { Photos.PHOTOS.ID }, true);
        public static Index POSTS_PKEY = createIndex("posts_pkey", Posts.POSTS, new OrderField[] { Posts.POSTS.ID }, true);
        public static Index PRODUCTS_PKEY = createIndex("products_pkey", Products.PRODUCTS, new OrderField[] { Products.PRODUCTS.ID }, true);
    }
}