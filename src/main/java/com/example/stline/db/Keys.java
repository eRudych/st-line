/*
 * This file is generated by jOOQ.
*/
package com.example.stline.db;


import com.example.stline.db.tables.Messages;
import com.example.stline.db.tables.Photos;
import com.example.stline.db.tables.Posts;
import com.example.stline.db.tables.Products;
import com.example.stline.db.tables.records.MessagesRecord;
import com.example.stline.db.tables.records.PhotosRecord;
import com.example.stline.db.tables.records.PostsRecord;
import com.example.stline.db.tables.records.ProductsRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<MessagesRecord, Long> IDENTITY_MESSAGES = Identities0.IDENTITY_MESSAGES;
    public static final Identity<PhotosRecord, Long> IDENTITY_PHOTOS = Identities0.IDENTITY_PHOTOS;
    public static final Identity<PostsRecord, Long> IDENTITY_POSTS = Identities0.IDENTITY_POSTS;
    public static final Identity<ProductsRecord, Long> IDENTITY_PRODUCTS = Identities0.IDENTITY_PRODUCTS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<MessagesRecord> MESSAGES_PKEY = UniqueKeys0.MESSAGES_PKEY;
    public static final UniqueKey<PhotosRecord> PHOTOS_PKEY = UniqueKeys0.PHOTOS_PKEY;
    public static final UniqueKey<PostsRecord> POSTS_PKEY = UniqueKeys0.POSTS_PKEY;
    public static final UniqueKey<ProductsRecord> PRODUCTS_PKEY = UniqueKeys0.PRODUCTS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<PhotosRecord, ProductsRecord> PHOTOS__FK_PHOTOS_PRODUCTS = ForeignKeys0.PHOTOS__FK_PHOTOS_PRODUCTS;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<MessagesRecord, Long> IDENTITY_MESSAGES = createIdentity(Messages.MESSAGES, Messages.MESSAGES.ID);
        public static Identity<PhotosRecord, Long> IDENTITY_PHOTOS = createIdentity(Photos.PHOTOS, Photos.PHOTOS.ID);
        public static Identity<PostsRecord, Long> IDENTITY_POSTS = createIdentity(Posts.POSTS, Posts.POSTS.ID);
        public static Identity<ProductsRecord, Long> IDENTITY_PRODUCTS = createIdentity(Products.PRODUCTS, Products.PRODUCTS.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<MessagesRecord> MESSAGES_PKEY = createUniqueKey(Messages.MESSAGES, "messages_pkey", Messages.MESSAGES.ID);
        public static final UniqueKey<PhotosRecord> PHOTOS_PKEY = createUniqueKey(Photos.PHOTOS, "photos_pkey", Photos.PHOTOS.ID);
        public static final UniqueKey<PostsRecord> POSTS_PKEY = createUniqueKey(Posts.POSTS, "posts_pkey", Posts.POSTS.ID);
        public static final UniqueKey<ProductsRecord> PRODUCTS_PKEY = createUniqueKey(Products.PRODUCTS, "products_pkey", Products.PRODUCTS.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<PhotosRecord, ProductsRecord> PHOTOS__FK_PHOTOS_PRODUCTS = createForeignKey(com.example.stline.db.Keys.PRODUCTS_PKEY, Photos.PHOTOS, "photos__fk_photos_products", Photos.PHOTOS.PRODUCT);
    }
}