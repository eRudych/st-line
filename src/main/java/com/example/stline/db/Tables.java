/*
 * This file is generated by jOOQ.
*/
package com.example.stline.db;


import com.example.stline.db.tables.Messages;
import com.example.stline.db.tables.Photos;
import com.example.stline.db.tables.Posts;
import com.example.stline.db.tables.Products;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.messages</code>.
     */
    public static final Messages MESSAGES = com.example.stline.db.tables.Messages.MESSAGES;

    /**
     * The table <code>public.photos</code>.
     */
    public static final Photos PHOTOS = com.example.stline.db.tables.Photos.PHOTOS;

    /**
     * The table <code>public.posts</code>.
     */
    public static final Posts POSTS = com.example.stline.db.tables.Posts.POSTS;

    /**
     * The table <code>public.products</code>.
     */
    public static final Products PRODUCTS = com.example.stline.db.tables.Products.PRODUCTS;
}
